<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<form action="coffeeupdate">
			Name:${name } <input type="hidden" name="name" value="${name }"> 
			Description: <input type="text" name="description" value="${description }"> 
			Quantity: <input type="text" name="quantity" value="${quantity }">
			Price: <input type="text" name="price" value="${price}">
			<input type="submit" value="Update">

		</form>
	</div>

</body>
</html>