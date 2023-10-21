<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultados</title>
</head>
<body>

<p>Soma: <%= request.getAttribute("resultadoSoma") %></p>
<p>Subtração: <%= request.getAttribute("resultadoSub") %></p>
<p>Multiplicação: <%= request.getAttribute("resultadoMult") %></p>
<p>Divisão: <%= request.getAttribute("resultadoDiv") %></p>
<p>Resto da divisão B: <%= request.getAttribute("resultadoRestoB") %></p>
<p>Resto da divisão C: <%= request.getAttribute("resultadoRestoC") %></p>

</body>
</html>