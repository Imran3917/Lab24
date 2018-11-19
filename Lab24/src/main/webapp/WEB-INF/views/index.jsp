<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />


<meta charset="ISO-8859-1">
<title>First Page</title>
</head>
<body>
	<div class="container">
		
		<h1>Coffee Menu</h1>
		<table class="table">
			<c:forEach var="p" items="${coffeelist}">
				<tr>
					<td>${p.name }</td>
					<td>${p.description }</td>
					<td>${p.quantity }</td>
					<td>$${p.price }</td>
					<td> <a class="btn btn-primary" href="/update?coofeename=${p.name }">Edit</a></td>
					<td> <a class="btn btn-primary" href="/delete?coffeename=${p.name }">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		
		
		<h1>Add a New Item</h1>
		<form action="additem">
		Name> <input type="text" name ="name"> 
		Description> <input type="text" name ="description">
		Quantity> <input type="text" name ="quantity">
		Price> <input type="text" name ="price">
		<input type="submit" value="Add"> 
		
		</form>
		

		

	</div>


	${hello}

	<%=new java.util.Date()%>

</body>
</html>