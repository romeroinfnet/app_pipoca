<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>Apipoca</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<h2>Cadastramento de Doces:</h2>
	<form action="/doce/cadastrarDoce" method="post">

  <h2>Detalhes do produto</h2>
  <h3>Pipoca Doce</h3>
	<table class="table">
    <thead class="table-success">
      <tr>
      	<th>Sabor</th>
      	<th>ID</th>
        <th>Código</th>
        <th>Nome</th>
        <th>Tamanho</th>
        <th>Valor</th>
        <th></th>
      </tr>
    </thead>
	
    <tbody>
 	  <c:forEach var="d" items="${listagem}">
      <tr>
      	<td>${d.sabor}</td>
      	<td>${d.id}</td>
      	<td>${d.codigo}</td>
        <td>${d.nome}</td>
        <td>${d.tamanho}</td>
        <td>${d.valor}</td>
        <td><a href="/doce/${d.id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>