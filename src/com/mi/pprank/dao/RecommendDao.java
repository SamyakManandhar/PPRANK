package com.mi.pprank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mi.pprank.db.DConnection;

import com.mi.pprank.model.Rating;
import com.mi.pprank.model.Recommend;

public class RecommendDao {
	static Connection con = null;
	PreparedStatement ps = null;

	public int registerRecommend(Recommend r) {
		String query = "insert into recommendfriend(fromusername,username,productname,description,date,category,price)"
				+ "values(?,?,?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			
			ps.setString(1, r.getFromusername());
			
			ps.setString(2, r.getUsername());
			
			ps.setString(3, r.getProductname());
			ps.setString(4, r.getDescription());
			ps.setString(5, r.getDate());
			ps.setString(6, r.getCategory());
			ps.setString(7, r.getPrice());
			
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Recommend> Viewallrecommend() {
		ArrayList<Recommend> r1 = new ArrayList<Recommend>();
		String query = "select * from recommendfriend";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Recommend r = new Recommend();
				r.setAuth(rs.getInt("auth"));
				r.setCategory(rs.getString("category"));
				r.setDate(rs.getString("date"));
		        r.setDescription(rs.getString("description"));
		        r.setFromusername(rs.getString("fromusername"));
				r.setPrice(rs.getString("price"));
				r.setProductname(rs.getString("productname"));
				r.setUsername(rs.getString("username"));
				
				
				r1.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1;
	}
	public List<Recommend> Viewallpricerecommend() {
		ArrayList<Recommend> r1 = new ArrayList<Recommend>();
		String query = "select * from recommendfriend where price='20000'";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Recommend r = new Recommend();
				r.setCategory(rs.getString("category"));
				r.setDate(rs.getString("date"));
		        r.setDescription(rs.getString("description"));
		        r.setFromusername(rs.getString("fromusername"));
				r.setPrice(rs.getString("price"));
				r.setProductname(rs.getString("productname"));
				r.setUsername(rs.getString("username"));
				
				
				r1.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1;
	}
	public int registerRecommendC(Recommend r) {
		String query = "insert into pricerecommendfriend(fromusername,username,productname,description,date,category,price)"
				+ "values(?,?,?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			
			ps.setString(1, r.getFromusername());
			
			ps.setString(2, r.getUsername());
			
			ps.setString(3, r.getProductname());
			ps.setString(4, r.getDescription());
			ps.setString(5, r.getDate());
			ps.setString(6, r.getCategory());
			ps.setString(7, r.getPrice());
			
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Recommend> Viewallpricefriendrecommend() {
		ArrayList<Recommend> r1 = new ArrayList<Recommend>();
		String query = "select * from pricerecommendfriend";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Recommend r = new Recommend();
				r.setCategory(rs.getString("category"));
				r.setDate(rs.getString("date"));
		        r.setDescription(rs.getString("description"));
		        r.setFromusername(rs.getString("fromusername"));
				r.setPrice(rs.getString("price"));
				r.setProductname(rs.getString("productname"));
				r.setUsername(rs.getString("username"));
				
				
				r1.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1;
	}
	public int registerRating(Rating r) {
		String query = "insert into productrating(productname,username,rating,title,message,date)"
				+ "values(?,?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			
			ps.setString(1, r.getProductname());
			ps.setString(2, r.getUsername());
			
			ps.setString(3, r.getRating());
			
			ps.setString(4, r.getTitle());
			ps.setString(5, r.getMessage());
			ps.setString(6, r.getDate());
			
			
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
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
	public Recommend getRecommendByUsername(String username) {
		String query = "select * from recommendfriend where username=?";
		Recommend r = null;

		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				r = new Recommend();
				r.setAuth(rs.getInt("auth"));
				r.setCategory(rs.getString("category"));
				r.setDate(rs.getString("date"));
				r.setDescription(rs.getString("description"));
				r.setFromusername(rs.getString("fromusername"));
				r.setPrice(rs.getString("price"));
				r.setProductname(rs.getString("productname"));
				r.setUsername(rs.getString("username"));
				
				
			
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}
