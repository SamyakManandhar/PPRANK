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

import com.mi.pprank.dao.ProductDao;
import com.mi.pprank.dao.UserDao;
import com.mi.pprank.model.Rating;
import com.mi.pprank.model.User;

/**
 * Servlet implementation class ViewOverall
 */
@WebServlet("/ViewOverall")
public class ViewOverall extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDao productDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewOverall() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Rating> r1 = new ArrayList<Rating>();
		productDao = new ProductDao();
		r1 = productDao.Viewallrating();
		if(r1.isEmpty()){
			RequestDispatcher rd = request.getRequestDispatcher("all-reviews.jsp");
			request.setAttribute("emptyList", "List is Empty");
			rd.forward(request, response);
		}else{
			System.out.println("INVOKED");
			RequestDispatcher rd = request.getRequestDispatcher("all-reviews.jsp");
			request.setAttribute("reviewList", r1);
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
