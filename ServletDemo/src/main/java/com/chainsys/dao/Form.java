package com.chainsys.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
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
	private List<FormDetails> list=new ArrayList<FormDetails>();
	public static int id;
	public static Form form1=new Form();
	//public List list;
     FormImpl formImpl1=new FormImpl();
     FormDetails formDetails1=new FormDetails();
       
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
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		formDetails1.setId(id);
		formDetails1.setName(name);
		formDetails1.setEmailId(emailId);
		formDetails1.setPhoneNumber(phoneNumber);
		System.out.println("get");
		try {
		 formImpl1.saveForm(formDetails1); 
		 
		}
		catch (ClassNotFoundException | SQLException e) {
	           // TODO Auto-generated catch block
	           e.printStackTrace();
	       }
		retrive(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void retrive(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		FormDetails formDetails1=new FormDetails();
		
		try {
			list=formImpl1.readForm(formDetails1);	
			request.setAttribute("list", list);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("FormTable.jsp");
	        dispatcher.forward(request, response);
			 
		}
		catch (ClassNotFoundException | SQLException e) {
	          
	           e.printStackTrace();
	       }
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String delete = request.getParameter("delete");
        if(delete != null && delete.equals("Delete"))
        {
        	String name=request.getParameter("deletename");
        	formDetails1.setName(name);
           
            try 
            {
            	
            	formImpl1.deleteForm(formDetails1);
                System.out.println("Row deleted");
            } 
            catch (ClassNotFoundException | SQLException e) 
            {
                e.printStackTrace();
            }
            try 
            {
            	list=formImpl1.readForm(formDetails1);
                System.out.println("Displayed successfully..");
            } 
            catch (ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
            request.setAttribute("list", list);
            request.getRequestDispatcher("FormTable.jsp").forward(request, response);
        }
       
	}

	}
	
	


