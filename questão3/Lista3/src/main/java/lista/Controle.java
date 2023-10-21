package lista;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle")
public class Controle extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String palavra1 = request.getParameter("palavra1");
        String palavra2 = request.getParameter("palavra2");

        Palavra p1 = new Palavra(palavra1);
        Palavra p2 = new Palavra(palavra2);

        request.setAttribute("p1", p1);
        request.setAttribute("p2", p2);
        request.getRequestDispatcher("/resultado.jsp").forward(request, response);
    }
}
