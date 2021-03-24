package com.mi.pprank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mi.pprank.dao.UserDao;
import com.mi.pprank.model.Vendor;



/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		System.out.println(username);
	      userDao=new UserDao();
		Vendor v=userDao.getVendorByUsername(username);
		if(v!=null){
			RequestDispatcher rd=request.getRequestDispatcher("edit-vendor.jsp");
			request.setAttribute("vendorList",v);
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("edit-vendor.jsp");
			request.setAttribute("message error","no data found");
			rd.forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Vendor v=new Vendor();
		v.setEmail(request.getParameter("email"));
		v.setFirstname(request.getParameter("firstname"));
		v.setLastname(request.getParameter("lastname"));
        v.setLocation(request.getParameter("location"));
		v.setPassword(request.getParameter("password"));
		v.setPhone_number(request.getParameter("phone_number"));
		v.setUsername(request.getParameter("username"));
		
		 userDao=new UserDao();
		int result =userDao.update(v);
		if(result==1){
			RequestDispatcher rd=request.getRequestDispatcher("edit-vendor.jsp");
			request.setAttribute("vendor",v);
			rd.forward(request, response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			request.setAttribute("message error","no data found");
			rd.forward(request, response);
			
		}
		}
	}


