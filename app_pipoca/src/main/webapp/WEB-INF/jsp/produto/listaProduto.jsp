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

  <h2>Detalhes do produto</h2>
  <h3>Doce</h3>
	<table class="table">
    <thead class="table-success">
      <tr>
      	<th>Código</th>
        <th>Nome</th>
        <th>Valor</th>
        <th></th>
      </tr>
    </thead>
	
    <tbody>
 	  <c:forEach var="p" items="${listagem}">
      <tr>
        <td>${p.codigo}</td>
        <td>${p.nome}</td>
        <td>${p.valor}</td>
        <td><a href="/produto/${p.id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>