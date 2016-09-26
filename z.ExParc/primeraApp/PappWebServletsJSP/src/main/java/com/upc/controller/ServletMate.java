package com.upc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.factory.Factory;
import com.upc.service.PIMateservice;
import com.upc.service.impl.Mateservice;

/**
 * Servlet implementation class ServletMate
 */
//EN ESTE PUNTO se realiza el mapeo Servlet (luego de borrar)
@WebServlet({"/Basico","/Factorial"}) 

public class ServletMate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// AQUI SE IMPLEMENTA LA SALIDA REAL DE INFORMACION AL HTML
		String path = request.getServletPath();
		if (path.equals("/Basico")) {
			Basico(request,response);
		}else
			if (path.equals("/Factorial")) {
				Factorial(request,response);
			}
	}
 
	protected void Basico(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacion = null;int opera=0;int rpta=0,n1=0,n2=0;		
		try {  //este es manejo de excepciones		
			//INGRESO
			//:: se capturan datos con REQUEST y en String (por ello parse)
			opera= Integer.parseInt(request.getParameter("ControHTML1"));
			n1= Integer.parseInt(request.getParameter("ControHTML2"));
			n2= Integer.parseInt(request.getParameter("ControHTML3"));
			
			//PROCESO:: el controlador llama al SERVICIO INTERFAZ
			// interfaz     variable      instancia impl
			//OJO LUEGO DE FACTORY, CAMBIA AH..!! Y NO USAS NEWWWWW
			PIMateservice Iservicio = Factory.obtenerInstanciaFactory().obtenerMateservice(); //new Mateservice();
			if (opera==1) {
				operacion="suma";rpta=Iservicio.suma(n1, n2);
			} else 
				if (opera==2) {
					operacion="Producto";rpta=Iservicio.producto(n1, n2);
				}else{
					operacion="No tengo es operacion";rpta=0;
				}
		} catch (Exception e) {
			// TODO: handle exception
			operacion=" ERROR, ERES UN BRUTO";rpta=0;
		}
			//SALIDA:
			//implementar metodo para imprimir la salida RESPONSE
			PrintWriter salida=response.getWriter();
			//este es el tipo de respuesta a devolver.
		    response.setContentType("text/html");
		    salida.println("n1:"+n1+"</br>");
		    salida.println("n2:"+n2+"</br>");
		    salida.println("Operacion: "+operacion+"</br>");	
		    salida.println("rpta: "+rpta+"</br>");  
	}		
	
	
	
	
	protected void Factorial(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacion = null;
		int n1=0;long rpta=0;		
		try {  //este es manejo de excepciones		
			//INGRESO
			//:: se capturan datos con REQUEST y en String (por ello parse)
		n1= Integer.parseInt(request.getParameter("ControHTML1facto"));
			//PROCESO:: el controlador llama al SERVICIO INTERFAZ
			// interfaz     variable      instancia impl
			PIMateservice Iservicio = Factory.obtenerInstanciaFactory().obtenerMateservice();//new Mateservice();
			rpta=Iservicio.factorial(n1);
		} catch (Exception e) {
			// TODO: handle exception
			operacion="ERROR, ERES UN BRUTO";rpta=0;
		}
			//SALIDA:
			//implementar metodo para imprimir la salida RESPONSE
			PrintWriter salida=response.getWriter();
			//este es el tipo de respuesta a devolver.
		    response.setContentType("text/html");
		    salida.println("n1:"+n1+"</br>");	
		    salida.println("rpta"+rpta+"</br>");		
	}

	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
