package com.contcatapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.contcatapplication.bean.Contact;

public class ContactDAO {
	
	public void save(Contact contact) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");		
			String query ="INSERT INTO contact(name,number,email) VALUES (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getNumber());
			pst.setString(3, contact.getEmail());
			
			pst.executeUpdate();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Contact> getAll(){
		List<Contact> myContact = new ArrayList<Contact>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");		
			String query ="SELECT * FROM contact";
			
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contact.setEmail(rs.getString("email"));
				myContact.add(contact);
			}
		}
		catch (Exception e) {

		}
		return myContact;
	}
	
	public void editContact(Contact contact) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");		
			String query ="UPDATE contact SET name=?,number=?,email=? WHERE id=?";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getNumber());
			pst.setString(3, contact.getEmail());
			pst.setInt(4, contact.getId());
			
			pst.executeUpdate();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public Contact getByID(int id){
		Contact contact = new Contact();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");		
			String query ="SELECT id,name,number,email FROM contact WHERE id=?";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contact.setEmail(rs.getString("email"));
			}
		}
		catch (Exception e) {

		}
		return contact;
	}
	
	public void deleteContact(int id) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");		
			String query ="DELETE FROM contact WHERE id=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
		
			pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Contact SearchContact(String name, String number, String email){
		Contact contact = new Contact();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");		
			String query ="SELECT * FROM contact WHERE name=? or number=? or email=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, number);
			pst.setString(3, email);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contact.setEmail(rs.getString("email"));
			}
		}
		catch (Exception e) {

		}
		return contact;
	}

}
