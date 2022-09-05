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
	<div class="container-fluid" style="right: 5px;" align="right">
		<ul class="navbar-nav navbar-right">
	 		<c:if test="${empty user}">
	 		<li class="nav-item">
	 			<a class="nav-link" href="/usuario">Cadastrar</a>
	 		</li>
	 		
	 		<li class="nav-item">
	 			<a class="nav-link" href="/login">Login</a>
	 		</li>
	 		
	 		</c:if>
	 		<c:if test="${not empty user}">
	 		
	 		<li class="nav-item">
	 			<a class="nav-link" href="/logout">Logout ${user}</a>
	 		</li>
	 		
	 		</c:if>
	 	</ul>
	</div>
</nav>

<c:if test="${not empty user}">	
<table class="table">
    <thead class="table-success">
      <tr>
        <th>Descrição</th>
        <th>Data</th>
        <th>Código</th>
      </tr>
    </thead>
    <tbody>
       <c:forEach var="c" items="${lista}">
      <tr>
        <td>${c.descricao}</td>
        <td>${c.data}</td>
        <td>${c.produtos}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  
  <h2>Detalhes da compra:</h2>
  	<h3><a href="/cadastro/listaUsuario">Usuário</a></h3>
  
 	<h3><a href="/cliente/listaCliente">Cliente</a></h3>
 	
 	<h3><a href="/compra/listaCompra">Compra</a></h3>
 	
 	<h3><a href="/doce/listaDoce">Doce</a></h3>

	<h3><a href="/ligth/listaLigth">Ligth</a></h3>

   	<h3><a href="/premium/listaPremium">Premium</a></h3>

  	<h3><a href="/salgado/listaSalgado">Salgado</a></h3>
 
 	<h3><a href="/produto/listaProduto">Produto</a></h3>
 </c:if>
  
</body>
</html>