<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>A pipoca</title>
</head>
<body>

<h2>Cadastramento de Compras:</h2>
<form action="/doce/incluir" method="post">
  <div class="mb-3 mt-3">
    <label for="nome" class="form-label">Descrição</label>
    <input type="text" class="form-control" placeholder="Entre com a descrição" name="nome">
  </div>
  
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Clientes:</label>
    <select class="form=control" id="sel1">
	    <c:forEach var="cl" items="${clientes}">
		    <option>${cl.nome}</option>
		</c:forEach>    
  </div>
	<br/>
	<br/>
  <div class="mb-3 mt-3">
    <label for="pwd" class="form-label"> </label>
  	  
    <label for="pwd" class="form-label">Produtos:</label>
		<c:forEach var="cp" items="${compras}">
		    <div class="checkbox">
				<label><input type="checkbox" value="">${cp.nome}</label>
			</div>
		</c:forEach>
  	<button type="submit" class="btn btn-primary">Enviar</button>
</form>

</body>
</html>