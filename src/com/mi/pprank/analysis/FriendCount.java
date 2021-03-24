package com.mi.pprank.analysis;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Servlet implementation class FriendCount
 */
@WebServlet("/FriendCount")
public class FriendCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FriendCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("image/png");
		ServletOutputStream os = response.getOutputStream();
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pprank", "root", "admin");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT username,count(username) from friend group by username");
			while (rs.next()) {
				String category = rs.getString(1);
				int marks = rs.getInt(2);
				dataset.addValue(marks, "Products", category);
			}
			JFreeChart barChart = ChartFactory.createBarChart3D("username", "auth",
					"Rating", dataset, PlotOrientation.VERTICAL, true, true, false);
			RenderedImage chartImage = barChart.createBufferedImage(1020, 650);
			ImageIO.write(chartImage, "png", os);
			os.flush();
			os.close();
		} catch (Exception i) {
			System.out.println(i);
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
