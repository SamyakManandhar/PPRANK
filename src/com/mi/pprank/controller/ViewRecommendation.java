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
import com.mi.pprank.dao.RecommendDao;
import com.mi.pprank.model.Product;
import com.mi.pprank.model.Recommend;

/**
 * Servlet implementation class ViewRecommendation
 */
@WebServlet("/ViewRecommendation")
public class ViewRecommendation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RecommendDao recommendDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRecommendation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Recommend> r1 = new ArrayList<Recommend>();
		recommendDao = new RecommendDao();
		r1 = recommendDao.Viewallrecommend();
		if(r1.isEmpty()){
			RequestDispatcher rd = request.getRequestDispatcher("all-recommends.jsp");
			request.setAttribute("emptyList", "List is Empty");
			rd.forward(request, response);
		}else{
			System.out.println("INVOKED");
			RequestDispatcher rd = request.getRequestDispatcher("all-recommends.jsp");
			request.setAttribute("recommendList", r1);
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
