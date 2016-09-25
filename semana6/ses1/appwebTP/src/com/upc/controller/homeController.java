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

@WebServlet("/home")
public class homeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private categoriaModel cmodel = null;
	private String mensaje = null;
	private String destino = "/catalogo.jsp";

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		cmodel = new categoriaModel();
	}

	public homeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();

		try {
			if (path.equals("/home")) {

				mensaje = list(request, cmodel);

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
	
	protected String list(HttpServletRequest request, categoriaModel cmodel) throws SQLException {
		String error = null;

		List<Categoria> list = cmodel.Listarcategorias();

		if (list != null) {
			request.setAttribute("liscategorias", list);
		} else {
			error = "Sin acceso a Base de Datos";
		}

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
