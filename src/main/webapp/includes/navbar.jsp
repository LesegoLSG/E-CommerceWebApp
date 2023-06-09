<%@page import="userdetails.user.*"%>
<%@page import="products.cart.*"%>
<%@page import="java.util.*"%>

<style>
.form-control{
	border:none;
	border-bottom:1px solid rgba(0,0,0,0.9);
}

</style>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container">

		<a class="navbar-brand" href="index.jsp"><img
			src="images/logos.png"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<!-- Getting session since its used in our navbar -->
		<%
		

				ICustomer navAuthSession = (ICustomer) request.getSession().getAttribute("auth");
				if (navAuthSession != null) {
			request.setAttribute("auth", navAuthSession);

				}
		%>




		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active "><a class="nav-link"
					aria-current="page" href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
				<li class="nav-item"><a class="nav-link" href="aboutUs.jsp"><i
						class="fa-solid fa-circle-info"></i>About Us</a></li>
				<li class="nav-item"><a class="nav-link" href="Cart.jsp"><i
						class="fa fa-shopping-cart"></i>Cart<span
						class="badge badge-success">${cart_list.size()}</span></a></li>

				<!-- if user is not null then navbar will show Order and logout page -->
				<%
				if (navAuthSession != null) {
				%>
				<li class="nav-item"><a class="nav-link" href="Orders.jsp">Order</a></li>
				<li class="nav-item"><a class="nav-link" href="./LogoutServlet">Logout</a></li>

				<%
				} else {
				%>
				<li class="nav-item"><a class="nav-link" href="#"
					data-toggle="modal" data-target="#exampleModal"><i
						class="fa fa-user"></i>Register</a></li>
				<li class="nav-item active"><a class="nav-link"
					aria-current="page" href="Login.jsp"><i class="fa fa-sign-in"></i>Login</a></li>
				<%
				}
				%>
			</ul>

		</div>
	</div>

</nav>



<!-- Registration Modal -->

<div class="modal fade" id="exampleModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">SignUp with
					TwiceInch</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form action="Registration" method="post">
				<div class="modal-body ">

					<div class="row">
						<div class="col">
							 <input type="text" name="firstname" class="form-control"
								placeholder="First name">
						</div>
						<div class="col">
							 <input type="text" name="lastname" class="form-control"
								placeholder="Last name">
						</div>
					</div>
					<div class="row">
						<div class="col mt-1">
							<select name="gender" class="form-control ">
								<option selected>Select Gender</option>
								<option>Male</option>
								<option>Female</option>
							</select>
						</div>
						<div class="col mt-1">
							 <input type="text" name="mobile" class="form-control"
								placeholder="Contact">
						</div>
					</div>

					<div class="row">
						<div class="col mt-1">
							<label for="exampleFormControlInput1" class="form-label">Date
								of Birth</label> <input type="date" name="dateofbirth"
								class="form-control" placeholder="Date of Birth">
						</div>

					</div>

					<div class="row">
						<div class="col mt-1">
							<input type="text" name="address" class="form-control"
								placeholder="City">
						</div>

					</div>
					<div class="row">
						<div class="col mt-1">
							 <input type="text" name="email" class="form-control"
								placeholder="Email">
						</div>
						<div class="col mt-1">
							<input type="password" name="password" class="form-control"
								placeholder="Password">
						</div>
					</div>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Register</button>
				</div>
			</form>
		</div>
	</div>
</div>