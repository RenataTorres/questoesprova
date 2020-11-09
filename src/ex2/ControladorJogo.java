package ex2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ControladorJogo")
public class ControladorJogo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer quant = Integer.valueOf(req.getParameter("quant"));
		
		GeraJogo jogo = new GeraJogo();
		jogo.setQuant(quant);
		
		req.setAttribute("jogo_bean", jogo.getLista());
		
		req.getRequestDispatcher("resultjogo.jsp").forward(req, resp);
		
		
		
	}

}
