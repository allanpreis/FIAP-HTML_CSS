<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PRINCIPAL</title>
</head>
<body>
	<h1>PÁGINA-JSP</h1>
	<div>
		<h2>Página que gera os requests!</h2>
		<div>
			<a href="inicio.html">LINK-TO-HTML</a>
		</div>
	</div>

	<div>
		<h2>Recuperar os atributos vindos da Servlet</h2>
		<div>
			<p>Nome : ${attrNome}</p>
			<p>Profissão : ${attrProfissao}</p>
		</div>
	</div>

	<div>
		<h2>Recuperar os atributos do contexto da página - pageContext</h2>
		<div>
			<%-- Adicionando os atributos do request nos atributos da pageContext --%>
			${pageContext.setAttribute("Disciplina","RWD")}
			${pageContext.setAttribute("Nome" , ${attrNome})}
			${pageContext.setAttribute("Profissão",${attrProfissao)}
			<p>Nome : ${Nome}</p>
			<p>Profissão : ${Profissao}</p>
			<p>Disciplina : ${disciplina}</p>
		</div>
	</div>
	<div>
		<h2>REcuperar atributos que estãO no Servlet/Application COntext</h2>
		<div>
			<p>Status do Banco : ${attrStatusDb}</p>
		</div>
	</div>


</body>
</html>