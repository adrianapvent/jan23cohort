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
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous">
	
</script>
<!-- My JS -->
<script type="text/javascript" src='/js/scripts.js'></script>
<meta charset="UTF-8">

<!-- Title -->
<title>Omikuji Form</title>
</head>
<body>
	<!-- HEADER -->
	<header>
		<h1>Omikuji Form</h1>
		<nav></nav>
	</header>
	<!-- MAIN -->
	<main>
		<div class="border text-center py-3">
			<h3>Send an Omikuji!</h3>
		</div>
		<form:form action="/submit" method="POST" class="mx-5 my-2">
			<div class="d-flex flex-coumn">
				<label class="form-label"> Pick any number from 5 to 25:</label> <input
					type="number" name="num" class="form-control">
			</div>
			<div class="d-flex flex-coumn">
				<label class="form-label">Enter the name of any city:</label> <input
					type="text" name="city" class="form-control">
			</div>
			<div class="d-flex flex-coumn">
				<label class="form-label">Enter the name of any real person:</label>
				<input type="text" name="person" class="form-control">
			</div>
			<div class="d-flex flex-coumn">
				<label class="form-label">Enter professional endeavor or
					hobby:</label> <input type="text" name="hobby" class="form-control">
			</div>
			<div class="d-flex flex-coumn">
				<label class="form-label"> Enter any type of living thing:</label> <input
					type="text" name="animal" class="form-control">
			</div>
			<div class="d-flex flex-coumn">
				<label class="form-label"> Say something nice to someone:</label>
				<textarea name="compliment" class="form-control" rows="5"></textarea>
			</div>
			<p>Send and show to a friend</p>

			<button class="btn btn-secondary my-1 w-100">Send</button>
		</form:form>
	</main>
	<!-- FOOTER -->
	<footer> </footer>
</body>
</html>