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

<h2>CLIENTE</h2>
<table class="table">
    <thead class="table-success">
      <tr>
        <th>Nome</th>
        <th>CPF</th>
        <th>Email</th>
      </tr>
    </thead>
	
    <tbody>
 	  <c:forEach var="c" items="${listagem}">
      <tr>
        <td>${c.nome}</td>
        <td>${c.cpf}</td>
        <td>${c.email}</td>
        <td><a href="/cliente/${id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>