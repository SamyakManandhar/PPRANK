<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<br><br>
	<div class="content">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-3">
					<!-- list group -->
					<div class="list-group margin-b-3">
						<a href="#" class="active list-group-item">User Options</a>
						 
							<a href="ViewOverall"
							class="list-group-item"><span class="glyphicon glyphicon-list"><b>VIEW ALL OVERALL REVIEWS</b></span></a>
							 <a href="ViewPositiveReview" class="list-group-item"><span class="glyphicon glyphicon-star"><b>VIEW POSITIVE REVIEWS</b></span></a>
							<a href="ViewNegativeReview" class="list-group-item"><span class="glyphicon glyphicon-star"><b>VIEW NEGATIVE REVIEWS</b></span></a>
							
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





						<h2 class="text-info"></h2>
						<h4 class="text-info">User Activities</h4>
						<div class="row">
							<hr>
							<div class="col-sm-4 operation-thumbs">
								<span class="glyphicon glyphicon-star logo-small"></span>
								<h4>
									<a href="ViewOverall"><b>VIEW ALL OVERALL REVIEWS</b></a>
								</h4>
								<p>All Overall Reviews of Products</p>
							</div>
							<!-- FONT AWESOME ICONS -->
							
							<div class="col-sm-4 operation-thumbs">
								<span class="glyphicon glyphicon-thumbs-up logo-small"></span>
								<h4>
									<a href="ViewPositiveReview"><b>POSITIVE REVIEWS</b></a>
								</h4>
								<p>All Positive Reviews</p>
							</div>
							<div class="col-sm-4 operation-thumbs">
								<span class="glyphicon glyphicon-thumbs-down logo-small"></span>
								<h4>
									<a href="ViewNegativeReview"><b>NEGATIVE REVIEWS</b></a>
								</h4>
								<p>All Negative Reviews</p>
							</div><br><br><br><br><br><br><br><br>
							<!--div class="col-sm-4 operation-thumbs">
								<span class="glyphicon glyphicon-bell logo-small"></span>
								<h4>
									<a href="analysis.jsp"><b>NOTIFICATIONS</b></a>
								</h4>
								<p>Notifications Update</p>
							</div--><br><br><br><br>
      <center><a href="user.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-home">BACK</a></center>                         
</body>
</html>