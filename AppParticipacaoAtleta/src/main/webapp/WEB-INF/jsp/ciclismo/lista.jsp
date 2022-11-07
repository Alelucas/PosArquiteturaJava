<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Ciclismo</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Ciclismo: ${listagem.size()}</h3>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Data Realização</th>
	        <th>Assistência PCD</th>
	        <th>Tipo Assistência PCD</th>
	        <th>Categoria</th>
	        <th>Classificação</th>
	        <th>Tipo Bicicleta</th>	     
	        <th></th>	 	           
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var='c' items="${listagem}">	    
	      		<tr>
			        <td>${c.id}</td>
			        <td>${c.nome}</td>
			        <td>${c.dt_realizacao}</td>
			        <td>${c.assistencia_pcd}</td>
			        <td>${c.tipo_assistencia_pcd}</td>
			        <td>${c.categoria}</td>
			        <td>${c.classificacao}</td>
			        <td>${c.tipo_bicicleta}</td>
			        <td><a href="/ciclismo/${c.id}/excluir">excluir</a></td>
	      		</tr>
	      	</c:forEach>	   
	    </tbody>
	  </table>
		  
	</div>

</body>
</html>