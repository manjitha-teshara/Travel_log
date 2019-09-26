<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="static/bootstrap-4.3.1-dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="static/bootstrap-4.3.1-dist/css/bootstrap.min.css">
<script src="bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>



<link rel="stylesheet" href="static/css/main.css">
<meta charset="ISO-8859-1">
<title>Travel Log</title>
</head>
<body>
<!--  	<c:choose>
		<c:when test="${mode=='MODE_SIGNUP' }">  -->

			<h1>Sign up</h1>
			<div class="container h-100">
				<div class="d-flex justify-content-center h-100">
					<div class="user_card">
						<div class="d-flex justify-content-center">
							<div class="brand_logo_container">
								<img
									src="https://cdn.freebiesupply.com/logos/large/2x/pinterest-circle-logo-png-transparent.png"
									class="brand_logo" alt="Logo">
							</div>
						</div>
						<div class="d-flex justify-content-center form_container">
							<form method="post" action="save-user">
								<div class="input-group mb-3">
									<!-- --------------- -->
									<div class="input-group-append">
										<span class="input-group-text"><i class="fas fa-user"></i></span>
									</div>
									<input type="text" name="username"
										class="form-control input_user" value="${user.username }"
										placeholder="user name">
								</div>
								<!-- --------------- -->
								<div class="input-group mb-3">
									<!-- --------------- -->
									<div class="input-group-append">
										<span class="input-group-text"><i class="fas fa-user"></i></span>
									</div>
									<input type="text" name="fname" class="form-control input_user"
										value="${user.fname }" placeholder="first name">
								</div>
								<!-- --------------- -->
								<div class="input-group mb-3">
									<!-- --------------- -->
									<div class="input-group-append">
										<span class="input-group-text"><i class="fas fa-user"></i></span>
									</div>
									<input type="text" name="lname" class="form-control input_user"
										value="${user.lname }" placeholder="last name">
								</div>
								<!-- --------------- -->
								<div class="input-group mb-3">
									<!-- --------------- -->
									<div class="input-group-append">
										<span class="input-group-text"><i class="fas fa-user"></i></span>
									</div>
									<input type="text" name="email" class="form-control input_user"
										value="${user.email }" placeholder="email">
								</div>
								<!-- --------------- -->
								<div class="input-group mb-2">
									<div class="input-group-append">
										<span class="input-group-text"><i class="fas fa-key"></i></span>
									</div>
									<input type="password" name="password"
										class="form-control input_pass" value="${user.password}"
										placeholder="password">
								</div>
								<div class="form-group">
									<div class="custom-control custom-checkbox">
										<input type="checkbox" class="custom-control-input"
											id="customControlInline"> <label
											class="custom-control-label" for="customControlInline">Remember
											me</label>
									</div>
								</div>
							</form>
						</div>
						<div class="d-flex justify-content-center mt-3 login_container">
							<button type="submit" name="button" class="btn login_btn"
								value="Register">Login</button>
						</div>
						<div class="mt-4">
							<div class="d-flex justify-content-center links">
								Don't have an account? <a href="/signup" class="ml-2">Sign
									Up</a>
							</div>
							<div class="d-flex justify-content-center links">
								<a href="#">Forgot your password?</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:when>
	</c:choose>
</body>
</html>