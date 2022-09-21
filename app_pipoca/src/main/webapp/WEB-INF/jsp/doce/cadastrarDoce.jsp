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

<h2>Cadastramento de Doces:</h2>
<form action="/doce/incluir" method="post">
  <div class="mb-3 mt-3">
    <label for="nome" class="form-label">Descrição</label>
    <input type="text" class="form-control" placeholder="Entre com a descrição" name="nome">
  </div>
  
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Clientes:</label>
    <option>Cliente1</option>
    <option>Cliente2</option>
    <option>Cliente3</option>
    <option>Cliente5</option>
    
  </div>
  
  <div class="mb-3">
    <label for="pwd" class="form-label">Produtos:</label>
    <div class="checkbox">
		<label><input type="checkbox" value="">Pipoca Salgada</label>
	</div>

	<div class="checkbox">
		<label><input type="checkbox" value="">Pipoca Doce</label>
  	</div>
  	<button type="submit" class="btn btn-primary">Enviar</button>
</form>

</body>
</html>