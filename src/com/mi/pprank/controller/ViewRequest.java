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

import com.mi.pprank.dao.FriendRequestDao;
import com.mi.pprank.dao.UserDao;
import com.mi.pprank.model.FriendRequest;
import com.mi.pprank.model.User;

/**
 * Servlet implementation class ViewRequest
 */
@WebServlet("/ViewRequest")
public class ViewRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FriendRequestDao friendRequestDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String username=request.getParameter("username");
		List<FriendRequest> f1 = new ArrayList<FriendRequest>();
		String username=request.getParameter("username");
		friendRequestDao = new FriendRequestDao();
		f1 = friendRequestDao.loadFriendRequest(username);
		if(f1.isEmpty()){
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("emptyList", "List is Empty");
			rd.forward(request, response);
		}else{
			System.out.println("INVOKED");
			RequestDispatcher rd = request.getRequestDispatcher("all-friends.jsp");
			request.setAttribute("friendrequestList", f1);
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
