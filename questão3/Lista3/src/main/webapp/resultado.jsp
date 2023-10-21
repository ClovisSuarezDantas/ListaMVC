<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultado</title>
</head>
<body>
    <p>Palavra 1: ${p1.palavra} é ${p1.palindromo ? 'um palíndromo' : 'não é um palíndromo'}.</p>
    <p>Palavra 2: ${p2.palavra} é ${p2.palindromo ? 'um palíndromo' : 'não é um palíndromo'}.</p>
</body>
</html>