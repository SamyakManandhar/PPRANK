package com.mi.pprank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mi.pprank.dao.RecommendDao;
import com.mi.pprank.model.Recommend;

/**
 * Servlet implementation class PriceRecommendRegister
 */
@WebServlet("/PriceRecommendRegister")
public class PriceRecommendRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private RecommendDao recommendDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PriceRecommendRegister() {
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
		Recommend r = new Recommend();

		r.setCategory(request.getParameter("category"));
		r.setDate(request.getParameter("date"));
		
		r.setDescription(request.getParameter("description"));
	
		r.setFromusername(request.getParameter("fromusername"));
	    r.setPrice(request.getParameter("price"));
		r.setProductname(request.getParameter("productname"));
		r.setUsername(request.getParameter("username"));
		
		
		//Part filePart = request.getPart("image");

		//InputStream inputStream = filePart.getInputStream();
		// response.setContentType("multipart/form-data");
		// System.out.println("Date of Joining : " +u.getDoj());

		recommendDao = new RecommendDao();
		int result = recommendDao.registerRecommendC(r);
		System.out.println("res=" + result);
		if (result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("message", "User registered successfully");
			request.setAttribute("username", r.getUsername());
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("recommend", r);
			rd.forward(request, response);
		}

	}
	

	}


