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
<title>Default for Java Spring</title>
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
    	<h1>Omikuji Form</h1>
    	
    	<form action="/omikuji/process" method="post">
		  <div class="form-group">
		    <label for="number">Pick A Number:</label>
		    <input type="number" class="form-control" name="number" placeholder="Any number between 5 to 25">
		  </div>
		  
		   <div class="form-group">
		    <label for="city">Enter City:</label>
		    <input type="text" class="form-control" name ="city" placeholder="Please enter a city">
		  </div>
		  
		  <div class="form-group">
		    <label for="city">Enter Person:</label>
		    <input type="text" class="form-control" name ="person" placeholder="Please enter a person name">
		  </div>
		    <div class="form-group">
		    <label for="hobby">Enter Hobby:</label>
		    <input type="text" class="form-control" name="hobby" placeholder="Please enter a hobby">
		  </div>
		  
		   <div class="form-group">
		    <label for="animal">Enter Animal:</label>
		    <input type="text" class="form-control" name="animal" placeholder="Please enter an animal">
		  </div>
		  
		  <div class="form-group">
		    <label for="description">Say Nice Thing:</label>
		    <textarea class="form-control"  name="description" rows="3"></textarea>
		  </div>
		  <br>
		  <input class="btn btn-primary" type="submit" value="Submit!">
		</form>
    	
    	
    	<!-- //==================================================================== -->
    	<!-- created this "/process route after @RequestMapping("/form") -->
    	
    	
    	
    </div> <!-- End of Container -->
</body>
</html>