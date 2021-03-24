package com.mi.pprank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.mi.pprank.db.DConnection;
import com.mi.pprank.model.FriendRequest;



public class FriendRequestDao {
	static Connection con = null;
	PreparedStatement ps = null;

	public int registerFriendRequest(FriendRequest f) {
		String query = "insert into friend(fromusername,username,email,phone_number)"
				+ "values(?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			ps.setString(1, f.getFromusername());
			ps.setString(2, f.getUsername());
			
			ps.setString(3, f.getEmail());
			
			ps.setString(4, f.getPhone_number());
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<FriendRequest> Viewallfriendrequest() {
		ArrayList<FriendRequest> f1 = new ArrayList<FriendRequest>();
		String query = "select * from friend";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FriendRequest f = new FriendRequest();
				f.setAuth(rs.getInt("auth"));
				f.setEmail(rs.getString("email"));
				f.setFromusername(rs.getString("fromusername"));
				f.setPhone_number(rs.getString("phone_number"));
			    f.setUsername(rs.getString("username"));
		
				
				
				f1.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f1;
	}
	public List<FriendRequest>loadFriend(String username) {
		ArrayList<FriendRequest> list = new ArrayList<FriendRequest>();
		String query = "select * from friend where username=? AND auth='1'";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FriendRequest f = new FriendRequest();
				f.setEmail(rs.getString("email"));
				f.setFromusername(rs.getString("fromusername"));
				f.setPhone_number(rs.getString("phone_number"));
			    f.setUsername(rs.getString("username"));
		
				
				
				list.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			
		}
		return list;
	}
	
	public FriendRequest getFriendRequestByUsername(String username) {
		String query = "select * from friend where username='"+username+"'";
		FriendRequest fr = null;

		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				fr = new FriendRequest();
				fr.setEmail(rs.getString("email"));
				fr.setFromusername(rs.getString("fromusername"));
				fr.setPhone_number(rs.getString("phone_number"));
				fr.setUsername(rs.getString("username"));
				
				
			
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fr;
	}
	public List<FriendRequest> loadFriendRequest(String username) {
		ArrayList<FriendRequest> list = new ArrayList<FriendRequest>();
		String query = "SELECT * FROM friend WHERE username = ? ";
		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				FriendRequest friendRequest = new FriendRequest();
				friendRequest.setEmail(rs.getString("email"));
				friendRequest.setFromusername(rs.getString("fromusername"));
				friendRequest.setPhone_number(rs.getString("phone_number"));
				friendRequest.setUsername(rs.getString("username"));
				

				list.add(friendRequest);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			
		}
		return list;
	}
}

