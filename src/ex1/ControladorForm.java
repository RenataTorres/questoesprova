package ex1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControladorForm")
public class ControladorForm extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		if (nome == null || nome.trim().length()==0){
			req.getRequestDispatcher("formlogin.jsp?erro=ERRO NO NOME").forward(req,resp);
		}
		else
		{
			Usuario usuario = new Usuario(nome);
			req.getSession().setAttribute("USUARIO", usuario);
			req.getRequestDispatcher("homepage.jsp").forward(req, resp);
		}
		
	}

}
