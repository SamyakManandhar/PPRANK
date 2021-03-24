package com.mi.pprank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mi.pprank.dao.UserDao;
import com.mi.pprank.model.Vendor;


/**
 * Servlet implementation class ViewVendor
 */
@WebServlet("/ViewVendor")
public class ViewVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewVendor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Vendor> v1 = new ArrayList<Vendor>();
		userDao = new UserDao();
		v1 = userDao.Viewallvendor();
		if(v1.isEmpty()){
			RequestDispatcher rd = request.getRequestDispatcher("all-vendors.jsp");
			request.setAttribute("emptyList", "List is Empty");
			rd.forward(request, response);
		}else{
			System.out.println("INVOKED");
			RequestDispatcher rd = request.getRequestDispatcher("all-vendors.jsp");
			request.setAttribute("vendorList", v1);
			rd.forward(request, response);
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
