<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="ISO-8859-1">
 <title>library</title>
 <style>
 	body{
 	  text-align:center;
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
 		margin:auto;
 		padding:5px;
 	}
 	td,th{
 		border:1px solid black;
 		padding:3px;
 	}
 	tr{
		height:45px; 	
 	}
 	p{
 	 text-align:center;
 	 color:red;
 	 font-size:16px;
 	 text-style:italic;
 	}
 </style>
</head>
<body>
	<h2>TCS | LIBRARY | BOOK</h2>
	
	<p>${error_msg}</p>
	
	<table>
		<tr>
		 <th style="width:30%">BOOK ID</th>
		 <td>${book.bookId}</td>
		</tr>
		
		<tr>
		 <th>TTITLE</th>
		 <td>${book.bookTitle}</td>
		</tr>		
		
		<tr>
		 <th>PRICE</th>
		 <td>${book.bookPrice}</td>
		</tr>		
	</table>	
</body>
</html>