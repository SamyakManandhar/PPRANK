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
<link rel="stylesheet" href="css/mystyle5.css">

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
						<a href="#">ADMIN</a> <a href="vendor-signin.jsp">VENDOR</a> <a
							href="#"><span class="glyphicon glyphicon-user"></span>USER</a>
							<a
							href="vendor-signup.jsp"><span class="glyphicon glyphicon-off"></span>NEW VENDOR</a>
						
		
							
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
	<div class="content">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					
				</div>
				<div class="col-md-6">
					<div class="form-wrapper">
						<div class="row">
							<div class="col-md-4">
								<div class="left-part">
									<br>
									<h4>Sign In</h4>
								</div>
							</div>
							<div class="col-md-8">
								<div class="right-part">
									<br>
									<h4>Please fill up the details...</h4>
								</div>
								<div class="reg-form">
									<form action="VendorLogin" method="post">
										<div class="row">
											<div class="col-md-12 input">
												<label class="label">
													Username : 
												</label>
												<input type="text" name="username" required="required" placeholder="Enter Username">
											</div>
										</div>
										<div class="row">
											<div class="col-md-12 input">
												<label class="label">
													Password : 
												</label>
												<input type="password" name="password" required="required" placeholder="Enter Password">
											</div>
										</div>
										<div class="row">
											<div class="col-md-12">
												<input type="submit" value="Login" class="login-btn">
												
												<!-- <div class="row">
													<div class="col-md-8">
														<div class="row">
															<div class="col-md-4">
																4
															</div>
															<div class="col-md-4">
															4
															</div>
															<div class="col-md-4">
															4
															</div>
														</div>
													</div>
													<div class="col-md-4">
													4
													</div>
												</div> -->
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
				
				</div>
			</div>
		</div>
	</div>
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