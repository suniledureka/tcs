<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
	text-align: center;
}

h2 {
	font-size: 30px;
	font-family: 'comic sans ms', 'serif';
}

table {
	text-align: left;
	width: 650px;
	border-collapse: collapse;
	box-shadow: 0 0 10px black;
	margin: 75px auto;
	padding: 5px;
}

td, th {
	border: 1px solid black;
	padding: 3px;
}

tr {
	height: 45px;
}

thead tr {
	text-align: center;
	background-color: black;
	color: white;
	height: 50px;
}
</style>
<title>TCS Library</title>
</head>
<body>
	<h2>TCS | LIBRARY | BOOKS</h2>
	<table>
		<thead>
			<tr>
				<th>BOOK ID</th>
				<th>BOOK TITLE</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookTitle}</td>
					<td>${book.bookPrice}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>