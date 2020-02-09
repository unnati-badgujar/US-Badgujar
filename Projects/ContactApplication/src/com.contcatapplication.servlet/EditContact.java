package com.contcatapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contcatapplication.bean.Contact;
import com.contcatapplication.dao.ContactDAO;

public class EditContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		String id = request.getParameter("id");
		int id_=Integer.parseInt(id);
		
		ContactDAO cd = new ContactDAO();
		response.setContentType("text/html");
		
		Contact contact=cd.getByID(id_);
		
		writer.write("<form action=\"UpdateContact\">");
		writer.write("Contact :<input type=text name=id value="+contact.getId()+" readonly=\"readonly\"><br><br>");
		writer.write("Name :<input type=\"text\" name=\"name\" value="+contact.getName()+"><br><br>");
		writer.write("Number :<input type=\"text\" name=\"number\" value="+contact.getNumber()+"><br><br>");
		writer.write("Email :<input type=\"text\" name=\"email\" value="+contact.getEmail()+"><br><br>");		
		writer.write("<button type =\"submit\">Submit</button>\r\n");
		//Contact contact_ = new Contact(contact.getId(),contact.getName(),contact.getNumber(),contact.getEmail());
		//writer.write("<td><a href=\"UpdateContact\">Click here to Update</a>"+"</td>");
		writer.write("</form>");
		//Contact con = new Contact(id_,contact.getName(),contact.getNumber(),contact.getEmail());
		//cd.editContact(con);

	}
}
