package com.mi.pprank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.mi.pprank.db.DConnection;
import com.mi.pprank.model.Product;
import com.mi.pprank.model.User;
import com.mi.pprank.model.Vendor;



public class UserDao {
	static Connection con = null;
	PreparedStatement ps = null;

	public int registerUser(User u) {
		String query = "insert into usersignup(username,firstname,lastname,phone_number,email,hobbies,location,password)"
				+ "values(?,?,?,?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getFirstname());
			
			ps.setString(3, u.getLastname());
			
			ps.setString(4, u.getPhone_number());
			ps.setString(5, u.getEmail());
			ps.setString(6, u.getHobbies());
			
			ps.setString(7, u.getLocation());
			ps.setString(8, u.getPassword());
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean checkCredentials(User u) {
		String query = "select * from usersignup where(username=? and password=?)";
		boolean flag=false;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				flag=true;
			}
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
	public List<User> Viewalluser(String username) {
		ArrayList<User> u1 = new ArrayList<User>();
		String query = "select * from usersignup where username NOT IN ('"+ username + "')";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();
				
				u.setAuth(rs.getInt("auth"));
				u.setEmail(rs.getString("email"));
				u.setFirstname(rs.getString("firstname"));
				u.setHobbies(rs.getString("hobbies"));
				
		        u.setLastname(rs.getString("lastname"));
		        u.setLocation(rs.getString("location"));
		        u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setUsername(rs.getString("username"));
				
				
				u1.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	public List<User> Viewalluserhabits() {
		ArrayList<User> u1 = new ArrayList<User>();
		String query = "SELECT * FROM usersignup where hobbies='dancing' OR hobbies='books'OR hobbies='reading' OR hobbies='adventure'";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();
				
				u.setEmail(rs.getString("email"));
				u.setFirstname(rs.getString("firstname"));
				
				
		        u.setLastname(rs.getString("lastname"));
		        u.setLocation(rs.getString("location"));
		        u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setUsername(rs.getString("username"));
				u.setHobbies(rs.getString("hobbies"));
				
				
				
				u1.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	
	
	
	
	public List<User> Viewalluserlocation() {
		ArrayList<User> u1 = new ArrayList<User>();
		String query = "SELECT * FROM usersignup where location='Bangalore' OR location='Mumbai'OR location='Chennai'";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();
				
				u.setEmail(rs.getString("email"));
				u.setFirstname(rs.getString("firstname"));
				
				
		        u.setLastname(rs.getString("lastname"));
		        u.setLocation(rs.getString("location"));
		        u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setUsername(rs.getString("username"));
				u.setHobbies(rs.getString("hobbies"));
				
				
				
				u1.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	public User getUserByUsername(String username) {
		String query = "select * from usersignup where username=?";
		User u = null;

		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = new User();
			    
				u.setEmail(rs.getString("email"));
				u.setFirstname(rs.getString("firstname"));
				u.setHobbies(rs.getString("hobbies"));
				u.setLastname(rs.getString("lastname"));
				u.setLocation(rs.getString("location"));
				u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setUsername(rs.getString("username"));
				
			
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	public int registerVendor(Vendor v) {
		String query = "insert into vendorsignup(username,firstname,lastname,phone_number,email,location,password)"
				+ "values(?,?,?,?,?,?,?)";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			ps.setString(1, v.getUsername());
			ps.setString(2, v.getFirstname());
			
			ps.setString(3, v.getLastname());
			
			ps.setString(4, v.getPhone_number());
			ps.setString(5, v.getEmail());
			
			ps.setString(6, v.getLocation());
			ps.setString(7, v.getPassword());
			
			
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean checkCredentials(Vendor v) {
		String query = "select * from vendorsignup where(username=? and password=?)";
		boolean flag=false;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");
			}
			ps = con.prepareStatement(query);
			ps.setString(1, v.getUsername());
			ps.setString(2, v.getPassword());
			
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				flag=true;
			}
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
	public Vendor getVendorByUsername(String username) {
		String query = "select * from vendorsignup where username=?";
		Vendor v = null;

		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				v= new Vendor();
			  
				v.setEmail(rs.getString("email"));
				v.setFirstname(rs.getString("firstname"));
				
				v.setLastname(rs.getString("lastname"));
				v.setLocation(rs.getString("location"));
				v.setPassword(rs.getString("password"));
				v.setPhone_number(rs.getString("phone_number"));
				v.setUsername(rs.getString("username"));
				
			
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	public Vendor getVendorByUsern(String username) {
		String query = "select * from vendorsignup where username=?";
		Vendor v = null;

		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				v = new Vendor();
				v.setEmail(rs.getString("email"));
				v.setFirstname(rs.getString("firstname"));
				v.setLastname(rs.getString("lastname"));
				v.setLocation(rs.getString("location"));
				v.setPassword(rs.getString("password"));
				v.setPhone_number(rs.getString("phone_number"));
				v.setUsername(rs.getString("username"));
				
			
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	public int update(Vendor v) {
		String query = "update vendorsignup set firstname=?,lastname=?,"
				+ "phone_number=?,email=?,location=?,password=? where username=?";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");

				ps = con.prepareStatement(query);
				ps.setString(1, v.getFirstname());
				ps.setString(2, v.getLastname());
				ps.setString(3, v.getPhone_number());
				ps.setString(4, v.getEmail());
				ps.setString(5, v.getLocation());
				ps.setString(6, v.getPassword());
				ps.setString(7, v.getUsername());
				
				

				result = ps.executeUpdate();
				ps.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int getVendorByUserna(String username) {
		String query = " delete from vendorsignup where username=?";
		Vendor v = null;
		int  rs = 0;
		try {
			con = DConnection.getConnection();

			ps = con.prepareStatement(query);
			
			ps.setString(1, username);
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
	public int upd(Vendor v) {
		String query = "update vendorsignup set firstname=?,lastname=?,"
				+ "phone_number=?,email=?,location=?,password=? where username=?";

		int result = 0;
		try {
			con = DConnection.getConnection();
			if (con != null) {
				System.out.println("Connection Success");

				ps = con.prepareStatement(query);
				ps.setString(1, v.getFirstname());
				ps.setString(2, v.getLastname());
				ps.setString(3, v.getPhone_number());
				ps.setString(4, v.getEmail());
				ps.setString(5, v.getLocation());
				ps.setString(6, v.getPassword());
				ps.setString(7, v.getUsername());
				
				

				result = ps.executeUpdate();
				ps.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Vendor> Viewallvendor() {
		ArrayList<Vendor> v1 = new ArrayList<Vendor>();
		String query = "select * from vendorsignup";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Vendor v = new Vendor();
				v.setEmail(rs.getString("email"));
				v.setFirstname(rs.getString("firstname"));
				
				v.setLastname(rs.getString("lastname"));
				v.setLocation(rs.getString("location"));
				v.setPassword(rs.getString("password"));
				
		        v.setPhone_number(rs.getString("phone_number"));
		        v.setUsername(rs.getString("username"));
		       
				
				
				v1.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v1;
	}
	public List<User> Viewalluser() {
		ArrayList<User> u1 = new ArrayList<User>();
		String query = "select * from usersignup";

		try {
			con = DConnection.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();
				
				u.setAuth(rs.getInt("auth"));
				u.setEmail(rs.getString("email"));
				u.setFirstname(rs.getString("firstname"));
				u.setHobbies(rs.getString("hobbies"));
				
		        u.setLastname(rs.getString("lastname"));
		        u.setLocation(rs.getString("location"));
		        u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setUsername(rs.getString("username"));
				
				
				u1.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	public boolean validateAuthentication(User u) {
		/*System.out.println(username+password);*/
		String query = "select * from usersignup where username='" + u.getUsername() + "' and password='" + u.getPassword()+ "' and auth = '1'" ;
		System.out.println("DATA IN DAO" +query);
		boolean flag = false;
		try {
			con = DConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			/*ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();*/
			if (rs.next()) {
				flag = true;
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println( "FLAG : " +flag);
		return flag;
}
}



