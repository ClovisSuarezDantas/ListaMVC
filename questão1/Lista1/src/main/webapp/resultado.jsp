<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultados</title>
</head>
<body>

<p>Soma: <%= request.getAttribute("resultadoSoma") %></p>
<p>Subtra��o: <%= request.getAttribute("resultadoSub") %></p>
<p>Multiplica��o: <%= request.getAttribute("resultadoMult") %></p>
<p>Divis�o: <%= request.getAttribute("resultadoDiv") %></p>
<p>Resto da divis�o B: <%= request.getAttribute("resultadoRestoB") %></p>
<p>Resto da divis�o C: <%= request.getAttribute("resultadoRestoC") %></p>

</body>
</html>