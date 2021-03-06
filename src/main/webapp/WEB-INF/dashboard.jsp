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
    
    	<h1>Save Travels</h1> <br>

    	<a class="btn btn-outline-primary" href ="/newExpense">New Expense</a> <br>
    
<br>
    
    	<table class ="table table-dark table-striped table-hover">
    	<thead>
    		<tr>
    			<th class"align-middle">Expense</th>
    			<th class"align-middle">Vendor</th>
    			<th class"align-middle">($) Amount</th>
    			<th class"align-middle">Actions</th>
    		</tr>
    	</thead>
    			<tbody>
    			
    			<c:forEach var="i" items="${allTravels}">
    			<tr>
    				<td> 
    				<a href ="oneExpense/${i.id }">
    				<c:out value="${i.expense}"></c:out> 
    				</a>
    				</td>
    				<td> <c:out value="${i.vendor}"></c:out> </td>
    				<td> <c:out value="${i.amount}"></c:out> </td>
    				<td>
    					<a href="/updateExpense/${i.id}">Edit</a>
    					<a href="/delete/${i.id}">Delete</a>
    					</td>
    	
    			</tr>
    			</c:forEach>
    
    			</tbody>
    	
    	
    	</table> 

    	
    </div> <!-- End of Container -->
</body>
</html>