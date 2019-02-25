<!doctype html>
<html lang="es">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="../css/inicio.css" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.min.css">

<script type="../js/validaciones.js"></script>

<!------ Include the above in your HEAD tag ---------->
</head>
<body>
	<div id="login">
		<div id=titulo class="text-center text-white pt-3">
			<h1 class="display-1">Serie Storage Online</h1>
		</div>
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="../RegistrarUsuario" onsubmit="return validarformulario()"
							method="POST">
							<h1 class="text-center">Registro de Usuario</h1>
							<br>
							<div class="form-group">
								<label class="control-label">Nombre de usuario</label> <input type="text" id="username" name="username"
									class="form-control">
								<spam id="spusername" style="color: white"></spam>
							</div>
							<div class="form-group">
								<label class="control-label">E-mail</label> <input type="email" id="email" name="email"
									class="form-control">
								<spam id="splogin" style="color: white"></spam>
							</div>
							<div class="form-group">
								<label class="text">Contraseña</label><br> <input
									type="password" name="password" id="password"
									class="form-control">
									<spam id="sppassword" style="color: white"></spam>
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