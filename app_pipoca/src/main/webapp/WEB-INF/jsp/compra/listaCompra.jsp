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

<h2>COMPRA</h2>
<table class="table">
    <thead class="table-success">
      <tr>
        <th>Descrição</th>
        <th>Data</th>
        <th>Código</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>String</td>
        <td>date</td>
        <td>int</td>
      </tr>
    </tbody>
  </table>

  <h2>Detalhes do produto</h2>
  <h3>Doce</h3>
	<table class="table">
    <thead class="table-success">
      <tr>
        <th>Código</th>
        <th>Descrição</th>
        <th>data</th>
        <th></th>
      </tr>
    </thead>
	
    <tbody>
 	  <c:forEach var="c" items="${lista}">
      <tr>
        <td>${c.codigo}</td>
        <td>${c.discricao}</td>
        <td>${c.data}</td>
        <td><a href="/compra/${id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>