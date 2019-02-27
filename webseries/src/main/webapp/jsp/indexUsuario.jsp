<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="es">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="../css/indexUsuario.css" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">


</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<div id="WebName" class="navbar-header navbar-light">
				<a class="navbar-brand" href="indexUsuario.jsp">WebSeries</a>
			</div>
			<div id="lista">
				<ul id="navegador" class="nav navbar-nav">
					<li class="active"><a href="indexUsuario.jsp">Inicio</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Mis listas</a>
						<ul class="dropdown-menu">
							<li><a href="#">Siguiendo</a></li>
							<li><a href="#">Pendientes</a></li>
							<li><a href="#">Finalizadas</a></li>
						</ul></li>
					<li><a href="#">Agregar Serie</a></li>
				</ul>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Nombre de usuario</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Log out</a></li>
			</ul>

		</div>
	</nav>

	<hr>

	<div class="container">
		<div>
			<h1 class="display-1 text-white" >Agregados Recientemente</h1>
		</div>
		<div id="demo" class="carousel slide" data-ride="carousel">

			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-slide-to="0" class="active"></li>
				<li data-slide-to="1"></li>
			</ul>

			<!-- The slideshow -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="../images/portada_series/breaking_bad.jpg" alt="Los Angeles" width="400"
						height="600">
				</div>
				<div class="carousel-item">
					<img src="../images/portada_series/futurama.jpg" alt="Chicago" width="400"
						height="600">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>

	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="../js/jquery-3.3.1.slim.min.js"></script>
	<script src="../js/popper.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>