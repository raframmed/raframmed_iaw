<!doctype html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="css/inicio.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.min.css">
<style type="text/css"> 
a:link 
{ 
text-decoration:none; 
} 
</style>
</head>
<body>
	<div id="login">
		<div id=titulo class="text-center text-white pt-3">
			<h1 class="display-1">
				<a class="text-white" href="index.jsp">Serie Storage Online</a>
			</h1>
		</div>
		<div class="container">
			<div class="row justify-content-center">
				<%
					String error = request.getParameter("mensaje");
					if (error != null) {
				%>
				<div class="alert alert-warning alert-dismissible fade show"
					role="alert">
					<%
						out.print(error);
					%>
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<%
					}
				%>
			</div>
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="ValidarUsuario"
							method="POST">
							<h1 class="text-center">Inicio de Sesión</h1>
							<br>
							<div class="form-group">
								<label for="usuario" class="text">Nombre de usuario:</label><br>
								<input type="text" name="usuario" id="usuario"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text">Contraseña:</label><br>
								<input type="password" name="password" id="password"
									class="form-control"> <br> <br>
								<button type="submit" class="btn btn-danger">Enviar</button>
								<button type="button" class="btn btn-secondary"
									onclick="location.href='jsp/registrar.jsp'">Registrar</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.3.1.slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>