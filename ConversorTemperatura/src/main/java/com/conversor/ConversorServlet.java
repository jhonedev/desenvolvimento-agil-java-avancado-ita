package com.conversor;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/converter")
public class ConversorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valor = request.getParameter("valor");
        String tipoConversao = request.getParameter("tipoConversao");
        double valorConvertido = 0;
        double valorOriginal = Double.parseDouble(valor);

        if ("celsiusParaFahrenheit".equals(tipoConversao)) {
            valorConvertido = (valorOriginal * 9 / 5) + 32;
        } else if ("fahrenheitParaCelsius".equals(tipoConversao)) {
            valorConvertido = (valorOriginal - 32) * 5 / 9;
        }

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Resultado da Conversão</h1>");
        response.getWriter().println("<p>Valor convertido: " + valorConvertido + "</p>");
        response.getWriter().println("</body></html>");
    }
}
