package com.mi.pprank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mi.pprank.dao.UserDao;
import com.mi.pprank.model.User;


/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
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
		HttpSession session=request.getSession();
		User u = new User();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		// u.setFirstname(request.getParameter(arg0));
		userDao = new UserDao();
		boolean isvaliduser = userDao.checkCredentials(u);
		boolean isAuthenticated=userDao.validateAuthentication(u);

		if (!isAuthenticated) {
			RequestDispatcher rd = request.getRequestDispatcher("user-signin.jsp");
			request.setAttribute("messageError", "Authentication failed");
			rd.forward(request, response);
		}

		else if (isvaliduser && isAuthenticated) {
			System.out.println("valid");
			//response.setContentType("multipart/form-data");
			
			RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
			request.setAttribute("message", "login successfull");
			
			//session.setAttribute("blobimage", isvalidUser.getImageBlob());
			session.setAttribute("username", u.getUsername());/*
			session.setAttribute("userId", userDAO.getUserID(username));*/
			rd.forward(request, response);

		} else {

			RequestDispatcher rd = request.getRequestDispatcher("Signin.jsp");
			request.setAttribute("messageError", "Invalid Username and Password!");
			rd.forward(request, response);
		}
		
	}

	}


