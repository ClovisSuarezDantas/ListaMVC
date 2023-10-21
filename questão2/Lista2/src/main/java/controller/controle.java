package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;

@WebServlet("/controle")
public class controle extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        boolean fezAniversario = "sim".equals(request.getParameter("fezAniversario"));

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setAnoNascimento(anoNascimento);
        pessoa.setFezAniversario(fezAniversario);

        int idadeAtual = pessoa.getIdade();

        request.setAttribute("pessoa", pessoa);
        request.setAttribute("idadeAtual", idadeAtual);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}