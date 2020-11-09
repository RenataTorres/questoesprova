package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/randomico-servlet")
public class RandServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<h1>PÁGINA PARA GERAR NÚMERO RANDÔMICO</h1>");
		out.println("<p>Número gerado = </p>");
		java.util.Random geradorDeNumeros = new java.util.Random();
		out.println(geradorDeNumeros.nextInt(100));
	}

}
