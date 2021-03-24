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
						<a href="admin-signin.jsp">ADMIN</a> <a href="vendor-signin.jsp">VENDOR</a> <a
							href="user-signin.jsp"><span class="glyphicon glyphicon-user"></span>USER</a>
						
		
							
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
	
	<!--  START CONTENT-->
	<div class="image_slider">
		<div class="container">
			<div class="row">
			<div class="w3-content w3-section" style="max-width:1000px">
  <img class="mySlides" src="images/image21.jpg" style=" height:200px;width:1000px">
  <img class="mySlides" src="images/image14.jpg" style="height:200px;width:1000px">
  <img class="mySlides" src="images/image15.jpg" style="height:200px;width:1000px">
  <img class="mySlides" src="images/image16.jpg" style="height:200px;width:1000px">
  <img class="mySlides" src="images/image17.png" style=" height:200px;width:1000px">
  <img class="mySlides" src="images/image18.jpg" style="height:200px;width:1000px">
  <img class="mySlides" src="images/image19.jpg" style="height:200px;width:1000px">
  <img class="mySlides" src="images/image13.jpg" style="height:200px;width:1000px">
</div>
<br>
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
					</script>
				</div>
			</div>
		</div>
	</div>
	<br>
	<!--END IMAGE SLIDER  -->
	<!--  START CONTENT-->
	<div class="content">
		<div class="container">
			<div class="row">
				<div class="col-md-12"></div>
				<h4><b><center>ABSTRACT</center></b></h4>
				
				<br>
				<div class="col-md-12">
				
				<h5>ONLINE user-generated reviews are of great practical use, because: 1) They have become an inevitable part of decision making process of consumers on product purchases, hotel bookings, etc. 2) They collectively form a lowcost and efﬁcient feedback channel, which helps businesses to keep track of their reputations and to improve the quality of their products and services. As a matter of fact, online reviews are constantly growing in quantity, while varying l
argely in content quality. To support users in digesting the huge amount of raw review data, many sentiment analysis techniques have been developed for past years .Generally, sentiments and opinions can be analyzed at different levels of granularity. To support users in digesting the huge amount of raw review data, many sentiment analysis techniques have been developed for past years .Generally, sentiments and opinions can be analyzed at different levels of granularity. 
 </h5>
			</div>
			
			</div>
		</div>
	</div>
	<!-- END CONTENT -->
	<!--  START FOOTER-->
	<footer class="footer">
	<div class="container">
	<div class="row">
	<div class ="col-md-12">
	<center> Copyright@ Megainfo</center>
	</div>
	</div>
	</div>
	</footer>

</body>
</html>