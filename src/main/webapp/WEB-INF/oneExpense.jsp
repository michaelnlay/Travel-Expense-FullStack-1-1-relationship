<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.Date"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Full CRUD</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">
      
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
    	<h1>Expense Details</h1>
    	<br>
 
    	
    	<a class="btn btn-outline-primary" href ="/dashboard">Dashboard</a> <br>
    	<br>
    
   		<h4>Expense Name: ${travel.expense } </h4>
    	<h4>Vendor: ${travel.vendor } </h4>
    	<h4> ($) Amount Spent: ${travel.amount }</h4>
    	
   	
    </div> <!-- End of Container -->
</body>
</html>