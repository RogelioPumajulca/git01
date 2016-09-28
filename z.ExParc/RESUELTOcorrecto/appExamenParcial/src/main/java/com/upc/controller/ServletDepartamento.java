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
import com.upc.factory.Factory;
import com.upc.service.IDepartamentoservice;

/**
 * Servlet implementation class ServletProyecto
 */
@WebServlet({ "/insertDepartamento", "/listDepartamento" })
public class ServletDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;

//INICIO1: codigo agregado  
	private IDepartamentoservice sdep=null;
	private Departamento d=null;
    // agregalo ESTE INIT a traves SOURCE..es un INI 
    @Override
	public void init() throws ServletException {
		super.init();
		sdep=Factory.getInstance().getDepartamentoservice();
		d=new Departamento();		
	}

    public ServletDepartamento() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String path=request.getServletPath();
		
		try {
			if(path.equals("/insertDepartamento")){
				insert(request, response);
			}else if(path.equals("/listDepartamento")){
				list(response);
			}
		} catch (Exception e) {
			
			System.out.println("Error:"+e.getMessage());
		}
	}

	protected void insert(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		d.setNombre(request.getParameter("nombre"));
		
		sdep.create(d);
		
		list(response);
		
	}
	
	protected void list(HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		List<Departamento> lista=sdep.getAll();
		out.println("<h1>Lista de Departamentos</h1> </br>");
		out.println("Codigo--Departamento </br>");
		out.println("=====================</br>");
		for (Departamento de : lista) {
			out.println(de.getIddepartamento()+"--"+de.getNombre()+"</br>");
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
