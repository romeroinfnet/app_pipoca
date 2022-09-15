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
 	  <c:forEach var="cl" items="${listagem}">
      <tr>
        <td>${cl.nome}</td>
        <td>${cl.cpf}</td>
        <td>${cl.email}</td>
        <td><a href="/cliente/${cl.id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>