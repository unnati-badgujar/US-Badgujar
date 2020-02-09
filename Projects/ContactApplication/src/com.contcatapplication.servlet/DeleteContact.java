package com.contcatapplication.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contcatapplication.dao.ContactDAO;

public class DeleteContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpSession session = request.getSession();
		//int id=(int) session.getAttribute("id");
		
		String id = request.getParameter("id");
		int id_=Integer.parseInt(id);
		
		ContactDAO cd = new ContactDAO();
		response.setContentType("text/html");
		cd.deleteContact(id_);
		response.sendRedirect("index.html");
	}
}
