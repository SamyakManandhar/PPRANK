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
import com.mi.pprank.model.User;

/**
 * Servlet implementation class ViewUserHabits
 */
@WebServlet("/ViewUserHabits")
public class ViewUserHabits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUserHabits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> u1 = new ArrayList<User>();
		userDao = new UserDao();
		u1 = userDao.Viewalluserhabits();
		if(u1.isEmpty()){
			RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
			request.setAttribute("emptyList", "List is Empty");
			rd.forward(request, response);
		}else{
			System.out.println("INVOKED");
			RequestDispatcher rd = request.getRequestDispatcher("allusers-habits.jsp");
			request.setAttribute("userList", u1);
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
