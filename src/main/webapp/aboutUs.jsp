<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--  
<meta charset="ISO-8859-1">
-->
<title>AboutUs</title>
<%@include file="includes/head.jsp"%>
<style>
body{
margin:0px;
padding:0px;
width:100%;
}
.home-newsletter{
	background-color:#343a40;
	color:white;
}

.home-newsletter .row{
	width:100%;
}
.home-newsletter .form-control{
	height:50px;
	border-color:transparent;
	border-radius:20px 0 0 20px;
}
.home-newsletter .btn{
	min-height:50px;
	border-radius:0 20px 20px 0;
	background-color:green;
	color:#fff;
}

</style>

</head>
<body>
	<!-- Navbar -->
	<%@include file="includes/navbar.jsp"%>

	<!-- Main body of about us page (breadscrumb section) -->
	<section class="breadcrumbs-section">
		<div class="container p-1 p-sm-3">
			<div class="row">
				<div class="col-12">
					<h2>About Us</h2>
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
						<li class="breadcrumb-item active">About Us</li>
					</ol>
				</div>
			</div>
		</div>
	</section>

	<!-- Main body of about us page (breadscrumb section) -->
	<section class="about-company-section">
		<div class="container p-1 p-sm-3">
			<div class="row">
				<div class="col-12 text-center">
					<h2>Welcome To TwiceInch Company</h2>
					<hr />
				</div>
				<div class="col-md-3">
					<img class="img-fluid" src="images/logos.png" alt="">

				</div>
				<div class="col-md-9">
					<p>Lorem
						sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
						ssdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
						ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
						eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
						qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
						dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd

					</p>
					<p>Lorem
						sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
						ssdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
						ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
						eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
						qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
						dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd

					</p>
					
				</div>
			</div>
		</div>
	</section>

	<!-- NewsLetter subscription section -->
	<section class="home-newsletter p-2 pt-md-2 pb-md-2">
		<div class="row">
			<div class="col-12 text-center">
				<h4>Subscribe to our Newsletter</h4>
				<div class="input-group p-1">
					<input type="email" class="form-control"
						placeholder="Provide us your email"> 
						<span class="input-group-btn">
						<button type="submit" class="btn btn-theme">Subscribe</button>
					</span>
				</div>
			</div>
		</div>

	</section>

	<!--Our team section -->
	<section class="pt-3 pb-4">
	
		<div class="container">
			<div class="row mt-4">
				<div class="col text-center">
					<h3>Our Awesome Team</h3>
				</div>
			</div>
		</div>
		<hr>
		
		<div class="row">
			<div class="col-md-4 text-center">
				<img class="img-fluid quanlities-img p-4" src="images/Logo3.png">
				<h5>CEO</h5>
				<p>Ashley aaaaa</p>
			</div>
			
			<div class="col-md-4 text-center">
				<img class="img-fluid quanlities-img p-4" src="images/Logo3.png">
				<h5>CEO</h5>
				<p>Ashley aaaaa</p>
			</div>
			
			<div class="col-md-4 text-center">
				<img class="img-fluid quanlities-img p-4" src="images/Logo3.png">
				<h5>CEO</h5>
				<p>Ashley aaaaa</p>
			</div>
			
			<div class="col-md-4 text-center">
				<img class="img-fluid quanlities-img p-4" src="images/Logo3.png">
				<h5>CEO</h5>
				<p>Ashley aaaaa</p>
			</div>
			
			<div class="col-md-4 text-center">
				<img class="img-fluid quanlities-img p-4" src="images/Logo3.png">
				<h5>CEO</h5>
				<p>Ashley aaaaa</p>
			</div>
			
			<div class="col-md-4 text-center">
				<img class="img-fluid quanlities-img p-4" src="images/Logo3.png">
				<h5>CEO</h5>
				<p>Ashley aaaaa</p>
			</div>
		</div>

	</section>


	<!-- Footer -->
	<%@include file="includes/footer.jsp"%>

</body>
</html>