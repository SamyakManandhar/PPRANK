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
	<garima:set value="${productDetails}" var="product" />
						<br>
						
						
						<h4><center><b>All Productdetails List</b></center></h4>
						<hr>

						<!--  START DISPLAY-->
						<div class="col-md-4">
								<div class="cart-product-wrapper">
									
								<label>Product Name : </label>
										<strong class="h5">${product.productname }</strong><br>
										
										<label>Description : </label>
										<strong class="h5">${product.description }</strong><br>
										<label>Date : </label>
										<strong class="h5">${product.date }</strong><br>
										<label>Category : </label>
										<strong class="h5">${product.category }</strong><br>
										<label>Price : Rs</label>
										<strong class="h5">${product.price }</strong><br>
							
							

							<div class="row">
								<div class="col-md-12 text-center">
									<hr>
									<a href="user.jsp" class="btn btn-danger"
													data-toggle="tooltip" title="Back to all Products" data-placement="bottom">
													Back to Homepage
												</a>
									<!--a href="ProductCart?productname=${product.productname}"
													data-toggle="tooltip" title="Add to Cart" class="btn btn-danger" data-placement="bottom">
													Add to Cart 
													<span class="glyphicon glyphicon-shopping-cart"></span>
												</a-->
												
								</div>
							</div>
						</div>
					
</div>
</div>
</div></div>
<!-- START PRODUCTS RATING -->
<!-- RATE AND REVIEW OF THE PRODUCT -->
<div class="col-md-8">



<div class="row">
						<hr>
						<div class="col-md-12">
							
						</div>
					</div>
					<form action="RecommendRegister" method="post">
					
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label> From User Name :</label>
									<input type="text" class="form-control" name="fromusername" value="${username }"readonly="readonly">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label>User Name :</label>
									<input type="text" class="form-control" name="username">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label>Product Name :</label>
									<input type="text" class="form-control" name="productname" value="${product.productname}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label>Description:</label>
									<input type="text" class="form-control" name="description" value="${product.description}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label>Date:</label>
									<input type="date" class="form-control" name="date" value="${product.date}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label>Category:</label>
									<input type="text" class="form-control" name="category" value="${product.category}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label>Price:</label>
									<input type="text" class="form-control" name="price" value="${product.price}" readonly="readonly">
								</div>
							</div>
						</div>
						
						
						
						<div class="row">
							<div class="col-xs-12">
								<input type="submit" value="Recommend" class="btn btn-block btn-primary">
							</div>
						</div>
					</form>
					
          
												


</div>
</div></div>

	


</body>
</html>