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
 * Servlet implementation class UserRecommend
 */
@WebServlet("/UserRecommend")
public class UserRecommend extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RecommendDao recommendDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRecommend() {
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
	      recommendDao=new RecommendDao();
		Recommend r=recommendDao.getRecommendByUsername(username);
		if(r!=null){
			RequestDispatcher rd=request.getRequestDispatcher("all-userrecommend.jsp");
			request.setAttribute("recommendDetails",r);
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("all-userrecommend.jsp");
			request.setAttribute("message error","no data found");
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
