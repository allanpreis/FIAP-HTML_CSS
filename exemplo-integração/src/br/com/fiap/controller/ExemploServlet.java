package br.com.fiap.controller;


import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* Servlet implementation class ExemploServlet
*/
@WebServlet("/exemplo")
public class ExemploServlet extends HttpServlet {
private static final long serialVersionUID = 1L;


/**
* @see HttpServlet#HttpServlet()
*/
public ExemploServlet() {
super();
// TODO Auto-generated constructor stub
}


/**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
*/
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//Criando atributos no contexto da Servlet/Aplicação
ServletContext ctx = request.getServletContext();
ctx.setAttribute("attrStatusDb", "online");


//Recuperar os parâmetros do request.
String parametroNome = request.getParameter("nome");
String parametroProfissao = request.getParameter("profissao");


//Criando atributos
//Utilizando o request
//Quando se cria atributos no request, obrigatóriamente devemos criar um Dispatcher/forward
request.setAttribute("attrNome", parametroNome);
request.setAttribute("attrProfissao", parametroProfissao);

//Criando o encaminhamento
request.getRequestDispatcher("principal.jsp").forward(request, response);


//Construindo o response em HTML para o usuário
//Utilizando o objeto PrintWriter para dar saida no HTML do response.
// PrintWriter pw = response.getWriter();

//Construindo o HTML de fato...
// pw.println("<html>");
// pw.println("<head>");
// pw.println("<title>EXEMPLO HTML SERVLET</title>");
// pw.println("</head>");
// pw.println("<body>");
//CONTEÚDO DA PÁGINA
// pw.println("<h1>Página gerada na Servlet.</h1>");

//IMPRIMIR OS PARÂMETROS ENVIADOS NO REQUEST!!
// pw.println("<h2>Nome: "+ parametroNome +"</h2>");
// pw.println("<h2>Profissão: "+ parametroProfissao +"</h2>");
//
// pw.println("<a href='principal.jsp'>LINK-TO-JSP</a>");
//
// pw.println("</body>");
// pw.println("</html>");
//
// pw.close();


}

}