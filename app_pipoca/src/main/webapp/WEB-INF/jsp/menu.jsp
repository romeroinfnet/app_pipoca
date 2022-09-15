<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A Pipoca</title>
</head>
<body>

<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>A pipoca</title>
</head>

<h2>COMPRA</h2>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
	<div class="container-fluid">

		<ul class="navbar-nav navbar-right">
		<li class="nav-item">
 
 			
 			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
 			
		  	<li class="nav-item"><a class="nav-link" href="/cadastro/listaUsuario">Usuário</a></li>
		  
		 	<li class="nav-item"><a class="nav-link" href="/cliente/listaCliente">Cliente</a></li>
		 	
		 	<li class="nav-item"><a class="nav-link" href="/WEB-INF/jsp/compra/listaCompra">Compra</a></li>
		 	
		 	<li class="nav-item"><a class="nav-link" href="/doce/listaDoce">Doce</a></li>
		
			<li class="nav-item"><a class="nav-link" href="/ligth/listaLigth">Ligth</a></li>
		
		   	<li class="nav-item"><a class="nav-link" href="/premium/listaPremium">Premium</a></li>
		
		  	<li class="nav-item"><a class="nav-link" href="/salgado/listaSalgado">Salgado</a></li>
		 
		 	<li class="nav-item"><a class="nav-link" href="/produto/listaProduto">Produto</a></li>
		 	
	 	</ul>
	 	<ul class="navbar-nav navbar-right">
			<li class="nav-item">
	 		<li class="nav-item"><a class="nav-link" href="/logout">Logout ${user.nome}</a></li>
	 	</ul>
	</div>
</nav>

</body>
</html>