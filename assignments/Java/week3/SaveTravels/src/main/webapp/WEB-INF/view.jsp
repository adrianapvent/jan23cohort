<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <%@
taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- CSS only -->
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
			crossorigin="anonymous"
		/>
		<!-- My CSS -->
		<link rel="stylesheet" href="/css/styles.css" />
		<!-- JS for Bootstrap / jQuery -->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/boostrap.min.js"></script>
		<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
			crossorigin="anonymous"
		></script>
		<!-- My JS -->
		<script type="text/javascript" src="/js/scripts.js"></script>
		<meta charset="UTF-8" />

		<!-- Title -->
		<title>Project Title</title>
	</head>
	<body>
		<div class="container mt-5">
			<div class="row d-flex align-items-center">
				<h1 class="display-3 text-primary col-8">Expense Details</h1>
				<a class="col" href="/">Go back</a>
			</div>
			<div class="row fs-4 mt-5">
				<p class="col-4">Expense Name:</p>
				<p class="col">${expense.name}</p>
			</div>
			<div class="row fs-4 mt-5">
				<p class="col-4">Expense Description:</p>
				<p class="col">${expense.description}</p>
			</div>
			<div class="row fs-4 mt-5">
				<p class="col-4">Vendor:</p>
				<p class="col">${expense.vendor}</p>
			</div>
			<div class="row fs-4 mt-5">
				<p class="col-4">Amount Spent:</p>
				<p class="col">
					<fmt:formatNumber value="${expense.amount}" type="currency" />
				</p>
			</div>
		</div>
	</body>
</html>
