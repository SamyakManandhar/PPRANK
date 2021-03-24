package com.mi.pprank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.mi.pprank.db.DConnection;
import com.mi.pprank.model.Product;
import com.mi.pprank.model.Rating;



public class ProductDao {
	static Connection con = null;
	PreparedStatement ps = null;

	public int registerProduct(Product p) {
		String query = "insert into product(productname,description,date,category,price)"
				+ "values(?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			
			ps.setString(1, p.getProductname());
			
			ps.setString(2, p.getDescription());
			
			ps.setString(3, p.getDate());
			ps.setString(4, p.getCategory());
			ps.setString(5, p.getPrice());
			
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Product> Viewallproduct() {
		ArrayList<Product> p1 = new ArrayList<Product>();
		String query = "select * from product";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setCategory(rs.getString("category"));
				p.setDate(rs.getString("date"));
		        p.setDescription(rs.getString("description"));
		        p.setPrice(rs.getString("price"));
				p.setProductname(rs.getString("productname"));
				
				
				p1.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p1;
	}
	public Product getProductByProductname(String productname) {
		String query = "select * from product where productname=?";
		Product p = null;

		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, productname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p = new Product();
				p.setCategory(rs.getString("category"));
				p.setDate(rs.getString("date"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getString("price"));
				p.setProductname(rs.getString("productname"));
				
			
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public int update(Product p) {
		String query = "update product set description=?,date=?,"
				+ "category=?,price=? where productname=?";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");

				ps = con.prepareStatement(query);
				ps.setString(1, p.getCategory());
				ps.setString(2, p.getDate());
				ps.setString(3, p.getDescription());
				ps.setString(4, p.getPrice());
				ps.setString(5, p.getProductname());
				
				
				

				result = ps.executeUpdate();
				ps.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int getProductByProductn(String productname) {
		String query = " delete from product where productname=?";
		Product p = null;
		int  rs = 0;
		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, productname);
			  rs = ps.executeUpdate();
/*			if (rs.next()) {
				u = new User();
				u.setDob(rs.getString("dob"));
				u.setDoj(rs.getString("doj"));
				u.setEmail(rs.getString("email"));
				u.setFirstname(rs.getString("firstname"));
				u.setGender(rs.getString("gender"));
				u.setLastname(rs.getString("lastname"));
				u.setMiddlename(rs.getString("middlename"));
				u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setUsername(rs.getString("username"));
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
}
	public int upd(Product p) {
		String query = "update product set description=?,date=?,"
				+ "category=?,price=? where productname=?";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");

				ps = con.prepareStatement(query);
				ps.setString(1, p.getCategory());
				ps.setString(2, p.getDate());
				ps.setString(3, p.getDescription());
				ps.setString(4, p.getPrice());
				ps.setString(5, p.getProductname());
				
				

				result = ps.executeUpdate();
				ps.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int registerProductC(Product p) {
		String query = "insert into cart(productname,description,date,category,price)"
				+ "values(?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			
			ps.setString(1, p.getProductname());
			
			ps.setString(2, p.getDescription());
			
			ps.setString(3, p.getDate());
			ps.setString(4, p.getCategory());
			ps.setString(5, p.getPrice());
			
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Product> Viewallcart() {
		ArrayList<Product> p1 = new ArrayList<Product>();
		String query = "select * from cart";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setCategory(rs.getString("category"));
				p.setDate(rs.getString("date"));
		        p.setDescription(rs.getString("description"));
		        p.setPrice(rs.getString("price"));
				p.setProductname(rs.getString("productname"));
				
				
				p1.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p1;
}
	public List<Rating> Viewallrating() {
		ArrayList<Rating> r1 = new ArrayList<Rating>();
		String query = "select * from productrating";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Rating r = new Rating();
				r.setDate(rs.getString("date"));
				r.setMessage(rs.getString("message"));
		        r.setProductname(rs.getString("productname"));
		        r.setRating(rs.getString("rating"));
				r.setTitle(rs.getString("title"));
				r.setUsername(rs.getString("username"));
				
				
				r1.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1;
}
	public List<Rating> Viewallpositivereviews() {
		ArrayList<Rating> r1 = new ArrayList<Rating>();
		String query = "select * from productrating where rating='3' OR rating='4' OR rating='5'";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Rating r = new Rating();
				r.setDate(rs.getString("date"));
				r.setMessage(rs.getString("message"));
				r.setProductname(rs.getString("productname"));
				r.setRating(rs.getString("rating"));
				r.setTitle(rs.getString("title"));
				r.setUsername(rs.getString("username"));
				
				r1.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1;
	}
	public List<Rating> Viewallnegativereviews() {
		ArrayList<Rating> r1 = new ArrayList<Rating>();
		String query = "select * from productrating where rating='1' OR rating='2'";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Rating r = new Rating();
				r.setDate(rs.getString("date"));
				r.setMessage(rs.getString("message"));
		        r.setProductname(rs.getString("productname"));
		        r.setRating(rs.getString("rating"));
				r.setTitle(rs.getString("title"));
				
				
				r1.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1;
	}
}
