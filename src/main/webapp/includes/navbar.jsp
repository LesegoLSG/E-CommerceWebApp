<meta charset="ISO-8859-1">

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
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link"
					aria-current="page" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="Cart.jsp">Cart</a></li>
				<li class="nav-item"><a class="nav-link" href="Orders.jsp">Order</a></li>
				<li class="nav-item"><a class="nav-link" href="#"
					data-toggle="modal" data-target="#exampleModal">Register</a></li>
				<li class="nav-item"><a class="nav-link" href="#">About Us</a></li>
				<li class="nav-item active"><a class="nav-link"
					aria-current="page" href="Login.jsp">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Logout</a></li>

			</ul>

		</div>
	</div>

</nav>



<!-- Modal -->
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
			<div class="modal-body ">
				<form>
					<div class="row">
						<div class="col">
							<input type="text" class="form-control" placeholder="First name">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Last name">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<select class="form-control ">
								<option>Male</option>
								<option>Female</option>
							</select>
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Contact">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<input type="text" class="form-control" placeholder="City">
						</div>
						
					</div>
					<div class="row">
						<div class="col">
							<input type="text" class="form-control" placeholder="Email">
						</div>
						<div class="col">
							<input type="password" class="form-control" placeholder="Password">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Register</button>
			</div>
		</div>
	</div>
</div>