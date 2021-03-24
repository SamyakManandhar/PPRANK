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
<link rel="stylesheet" type="text/css" href="css/mystyle3.css">
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
	<garima:set value="${vendorDetails}" var="vendor" />
						<br>
						
						
						<h4><center><b>MY PROFILE</b></center></h4>
						<hr>

						<!--  START DISPLAY-->
						<div class="col-md-4">
								<div class="cart-product-wrapper">
									
								<label>User Name : </label>
										<strong class="h5">${vendor.username }</strong><br>
										
										<label>First Name : </label>
										<strong class="h5">${vendor.firstname }</strong><br>
										<label>Last Name : </label>
										<strong class="h5">${vendor.lastname }</strong><br>
										<label>Phone Number : </label>
										<strong class="h5">${vendor.phone_number }</strong><br>
										<label>Email : </label>
										<strong class="h5">${vendor.email }</strong><br>
										<label>Location : </label>
										<strong class="h5">${vendor.location }</strong><br>
										<label>Password: </label>
										<strong class="h5">${vendor.password }</strong><br>
							
							

							<div class="row">
								<div class="col-md-12 text-center">
									<hr>
									<a href="vendor.jsp" class="btn btn-danger"
													data-toggle="tooltip" title="Back to my Homepage" data-placement="bottom">
													Back to My Homepage
												</a>
												<a href="Edit?username=${vendor.username}"><span class="glyphicon glyphicon-edit"></span>Edit
											</a>
											<a href="Delete?username=${vendor.username}">
												<span class="glyphicon glyphicon-trash"></span>Delete
											</a>
									
								</div>
							</div>
						</div>
					
</div>
</div>
</div></div>

</body>
</html>