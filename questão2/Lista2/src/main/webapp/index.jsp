<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formul�rio</title>
</head>
<body>
    <form action="controle" method="get">
        Nome: <input type="text" name="nome"><br>
        Endere�o: <input type="text" name="endereco"><br>
        Ano de Nascimento: <input type="number" name="anoNascimento"><br>
        J� fez anivers�rio este ano?
        <input type="radio" name="fezAniversario" value="sim"> Sim
        <input type="radio" name="fezAniversario" value="nao"> N�o<br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>