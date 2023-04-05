<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!-- My CSS -->
<link rel='stylesheet' href='/css/styles.css'>
<!-- JS for Bootstrap / jQuery -->
<script src='/webjars/jquery/jquery.min.js'>
	
</script>
<script src='/webjars/bootstrap/js/boostrap.min.js'>
	
</script>

<!-- My JS -->
<script type="text/javascript" src='/js/scripts.js'></script>
<meta charset="UTF-8">

<!-- Title -->
<title>Project Title</title>
</head>
<body>
	<!-- HEADER -->
	<header>
		<h1>Fruity Loops Store</h1>
		<nav></nav>
	</header>
	<!-- MAIN -->
	<main>
		<table>
			<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach var="fruit" items="${fruits}">
					<tr>
						<td><c:out value="${fruit.name}"></c:out></td>
						<td><c:out value="${fruit.price}"></c:out></td>

					</tr>
					</c:forEach>
			</tbody>

		</table>
	</main>
	<!-- FOOTER -->
	<footer> </footer>
</body>
</html>