package com.upc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dto.Departamento;
import com.upc.dto.Empleado;
import com.upc.factory.Factory;
import com.upc.service.IEmpleadoservice;

/**
 * Servlet implementation class ServletTarea
 */
@WebServlet({ "/insertEmpleado", "/listEmpleado" })
public class ServletEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IEmpleadoservice ese = null;
	private Empleado e = null;
	private Departamento d=null;
	
    @Override
	public void init() throws ServletException {		
		super.init();
		ese = Factory.getInstance().getEmpleadoservice();
		e = new Empleado();
		d=new Departamento();
	}

	public ServletEmpleado() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String path = request.getServletPath();

		try {
			if (path.equals("/insertEmpleado")) {
				insert(request, response);
			}else if(path.equals("/listEmpleado")){
				list(response);
			}
		} catch (Exception e) {
			
			System.out.println("Error:" + e.getMessage());
		}
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		e.setNombre(request.getParameter("nombre"));
		d.setIddepartamento(Integer.parseInt(request.getParameter("iddepartamento")));
		e.setDep(d);
		ese.create(e);
		list(response);
	}

	protected void list(HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		
		List<Empleado> lista=ese.getAll();
		out.println("<h1>Lista de Empleados</h1> </br>");
		out.println("Empleado--Departamento </br>");
		out.println("======================</br>");
		for (Empleado em : lista) {
			out.println(em.getNombre()+"--"+em.getDep().getNombre()+"</br>");
		}
		out.println("<a href=index.jsp>Inicio</a>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
