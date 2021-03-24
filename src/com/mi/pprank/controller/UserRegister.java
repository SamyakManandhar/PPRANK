package com.mi.pprank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mi.pprank.dao.UserDao;
import com.mi.pprank.model.User;



/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
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
User u = new User();

		
		u.setEmail(request.getParameter("email"));
	
		u.setFirstname(request.getParameter("firstname"));
	    u.setHobbies(request.getParameter("hobbies"));
		u.setLastname(request.getParameter("lastname"));
		u.setLocation(request.getParameter("location"));
		u.setPassword(request.getParameter("password"));
		u.setPhone_number(request.getParameter("phone_number"));

		u.setUsername(request.getParameter("username"));
		//Part filePart = request.getPart("image");

		//InputStream inputStream = filePart.getInputStream();
		// response.setContentType("multipart/form-data");
		// System.out.println("Date of Joining : " +u.getDoj());

		userDao = new UserDao();
		int result = userDao.registerUser(u);
		System.out.println("res=" + result);
		if (result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("user-signin.jsp");
			request.setAttribute("message", "User registered successfully");
			request.setAttribute("username", u.getUsername());
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("user", u);
			rd.forward(request, response);
		}

	}

	
	}


