<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Atletas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
	  <h3>Atleta: ${listagem.size()}</h3>
	  	  
	  <h4><a href="/atleta"> Novo Atleta </a></h4>
	   
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>CPF</th>
	        <th>Nome</th>
	        <th>G?nero</th>
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