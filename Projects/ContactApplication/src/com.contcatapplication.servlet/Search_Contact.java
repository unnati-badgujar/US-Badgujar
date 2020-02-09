package com.contcatapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contcatapplication.bean.Contact;
import com.contcatapplication.dao.ContactDAO;

public class Search_Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String email = request.getParameter("email");

		ContactDAO cd = new ContactDAO();
		response.setContentType("text/html");
		Contact contact=cd.SearchContact(name,number,email);

		if(contact.getId()!=0)
		{
			writer.write("");
			writer.write("Contact :<input type=text name=id value="+contact.getId()+" readonly=\"readonly\"><br><br>");
			writer.write("Name :<input type=\"text\" name=\"name\" value="+contact.getName()+" readonly=\"readonly\" ><br><br>");
			writer.write("Number :<input type=\"text\" name=\"number\" value="+contact.getNumber()+" readonly=\"readonly\" ><br><br>");
			writer.write("Email :<input type=\"text\" name=\"email\" value="+contact.getEmail()+" readonly=\"readonly\" ><br><br>");	
			writer.write("<a href=\"index.html\">Home Page</a>");
		}
		else {
			writer.write("<h3>No Record Found</h3><br>");
			writer.write("<a href=\"index.html\">Home Page</a>");
		}
	}
}
