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
							href="index.jsp"><span class="glyphicon glyphicon-lock"></span>SIGN OUT</a>
						
		
							
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
	<garima:set value="${recommendDetails}" var="recommend" />
						<br>
						
						
						<h4><center><b>All Recommendations List</b></center></h4>
						<hr>

						<!--  START DISPLAY-->
						<div class="col-md-4">
								<div class="cart-product-wrapper">
									<div class="cart-product">
									
								</div>
								       <label>From Name : </label>
										<strong class="h5">${recommend.fromusername }</strong><br>
								
										<label>User Name : </label>
										<strong class="h5">${recommend.username }</strong><br>
										<label>Product Name : </label>
										<strong class="h5">${recommend.productname }</strong><br>
										<label>Description : </label>
										<strong class="h5">${recommend.description }</strong><br>
										<label>Date : </label>
										<strong class="h5">${recommend.date }</strong><br>
										<label>Category : </label>
										<strong class="h5">${recommend.category }</strong><br>
										<label>Price : </label>
										<strong class="h5">${recommend.price }</strong><br>
								<garima:choose>
								<garima:when test ="${recommend.auth==0}">
								<label>Recommendation :<a href="validaterecommend.jsp?username=${recommend.username}&name=${recommend.fromusername}&productname=${recommend.productname}">Waiting</a></label>
								</garima:when>
								<garima:otherwise><label> :Authenticated</garima:otherwise>
								</garima:choose>
							
							

							<div class="row">
								<div class="col-md-12 text-center">
									<hr>
									
								</div>
							</div>
						</div>
					
</div>

<center><a href="user.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-home">BACK</a></center>

</body>
</html>