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
 * Servlet implementation class ServletExcluirFuncionario
 */
@WebServlet("/excluirFuncionario")
public class ServletExcluirFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExcluirFuncionario() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigo = request.getParameter("codigo");
		Integer chave = Integer.parseInt(codigo);
		
		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario funcionario = dao.buscar(chave);
		
		dao.remover(funcionario);
		
		request.getRequestDispatcher("listarFuncionario").forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
