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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <!-- My CSS -->
    <link rel='stylesheet' href='/css/styles.css'>
    <!-- JS for Bootstrap / jQuery -->
    <script src='/webjars/jquery/jquery.min.js'>    </script>
    <script src='/webjars/bootstrap/js/boostrap.min.js'>    </script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous">    </script>
    <!-- My JS -->
    <script type = "text/javascript" src='/js/scripts.js'></script>
    <meta charset="UTF-8">

    <!-- Title -->
    <title>Project Title</title>
</head>
<body>
    <!-- HEADER -->
    <header>
        <nav>

        </nav>
    </header>
    <!-- MAIN -->
    <main>
    <div class="container mt-5">
		<h1 class="display-3">New Ninja</h1>
		<form:form action="/ninjas/create" method="post" modelAttribute="ninja" class="col-4">
            <div class="my-3">
                <form:label path="firstName" class="form-label">First Name:</form:label>
                <form:input path="firstName" type="text" class="form-control"/>
                <form:errors path="firstName" class="text-danger"/>
            </div>
            <div class="my-3">
                <form:label path="lastName" class="form-label">Last Name:</form:label>
                <form:input path="lastName" type="text" class="form-control"/>
                <form:errors path="lastName" class="text-danger"/>
            </div>
            <div class="my-3">
                <form:label path="age" class="form-label">Age:</form:label>
                <form:input path="age" type="number" class="form-control"/>
                <form:errors path="age" class="text-danger"/>
            </div>
            <div class="my-3">
                <form:label path="dojo" class="form-label">Dojo:</form:label>
                <form:select path="dojo" class="form-select">
					<option disabled selected>-- Select a Dojo--</option>
					<c:forEach var="dojo" items="${dojos}">
						<form:option value="${dojo.id}"><c:out value="${dojo.name}"/></form:option>
					</c:forEach>
				</form:select>
                <form:errors path="dojo" class="text-danger"/>
            </div>

            <button class="btn btn-primary float-end">Submit</button>
        </form:form>
	</div>

    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>