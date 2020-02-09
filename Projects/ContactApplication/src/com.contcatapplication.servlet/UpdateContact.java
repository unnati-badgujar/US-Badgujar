package com.contcatapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contcatapplication.bean.Contact;
import com.contcatapplication.dao.ContactDAO;

public class UpdateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.write("Successfully update");
		
		String id = request.getParameter("id");
		int id_=Integer.parseInt(id);
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String email = request.getParameter("email");

		Contact c=new Contact();
		c.setId(id_);
		c.setName(name);
		c.setNumber(number);
		c.setEmail(email);
		
		ContactDAO cd = new ContactDAO();
		Contact contact = new Contact(c.getId(),c.getName(),c.getNumber(), c.getEmail());
		
		System.out.println(contact);
		cd.editContact(contact);
		
		response.sendRedirect("index.html");
	}
}
