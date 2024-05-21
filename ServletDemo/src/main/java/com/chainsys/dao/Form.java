package com.chainsys.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.model.FormDetails;



/**
 * Servlet implementation class form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
     FormImpl formImpl1=new FormImpl();
	//private ArrayList<details> list=new ArrayList<details>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		FormDetails formDetails1=new FormDetails();
		String name=request.getParameter("name");
		String emailId=request.getParameter("emailId");
		String phoneNumber=request.getParameter("phoneNumber");
		PrintWriter out=response.getWriter();
		out.println(name);
		out.println(emailId);
		out.println(phoneNumber);
		formDetails1.setName(name);
		formDetails1.setEmailId(emailId);
		formDetails1.setPhoneNumber(phoneNumber);
		//System.out.println("get");
		try {
			formImpl1.saveForm(formDetails1);
//			 PrintWriter writer = response.getWriter();
//			 writer.println(formDetails1.getName() + "added");
//			 writer.println(formDetails1.getEmailId() + "added");
//			 writer.println(formDetails1.getPhoneNumber() + "added");
			 
		}
		catch (ClassNotFoundException | SQLException e) {
	           // TODO Auto-generated catch block
	           e.printStackTrace();
	       }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
