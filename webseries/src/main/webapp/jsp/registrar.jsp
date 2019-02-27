<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="../css/inicio.css" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.min.css">

<script type="../js/validaciones.js"></script>
<style type="text/css">
a:link {
	text-decoration: none;
}
</style>
</head>
<body>
	<div id="login">
		<div id=titulo class="text-center text-white pt-3">
			<h1 class="display-1">
				<a class="text-white" href="../index.jsp">Serie Storage Online</a>
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
						<form id="login-form" class="form" action="../RegistrarUsuario"
							onsubmit="return validarformulario()" method="POST">
							<h1 class="text-center">Registro de Usuario</h1>
							<br>
							<div class="form-group">
								<label class="control-label" for="username">Nombre de
									usuario</label> <input type="text" id="username" name="username"
									class="form-control" required>
								<p>
									<spam id="spusername" style="color: white"></spam>
								</p>
							</div>
							<div class="form-group">
								<label class="control-label" for="username">E-mail</label> <input
									type="email" id="email" name="email" class="form-control"
									required>
								<spam id="spemail" style="color: white"></spam>
							</div>
							<div class="form-group">
								<label class="control-label" for="username">Contraseña</label><br>
								<input type="password" name="password" id="password"
									class="form-control" required>
							</div>
							<div class="form-group">
								<input type="submit" class="btn btn-danger" value="Enviar">
								<a href="../index.jsp"><input type="button"
									class="btn btn-secundary" value="Volver"></a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="../js/jquery-3.3.1.slim.min.js"></script>
	<script src="../js/popper.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>