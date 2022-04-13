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
<title>Omikuji Form</title>
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
    	<h1>Welcome to Omikuji Form</h1>
    	
    	
    	<!-- session -->
    	
  <%--   	<h1></h1>You have visited the page <c:out value="${count}"></c:out> number of times</h1>
    	<p> <c:out value="${name}"> Defaulty McDefaultface</c:out></p>
    	
    	<c:forEach var="pet" items = "${pets}">
    		<p><c:out value="${pet}"></c:out></p>
    		</c:forEach>  --%>
    	
    	<!-- end of session -->
    	

    	
    </div> <!-- End of Container -->
</body>
</html>