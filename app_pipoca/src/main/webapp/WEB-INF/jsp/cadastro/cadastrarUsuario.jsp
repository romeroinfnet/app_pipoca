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

<h2>Cadastramento de usuários:</h2>
<form action="/cadastro/incluir" method="post">
  <div class="mb-3 mt-3">
    <label for="nome" class="form-label">Nome:</label>
    <input type="nome" class="form-control" placeholder="Entre com nome" name="nome">
  </div>
  
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Email:</label>
    <input type="email" class="form-control" placeholder="Entre com email" name="email">
  </div>
  
  <div class="mb-3">
    <label for="pwd" class="form-label">Senha:</label>
    <input type="password" class="form-control" placeholder="Entre com a senha" name="senha">
  </div>
  
  <div class="form-check mb-3">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox" name="remember"> Lembrar
    </label>
  </div>
  	
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>

</body>
</html>