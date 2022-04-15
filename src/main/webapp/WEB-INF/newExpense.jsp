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
    	<h1>Add an expense:</h1>
    	<br>
    	<a class="btn btn-outline-primary" href ="/dashboard">Dashboard</a> <br>
    	<br>


<!-- //tied this form to our model class -->
<form:form action="/processExpense" method="post" modelAttribute="travel">
    <p>
    <!-- Those" expense" are tied to model attributes -->
        <form:label path="expense">Expense</form:label>
        <form:errors class="alert-danger" path="expense"/>
        <form:input path="expense"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors class="alert-danger" path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">($) Amount</form:label>
        <form:errors class="alert-danger" path="amount"/>
        <form:input type="number" step="0.01" path="amount"/>
    </p>
     
    <input type="submit" value="Submit"/>
</form:form>    

    	
    	

    	
    </div> <!-- End of Container -->
</body>
</html>