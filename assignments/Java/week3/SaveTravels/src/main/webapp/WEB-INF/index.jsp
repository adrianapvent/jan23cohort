
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>


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
<script src='/webjars/jquery/jquery.min.js' type="text/javascript">
	
</script>
<script src='/webjars/bootstrap/js/boostrap.min.js'
	type="text/javascript">
	
</script>
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous" type="text/javascript">
	
</script>
<!-- My JS -->
<script type="text/javascript" src='/js/scripts.js'></script>
<meta charset="UTF-8">

<!-- Title -->
<title>Project Title</title>
</head>
<body>
	<div class="container mt-5">
		<h1 class="display-4 text-primary">Safe Travels</h1>
		<table
			class="table table-striped table-bordered border-dark mb-5 text-center">
			<thead>
				<tr>
					<th scope="col">Expenses</th>
					<th scope="col">Vendor</th>
					<th scope="col">Amount</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="i" items="${allExpenses}">
					<tr>
						<td><a href="/expense/view/${i.id}">${i.name}</a></td>
						<td>${i.vendor}</td>
						<td><fmt:formatNumber value="${i.amount}" type="currency"/></td>
						<td class="d-flex justify-content-center align-items-center">
							<a href="/expense/edit/${i.id}">Edit</a><br>
							<form action="/expense/delete/${i.id}" method="post">
								<input type="hidden" name="_method" value="delete">
								<button type="button" class="btn btn-danger">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<h1 class="display-4 text-primary text-center">Add an expense:</h1>
		<form:form action="/expense/create" method="post"
			modelAttribute="expense" class="col-6">
			<div class="mt-3">
				<form:label path="name" class="form-label">Expense Name:</form:label>
				<form:input path="name" class="form-control" />
				<form:errors path="name" class="text-danger" />
			</div>
			<div class="mt-3">
				<form:label path="vendor" class="form-label">Vendor:</form:label>
				<form:input path="vendor" class="form-control" />
				<form:errors path="vendor" class="text-danger" />
			</div>
			<div class="mt-3">
				<form:label path="amount" class="form-label">Amount:</form:label>
				<form:input type="number" step="0.01" path="amount"
					class="form-control" />
				<form:errors path="amount" class="text-danger" />
			</div>
			<div class="mt-3">
				<form:label path="description" class="form-label">Description:</form:label>
				<form:textarea path="description" class="form-control"></form:textarea>
				<form:errors path="description" class="text-danger" />
			</div>
			<button class="btn btn-primary btn-lg mt-5 float-end mb-3">Submit</button>
		</form:form>
	</div>
</body>
</html>