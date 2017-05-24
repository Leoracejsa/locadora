package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.FuncionarioDAO;
import modelo.dominio.Funcionario;

/**
 * Servlet implementation class ServletSalvarFuncionario
 */
@WebServlet("/salvarFuncionario")
public class ServletSalvarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSalvarFuncionario() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(403, "Não é permitido enviar requisição via GET.");
		
		// doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigo = request.getParameter("codigo");
		String nome = request.getParameter("nome");
		
		
		FuncionarioDAO dao = new FuncionarioDAO();
		Integer codigoInt = null;
		Funcionario funcionario=null;

		try {
			codigoInt = Integer.parseInt(codigo);
			funcionario = dao.buscar(codigoInt);
		} catch (NumberFormatException e) {
			codigoInt = null;
		}

		if (funcionario == null) {
			funcionario = new Funcionario(codigoInt, nome, null);
		}
		
		funcionario.setNome(nome);
		
		
		dao.alterar(funcionario);
		
//		RequestDispatcher desp = request.getRequestDispatcher("index.jsp");
//		desp.forward(request, response);
		
		response.sendRedirect("listarFuncionario");
	}
	

}