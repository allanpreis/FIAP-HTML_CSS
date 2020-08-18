package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet(urlPatterns = {"/index.php", "/resultado.jsp", "/validacao"})
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		String emailUsuario = "";
		String senhaUsuario = "";
		
		emailUsuario = request.getParameter("txt-user");
		senhaUsuario = request.getParameter("txt-pass");
		
		System.out.println("Email do usuário: " + emailUsuario);
		System.out.println("Senha do usuário: " + senhaUsuario);
		
		response.sendRedirect("resultado.html");
		
	}
}
