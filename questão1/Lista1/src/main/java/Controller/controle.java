package Controller;

import java.io.IOException;
import model.opm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle")
public class controle extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int num3 = Integer.parseInt(request.getParameter("num3"));

            int resultadoSoma = opm.soma(num1, num2, num3);
            int resultadoSub = opm.subtrai(num1, num2);
            int resultadoMult = opm.multiplica(num1, num2, num3);
            double resultadoDiv= opm.divide(num1, num2, num3);
            double resultadoRestoB = opm.restoB(num1, num2);
            double resultadoRestoC = opm.restoC(num1, num3);

            request.setAttribute("resultadoSoma", resultadoSoma);
            request.setAttribute("resultadoSub", resultadoSub);
            request.setAttribute("resultadoMult", resultadoMult);
            request.setAttribute("resultadoDiv", resultadoDiv);
            request.setAttribute("resultadoRestoB", resultadoRestoB);
            request.setAttribute("resultadoRestoC", resultadoRestoC);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/resultado.jsp");
            dispatcher.forward(request, response);
    }
}