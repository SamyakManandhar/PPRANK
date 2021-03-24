package com.mi.pprank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mi.pprank.dao.ProductDao;
import com.mi.pprank.model.Product;



/**
 * Servlet implementation class ProductRegister
 */
@WebServlet("/ProductRegister")
public class ProductRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDao productDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductRegister() {
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
Product p = new Product();

		
		p.setCategory(request.getParameter("category"));
		p.setDate(request.getParameter("date"));
	
		p.setDescription(request.getParameter("description"));
		p.setPrice(request.getParameter("price"));
		
		
		p.setProductname(request.getParameter("productname"));

		
		//Part filePart = request.getPart("image");

		//InputStream inputStream = filePart.getInputStream();
		// response.setContentType("multipart/form-data");
		// System.out.println("Date of Joining : " +u.getDoj());

		productDao = new ProductDao();
		int result = productDao.registerProduct(p);
		System.out.println("res=" + result);
		if (result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("add-product.jsp");
			request.setAttribute("message", "Product registered successfully");
			//request.setAttribute("username", u.getUsername());
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("product", p);
			rd.forward(request, response);
		}

	}

	

	}


