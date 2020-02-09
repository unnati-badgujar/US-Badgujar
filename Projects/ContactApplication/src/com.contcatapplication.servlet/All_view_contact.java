package com.contcatapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.contcatapplication.bean.Contact;
import com.contcatapplication.dao.ContactDAO;
public class All_view_contact extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer=response.getWriter();
		ContactDAO cd = new ContactDAO();
		List<Contact> contactList = cd.getAll();
		
		response.setContentType("text/html");
		//writer.write("<>");
		writer.write("<table border='1px solid'>");
		
		writer.write("<tr>");
			//writer.write("<td>ID</td>");
			writer.write("<td>NAME</td>");
			writer.write("<td>NUMBER</td>");
			writer.write("<td>EMAIL ID</td>");
			writer.write("<td>EDIT</td>");
			writer.write("<td>DELETE</td>");
			//writer.write("<td>ADD TO FAVOURITE</td>");
			writer.write("</tr>");
		for(Contact c:contactList) {
			//HttpSession session = request.getSession();
				writer.write("<tr>");
				//writer.write("<td>"+c.getId()+"</td>");
				writer.write("<td>"+c.getName()+"</td>");
				writer.write("<td>"+c.getNumber()+"</td>");
				writer.write("<td>"+c.getEmail()+"</td>");
				writer.write("<td><a href=\"EditContact?id="+c.getId()+"\"> Edit</a>"+"</td>");
				writer.write("<td><a href=\"DeleteContact?id="+c.getId()+"\">Delete</a>"+"</td>");
				writer.write("<td><input type=\"checkbox\" name=\"ID\" value=\"\" ></td>");
				writer.write("</tr>");			
			//	session.setAttribute("id", c.getId());

		}
		writer.write("</table>");
		writer.write("<a href='index.html'>want to go first page again</a>");
	}
}