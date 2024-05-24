package com.chainsys.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.model.FormDetails;

/**
 * Servlet implementation class UpdateForm
 */
@WebServlet("/UpdateForm")
public class UpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<FormDetails> list=new ArrayList<FormDetails>();
	FormImpl formImpl1=new FormImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);
		FormDetails formDetails1=new FormDetails();
		
		String id=request.getParameter("id");
		int id1=Integer.parseInt(id);
	    formDetails1.setId(id1);
	    String name=request.getParameter("name");
	    formDetails1.setName(name);
	    String emailId=request.getParameter("emailId");
	    formDetails1.setEmailId(emailId);
	    String phoneNumber=request.getParameter("phoneNumber");
	    formDetails1.setPhoneNumber(phoneNumber); 
	    
	    try {
	    	formImpl1.updateForm(formDetails1);
	    	
	    }
	    catch(ClassNotFoundException | SQLException e){
	    	e.printStackTrace();
	    }
	    try {
			list=formImpl1.readForm(formDetails1);	
			
	        
			 
		}
		catch (ClassNotFoundException | SQLException e) {
	          
	           e.printStackTrace();
	       }
	    request.setAttribute("list", list);
	    RequestDispatcher dispatcher = request.getRequestDispatcher("FormTable.jsp");
        dispatcher.forward(request, response);
	}

}
