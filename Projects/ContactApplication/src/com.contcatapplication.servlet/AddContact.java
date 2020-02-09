package com.contcatapplication.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contcatapplication.bean.Contact;
import com.contcatapplication.dao.ContactDAO;

public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		Contact contact = new Contact(name,number,email);
		ContactDAO cd = new ContactDAO();
		//System.out.println(contact);
		cd.save(contact);
		
		response.sendRedirect("index.html");
	}
}
