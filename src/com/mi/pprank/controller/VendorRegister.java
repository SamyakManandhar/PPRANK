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
 * Servlet implementation class VendorRegister
 */
@WebServlet("/VendorRegister")
public class VendorRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	Vendor v = new Vendor();

	v.setEmail(request.getParameter("email"));
	v.setFirstname(request.getParameter("firstname"));
	v.setLastname(request.getParameter("lastname"));
	v.setLocation(request.getParameter("location"));
	v.setPassword(request.getParameter("password"));
	v.setPhone_number(request.getParameter("phone_number"));
	
	v.setUsername(request.getParameter("username"));
	
		
		userDao = new UserDao();
		int result = userDao.registerVendor(v);
		System.out.println("res=" + result);
		if (result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("vendor-signin.jsp");
			request.setAttribute("message", "Vendor registered successfully");
			request.setAttribute("username", v.getUsername());
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("vendor", v);
			rd.forward(request, response);
		}

	}

	}


