package com.upc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dto.Categoria;
import com.upc.model.categoriaModel;

/**
 * Servlet implementation class categoriaController
 */
@WebServlet({ "/insertc", "/listc", "/updatec", "/deletec", "/readc", "/newc", "/editc", "/removec" })
public class categoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private categoriaModel cmodel = null;
	private String mensaje = null;
	private String destino = "/panelc.jsp";

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		cmodel = new categoriaModel();	
	}

	public categoriaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();

		try {
			if (path.equals("/newc")) {//Llama a una vista
				destino = "createc.jsp";// estas son las VISTAS
			} else if (path.equals("/insertc")) {//insert BD
				//insert(request);
				//mensaje = list(request, cmodel);
				destino = "/panelc.jsp";
				
			} else if (path.equals("/editc")) {//Llama a una vista
				read(request, cmodel);
				destino = "/updatec.jsp";
			}else if (path.equals("/updatec")) {//update BD
					update(request);
					mensaje = list(request, cmodel);
					destino = "/panelc.jsp";
				 
				
			} else if (path.equals("/removec")) {//Llama a una vista
				read(request, cmodel);
				destino = "/deletec.jsp";				
			} else if (path.equals("/deletec")) {//Delete en una BD
				delete(request);
				mensaje = list(request, cmodel);
				destino = "/panelc.jsp";
			
			}else if (path.equals("/listc")) {//Lista todos dato BD
				mensaje = list(request, cmodel);
				destino = "/panelc.jsp";
			} else if (path.equals("/readc")) {//Muestra dato seleccionado
				read(request, cmodel);
				destino = "readc.jsp";
			}

			if (mensaje != null) {
				request.setAttribute("mensaje", mensaje);
			} else {
				request.removeAttribute("mensaje");
			}

			System.out.println(path);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);

	}

	protected void insert(HttpServletRequest request) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		
	}

	protected void update(HttpServletRequest request) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		//TODO

	}

	protected void delete(HttpServletRequest request) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		
	}

	protected String list(HttpServletRequest request, categoriaModel cmodel) throws SQLException {
		String error = null;

		List<Categoria> list = cmodel.Listarcategorias();

		if (list != null) {
			
			//paso de la lista de categoria a la vista..!!! usanado el OBJETO REQUEST
			request.setAttribute("liscategorias", list);
		} else {
			error = "Sin acceso a Base de Datos";
		}

		return error;
	}

	protected String read(HttpServletRequest request, categoriaModel cmodel) throws SQLException {
		String error = null;
		
		//TODO
		return error;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
