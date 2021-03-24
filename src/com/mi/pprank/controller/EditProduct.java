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
 * Servlet implementation class EditProduct
 */
@WebServlet("/EditProduct")
public class EditProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDao productDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productname=request.getParameter("productname");
		System.out.println(productname);
	      productDao=new ProductDao();
		Product p=productDao.getProductByProductname(productname);
		if(p!=null){
			RequestDispatcher rd=request.getRequestDispatcher("edit-product.jsp");
			request.setAttribute("productList",p);
			rd.forward(request,response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("edit-product.jsp");
			request.setAttribute("message error","no data found");
			rd.forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setCategory(request.getParameter("category"));
		p.setDate(request.getParameter("date"));
		p.setDescription(request.getParameter("description"));
        p.setPrice(request.getParameter("price"));
		
		p.setProductname(request.getParameter("productname"));
		
		 productDao=new ProductDao();
		int result =productDao.update(p);
		if(result==1){
			RequestDispatcher rd=request.getRequestDispatcher("edit-product.jsp");
			request.setAttribute("product",p);
			rd.forward(request, response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
			request.setAttribute("message error","no data found");
			rd.forward(request, response);
			
		}
		}
	}


