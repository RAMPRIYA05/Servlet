package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.FormDetails;
import com.chainsys.util.JdbcConnection;

public class FormImpl implements FormDAO{

	  FormDetails formDetails1=new FormDetails();

	

	@Override
	public void saveForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=JdbcConnection.getConnection();
		System.out.println(connection); 
		String addForm="insert into details(name,emailId,phoneNumber)values(?,?,?)";
		PreparedStatement prepareStatement=connection.prepareStatement(addForm);
		prepareStatement.setString(1,formDetails1.getName());
		prepareStatement.setString(2,formDetails1.getEmailId());
		prepareStatement.setString(3,formDetails1.getPhoneNumber());
		int rows=prepareStatement.executeUpdate();
	}	

}
