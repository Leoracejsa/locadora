<%@page import="java.util.ArrayList"%>
<%@page import="modelo.dominio.Funcionario"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Listar Funcionário</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<%
	List<Funcionario> lista = (List<Funcionario>)request.getAttribute("lista");
	if (lista == null)
		lista = new ArrayList<Funcionario>();
%>

	<div class="container">
		<div class="row">
			<a href="index.jsp"><img src="img/logo.png" alt="Logo Locadora Magic Films" title="Logo Locadora Magic Films"></a>			
				<a class="glyphicon glyphicon-home  page-home-1 btn btn-warning" href="index.jsp"> Home</a>
			</div>
			
		<h1 class="page-home">Cadastro de Funcionário</h1>
			<div class="row">
			<a class="page-home-1 btn btn-info" href="abrirInclusaoFuncionario">Novo Funcionário</a>
			</div>
		
		<div class="table-responsive">		
			<table class="table table-bordered table-hover" border="1" cellpadding="5" cellspacing="0"> 
				<tr>
					<td class="success option col-md-2">Opções</td>
					<td class="success option col-md-3">Código</td>
					<td class="success option col-md-2">Nome</td>
			
				</tr>
			<%
			for (Funcionario funcionario : lista) {
			%>
				<tr>
					<td class="danger option-2 center"><a class="table-option" href="editarFuncionario?codigo=<%=funcionario.getCodigo()%>">Alterar</a>
						<a class="table-option" href="#" onclick="excluir('<%=funcionario.getCodigo()%>');">Excluir</a>
					</td>
					<td class="info option-1"><%=funcionario.getCodigo()%></td>
					<td class="warning option-1"><%=funcionario.getNome()%></td>
				</tr>
			<%	}
			%>
	
			</table>	
		</div>
	</div>
	

<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script></script>	
<script type="text/javascript">
function excluir(codigo)
{
	if (confirm('Deseja realmente apagar este produto?'))
		window.location = 'excluirFuncionario?codigo=' + codigo;
}
</script>
</body>
</html>