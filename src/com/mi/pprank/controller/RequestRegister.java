package com.mi.pprank.controller;

import java.io.IOException;

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
 * Servlet implementation class RequestRegister
 */
@WebServlet("/RequestRegister")
public class RequestRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FriendRequestDao friendRequestDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestRegister() {
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
		FriendRequest f = new FriendRequest();

		f.setEmail(request.getParameter("email"));
		
		f.setFromusername(request.getParameter("fromusername"));
		
		f.setPhone_number(request.getParameter("phone_number"));
	
		f.setUsername(request.getParameter("username"));
		
	    
		//Part filePart = request.getPart("image");

		//InputStream inputStream = filePart.getInputStream();
		// response.setContentType("multipart/form-data");
		// System.out.println("Date of Joining : " +u.getDoj());

		friendRequestDao = new FriendRequestDao();
		int result = friendRequestDao.registerFriendRequest(f);
		System.out.println("res=" + result);
		if (result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("message", "User registered successfully");
			request.setAttribute("username", f.getUsername());
			request.setAttribute("fromusername", f.getFromusername());
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("friendrequest", f);
			rd.forward(request, response);
		}

	}
	}


