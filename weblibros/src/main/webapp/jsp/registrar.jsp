<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Registrar</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

<script type="text/javascript" src="../js/validaciones.js"></script>

</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<h1>Registrar</h1>
		</div>
		<div class="row justify-content-center">
			<%
				String error = request.getParameter("mensaje");
				if (error != null) {
			%>
			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<% out.print(error); %>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<%
				}
			%>
		</div>
		<hr>
		<form class="form" method="post" action="../RegistrarUsuario" onsubmit="return validarformulario()">
			<div class="form-group">
				<label class="control-label" for="login">Login</label>
				<input type="text" id="login" name="login" class="form-control">
				<spam id="splogin" style="color: red"></spam>
			</div>
			<div class="form-group">
				<label class="control-label" for="password">Password</label>
				<input type="password" id="password" name="password" class="form-control">
			</div>
			<div class="form-group">
				<label class="control-label" for="nombre">Nombre</label>
				<input type="text" id="nombre" name="nombre" class="form-control">
			</div>
			<div class="form-group">
				<label class="control-label" for="email">Email</label>
				<input type="text" id="email" name="email" class="form-control">
				<spam id="spemail" style="color: red"></spam>
			</div>
			
			<div class="form-group">
				<input type="submit" class="btn btn-primary" value="Enviar">
				<a href= "../index.jsp"><input type="button" class="btn btn-secundary" value="Volver"></a>
			</div>
		</form>
	
	</div>
	
	
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="../js/jquery-3.3.1.slim.min.js"></script>
	<script src="../js/popper.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>