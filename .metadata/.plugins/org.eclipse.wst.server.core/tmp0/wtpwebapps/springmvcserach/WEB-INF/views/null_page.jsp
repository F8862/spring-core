<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Error !!</title>
<style>
.error-template {
	padding: 40px 300px;
	text-align: center;
}

.error-actions {
	margin-top: 15px;
	margin-bottom: 15px
}

.error-actions .btn {
	margin-right: 10px
}
</style>


</head>
<body>
	<div class="container">
		<div class="row">
			<div calss="col-md-12">
				<div class="error-template">
					<h1>Oops! Sorry</h1>
					<h2>${msg}</h2>
					<div class="error-details">Sorry, an error has
						occured,Requested page not found!</div>
					<div class="error-actions">
						<a herf="#!" class="btn btn-default btn-lg"><span
							class="glyphicon glyphicon-envelope">Take me Home</span></a> <a
							herf="#!" class="btn btn-default btn-lg"><span
							class="glyphicon glyphicon-envelope"></span>Contact Support</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>