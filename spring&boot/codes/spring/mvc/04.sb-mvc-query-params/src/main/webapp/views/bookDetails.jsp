<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TCS : Library</title>
<style>
 	body{
 	  text-align:center;
 	  background-color:olive;
 	  color:white
 	}
 	h2{
 	  font-size:30px;
 	  font-family:'comic sans ms', 'serif';	
 	}
 	table{
 		text-align:left;
 		width:650px;
 		border-collapse:collapse;
 		box-shadow:0 0 10px black;
 		margin:75px auto;
 		padding:5px;
 		font-size:18px;
 	}
 	td,th{
 		border:1px solid black;
 		padding:3px;
 	}
 	tr{
		height:45px; 	
 	}
 </style>
</head>
<body>
	<h2>TCS | Library</h2>
	<p>${err_msg}</p>
	<table>
		<tr>
		  <th width="25%">BOOK ID</th>
		  <td>${book.bookId}</td>
		</tr>
		<tr>
		  <th>TITLE</th>
		  <td>${book.bookTitle}</td>
		</tr>		
		<tr>
		  <th>PRICE</th>
		  <td>${book.bookPrice}</td>
		</tr>		
	</table>
</body>
</html>