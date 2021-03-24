package com.mi.pprank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mi.pprank.dao.FriendRequestDao;
import com.mi.pprank.model.FriendRequest;



/**
 * Servlet implementation class RequestDetails
 */
@WebServlet("/RequestDetails")
public class RequestDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FriendRequestDao friendRequestDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDetails() {
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
	      friendRequestDao=new FriendRequestDao();
		FriendRequest fr=friendRequestDao.getFriendRequestByUsername(username);
		if(fr!=null){
			RequestDispatcher rd=request.getRequestDispatcher("all-request.jsp");
			request.setAttribute("friendRequestDetails",fr);
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("all-request.jsp");
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
