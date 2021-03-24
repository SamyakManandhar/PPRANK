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
import org.jfree.data.general.DefaultPieDataset;

/**
 * Servlet implementation class HighestRecommendation
 */
@WebServlet("/HighestRecommendation")
public class HighestRecommendation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HighestRecommendation() {
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
		DefaultPieDataset dataset = new DefaultPieDataset();
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pprank", "root", "admin");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT productname,count(productname) from productrating group by productname");
			while (rs.next()) {
				dataset.setValue(rs.getString(1), Double.parseDouble(rs.getString(2)));
			}

			JFreeChart chart = ChartFactory.createPieChart3D("Products", dataset, true, true, false);
			RenderedImage chartImage1 = chart.createBufferedImage(640, 480);
			ImageIO.write(chartImage1, "png", os);
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
		response.setContentType("image/png");
		ServletOutputStream os = response.getOutputStream();

		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("IPhone 5s", new Double(20));
		dataset.setValue("SamSung Grand", new Double(20));
		dataset.setValue("MotoG", new Double(40));
		dataset.setValue("Nokia Lumia", new Double(10));

		JFreeChart chart = ChartFactory.createPieChart("Users", // chart
																		// title
				dataset, // data
				true, // include legend
				true, false);

		RenderedImage chartImage = chart.createBufferedImage(640, 480);
		ImageIO.write(chartImage, "png", os);
		os.flush();
		os.close();

	}

	}


