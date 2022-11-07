<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Atletas</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Atleta: ${listagem.size()}</h3>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>CPF</th>
	        <th>Nome</th>
	        <th>Gênero</th>
	        <th>PCD</th>       
	        <th></th> 
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var='a' items="${listagem}">	    
	      		<tr>
			        <td>${a.id}</td>
			        <td>${a.cpf}</td>
			        <td>${a.nome}</td>
			        <td>${a.genero}</td>
			        <td>${a.pcd}</td>	
			        <td><a href="/atleta/${a.id}/excluir">excluir</a></td>		 
	      		</tr>
	      	</c:forEach>	   
	    </tbody>
	  </table>
		  
	</div>

</body>
</html>