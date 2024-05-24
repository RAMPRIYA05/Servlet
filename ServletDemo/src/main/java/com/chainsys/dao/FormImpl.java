package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.model.FormDetails;
import com.chainsys.util.JdbcConnection;

public class FormImpl implements FormDAO{

	public static String name;
	public static String emailId;
	public static String phoneNumber;
	  FormDetails formDetails1=new FormDetails();

	
	  List<FormDetails> list=new ArrayList<>();
	@Override
	public void saveForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=JdbcConnection.getConnection();
		System.out.println(connection); 
		String addForm="insert into details(id,name,emailId,phoneNumber)values(?,?,?,?)";
		PreparedStatement prepareStatement=connection.prepareStatement(addForm);
		prepareStatement.setInt(1,formDetails1.getId());
		prepareStatement.setString(2,formDetails1.getName());
		prepareStatement.setString(3,formDetails1.getEmailId());
		prepareStatement.setString(4,formDetails1.getPhoneNumber());
		int rows=prepareStatement.executeUpdate();
		System.out.println(rows);
	}



	@Override
	public void updateForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=JdbcConnection.getConnection();
		System.out.println(connection); 
		String update="UPDATE details SET name=?,emailId=?,phoneNumber=? WHERE id=?";
		PreparedStatement prepareStatement=connection.prepareStatement(update);
		
		prepareStatement.setString(1,formDetails1.getName());
		prepareStatement.setString(2,formDetails1.getEmailId());
		prepareStatement.setString(3,formDetails1.getPhoneNumber());
		prepareStatement.setInt(4,formDetails1.getId());
		int rows=prepareStatement.executeUpdate();
		System.out.println(rows+"Updated");
		
	}


	@Override
	public void deleteForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=JdbcConnection.getConnection();
		System.out.println(connection); 
		String delete="DELETE from details where name=?";

		PreparedStatement prepareStatement=connection.prepareStatement(delete);
		prepareStatement.setString(1,formDetails1.getName());
		int rows=prepareStatement.executeUpdate();
		System.out.println(rows+"Deleted");
		
	}

   

	@Override
	public List<FormDetails> readForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
	
		Connection connection = JdbcConnection.getConnection();
  	    System.out.println(connection);
  	    String read="SELECT * FROM details";
  	    PreparedStatement prepareStatement = connection.prepareStatement(read);
        ResultSet rows = prepareStatement.executeQuery(read);

        while(rows.next())
        {
        	FormDetails formdetails1=new FormDetails();
        	formdetails1.setId(rows.getInt(1));
        	formdetails1.setName(rows.getString(2));
        	formdetails1.setEmailId(rows.getString(3));
        	formdetails1.setPhoneNumber(rows.getString(4));
        	list.add(formdetails1);

        }
        
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return list;
	}	
	
	
  
}
