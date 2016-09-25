package com.upc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dto.Universidad;
import com.upc.factory.Factory;
import com.upc.service.IUniversidadservice;

/**
 * Servlet implementation class ServletUniversidad
 */

@WebServlet({"/insertUniversidad","/listUniversidad"})

public class ServletUniversidad extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	//////ESTOY LLENANDO DESDE ACA :V CONTROLADOR FACTORY SERVICE(modelo)
	IUniversidadservice service = Factory.getInstance().getUniversidadservice();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUniversidad() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String path = request.getServletPath();
		
		try {
			if (path.equals("/insertUniversidad")) {
				//proceso
				insert(request, response);
				query(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void query(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		List<Universidad>list=service.getAll();
		
		for(Universidad u:list){
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>"+u.getIduniversidad()+"</td>");
			out.println("<td>"+u.getNombre()+"</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		
	}
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String nombre =request.getParameter("txtnombre");
		Universidad u= new Universidad();
		u.setNombre(nombre);
		service.create(u);
		
		
	}
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
