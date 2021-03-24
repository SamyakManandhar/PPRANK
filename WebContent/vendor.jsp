<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="garima"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" type="text/css" href="css/mystyle2.css">
<link rel="stylesheet" type="text/css" href="css/mystyle6.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<!-- START HEADER INCLUDING TITLE -->
	<div class="head1">
		<div class="container-fluid">

			<b><center>PP RANK:Economically Selecting Initial Users for Influence Maximization in Social Networks</center></b>

		</div>
	</div>
	
	<div class="header">
		<div class="container">

			<div class="row head-nav">
				<div class="col-md-4">
					<img src="images/image20.png" style="height: 70px; width: 30%">

				</div>
				<div class="col-md-8">
					<div class="pull-right">
						<a href="index.jsp"><span class="glyphicon glyphicon-home"></span>HOME</a>
						<a href="#">ADMIN</a> <a href="#">VENDOR</a> <a
							href="#"><span class="glyphicon glyphicon-user"></span>USER</a>
							<a
							href="vendor-signin.jsp"><span class="glyphicon glyphicon-lock"></span>SIGN OUT</a>
						
		
							
					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- END HEADER -->
	<!-- CREATE A SMALL HEAD DIV -->
	<div class="head2">
	<div class="container">
	<div class="row">
	<div class="col-md-12"></div>
	</div>
	</div>
	</div>
	<!-- END HEAD DIV -->
	<!-- START CONTENT -->
	<br><br>
	<div class="content">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-3">
					<!-- list group -->
					<div class="list-group margin-b-3">
						<a href="#" class="active list-group-item">User Options</a>
						 <a href="add-product.jsp" class="list-group-item"><span class="glyphicon glyphicon-plus"><b>ADD PRODUCT</b></span>
							</a> 
							<a href="ViewProduct"
							class="list-group-item"><span class="glyphicon glyphicon-search"><b>VIEW PRODUCTS</b></span></a>
							 <a href="VendorProfile?username=${username}" class="list-group-item"><span class="glyphicon glyphicon-envelope"><b>MY PROFILE</b></span></a>
							
					</div>
					<div class="user-activity">
						<div class="panel panel-default">
							<div class="panel-heading">User Activities</div>
							<div class="panel-body">
								<h5 class="text-info">Welcome, ${username }</h5>
								<hr style="margin: 10px 0px;">
								
							</div>
						</div>
					</div>
				</div>
				<!-- Container (Services Section) -->
				<div class="col-md-9">
					<div id="user-services" class="text-center">





						<div class="row">
						<hr>
						<div class="col-sm-4 operation-thumbs">
							<span class="glyphicon glyphicon-plus logo-small"></span>
							<h4>
								<a href="add-product.jsp"><b>ADD PRODUCT</b></a>
							</h4>
							<p>Vendor can add the new products..</p>
						</div>
						<div class="col-sm-4 operation-thumbs">
							<span class="glyphicon glyphicon-user logo-small"></span>
							<h4>
								<a href="VendorProfile?username=${username}"><b>MY PROFILE</b></a>
							</h4>
							<p>Vendor can view his own profile..</p>
						</div>
						<div class="col-sm-4 operation-thumbs">
							<span class="glyphicon glyphicon-search logo-small"></span>
							<h4>
								<a href="ViewProduct"><b>VIEW PRODUCTS</b></a>
							</h4>
							<p>Vendor can  List all products..</p>
						</div></div>
						</div></div><br><br><br>
<center><a href="vendor-signin.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-home">BACK</a></center><br><br>
	
	<br><br><br><br><br>
	
	
<footer class="footer">
	<div class="container">
	<div class="row">
	<div class ="col-md-12">
	<center> Copyright@ Megainfoware</center>
	</div>
	</div>
	</div>
	</footer>
					</div>
				</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>