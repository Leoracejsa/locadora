<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Funcionarios</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<jsp:useBean id="funcionario" class="modelo.dominio.Funcionario" 
		scope="request"></jsp:useBean>
<body>


<div class="container">
	<a href="index.jsp"><img src="img/logo.png" alt="Logo Locadora Magic Films" title="Logo Locadora Magic Films"></a>
		<h1 class="page-home">Editando Dados do Funcionário</h1>
			<form action="salvarFuncionario" method="post">
				<div class="table-responsive">
				<table class="table table-bordered">
					<tr>
						<td class="danger">Código:</td>
						<td class="success option-2"><input class="col-xs-6 col-md-4" type="text" name="codigo" value="<% if (funcionario.getCodigo() != null) { out.print(funcionario.getCodigo()); } %>" size="15" maxlength="15"></td>
					</tr>
					<tr>
						<td class="danger">Nome:</td>
						<td class="success option-2"><input class="col-xs-12 col-md-12" type="text" name="nome" value="<%if (funcionario.getNome() != null){ %> <%=funcionario.getNome() %><%} %>" size="40" maxlength="100"></td><br>					
					</tr>
				</table>	
					<div class="botao">
						<button class="btn btn-success" type="submit" value="Salvar Funcionario">Salvar</button>
						<button class="btn btn-danger" type="button" value="Cancelar" onclick="location='listarFuncionario'">Cancelar</button>
					</div>
				</div>		
			</form>
</div>	
<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>