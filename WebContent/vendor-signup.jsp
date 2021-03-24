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
						<a href="#">ADMIN</a> <a href="#">VENDOR</a> <a
							href="#"><span class="glyphicon glyphicon-user"></span>USER</a>
						
		
							
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
	<p>
<div class="content">
			<h4>
			<center><b>	Sign Up For New User</b></center>
			</h4>
			<br><br>
		
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				
			</div>
			<div class="col-md-6">
				
				<div class="reg-page-wrapper">
					
					<hr style="margin:0px;">
					<form method="post" action="VendorRegister">
						<div class="reg-form">
							<div class="row">
								<div class="col-md-12">
									<label>
										User Name : <span class="text-red">*</span>
									</label>
									<input type="text" required="required" class="form-control" name="username">
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>
										First Name : <span class="text-red">*</span>
									</label>
									<input type="text" required="required" class="form-control" name="firstname">
								</div>
								
								<div class="col-md-6">
									<label>
										Last Name : <span class="text-red">*</span>
									</label>
									<input type="text" class="form-control" name="lastname">
								</div>
							</div>
							
							<div class="row">
								<div class="col-md-6">
									<label>
										Phone Number : <span class="text-red">*</span>
									</label>
									<input name="phone_number" class="form-control" required="required" maxlength="10">
								</div>
								<div class="col-md-6">
									<label>
										Email : <span class="text-red">*</span>
									</label>
									<input name="email" class="form-control" required="required">
								</div>
							
							
								<div class="col-md-6">
									<label>
										Location : <span class="text-red">*</span>
									</label>
									<select name="location" class="form-control">
										<option value="">-- Select --</option>
										<option value="Bangalore">Bangalore</option>
										<option value="Mumbai">Mumbai</option>
										<option value="Chennai">Chennai</option>
										
									</select>
								</div>
								
							
							<div class="row">
								<div class="col-md-6">
									<label>
										Password : <span class="text-red">*</span>
									</label>
									<input type="password" name="password" class="form-control" required="required">
								</div>
								
								
							</div>
							<div class="row">
								<div class="col-md-12 text-center">
									<hr>
									<input type="submit" name="submit" value="Submit" class="btn btn-primary">
									<input type="reset" value="Clear" class="btn btn-default">
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
			
				
		<hr>
		<p>
<center><a href="vendor-signin.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-home">BACK</a></center>
</div>
	</div>
	</div><br><br>
<footer class="footer">
	<div class="container">
	<div class="row">
	<div class ="col-md-12">
	<center> Copyright@ Megainfo</center>
	
	</footer>
			</div>
		</div>
		
	<br>
	
	
	</div>
	</div>
	</p>

</body>
</html>