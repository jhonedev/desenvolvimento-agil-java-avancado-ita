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
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html lang='pt-BR'>");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta charset='UTF-8'>");
        response.getWriter().println("<title>Resultado da Conversão</title>");
        response.getWriter().println("<style>");
        response.getWriter().println("body {");
        response.getWriter().println("    font-family: Arial, sans-serif;");
        response.getWriter().println("    background-color: #e0f7fa;"); // Azul claro
        response.getWriter().println("    color: #333;");
        response.getWriter().println("    display: flex;");
        response.getWriter().println("    flex-direction: column;");
        response.getWriter().println("    align-items: center;");
        response.getWriter().println("    justify-content: center;");
        response.getWriter().println("    height: 100vh;");
        response.getWriter().println("    margin: 0;");
        response.getWriter().println("}");
        response.getWriter().println("h1 {");
        response.getWriter().println("    color: #007BFF;");
        response.getWriter().println("}");
        response.getWriter().println("p {");
        response.getWriter().println("    font-size: 24px;");
        response.getWriter().println("    margin: 20px 0;");
        response.getWriter().println("}");
        response.getWriter().println("</style>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Resultado da Conversão</h1>");
        response.getWriter().println("<p>Valor original: " + valorOriginal + "</p>");
        response.getWriter().println("<p>Valor convertido: " + valorConvertido + "</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
