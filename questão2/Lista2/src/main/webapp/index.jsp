<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formulário</title>
</head>
<body>
    <form action="controle" method="get">
        Nome: <input type="text" name="nome"><br>
        Endereço: <input type="text" name="endereco"><br>
        Ano de Nascimento: <input type="number" name="anoNascimento"><br>
        Já fez aniversário este ano?
        <input type="radio" name="fezAniversario" value="sim"> Sim
        <input type="radio" name="fezAniversario" value="nao"> Não<br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>