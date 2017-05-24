package modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import modelo.dominio.Funcionario;

public class FuncionarioDAO {
	
	private EntityManager manager;

	public FuncionarioDAO() {
		super();
		
		this.manager = JPAUtil.getEntityManager();
	}

	public void fecharConexao() {
		this.manager.close();
	}

	@Override
	protected void finalize() throws Throwable {
		this.fecharConexao();
	}

	public void incluir(Funcionario obj) {
		// abrir a transação
		this.manager.getTransaction().begin();
		try {
			// atualizar o objeto
			this.manager.persist(obj);
			// confirmar a transação
			this.manager.getTransaction().commit();
		} catch (Exception e) {
			// desfazer a transação
			e.printStackTrace();
			this.manager.getTransaction().rollback();
		}
	}

	public void alterar(Funcionario obj) {
		// abrir a transação
		this.manager.getTransaction().begin();
		try {
			// atualizar o objeto
			this.manager.merge(obj);
			// confirmar a transação
			this.manager.getTransaction().commit();
		} catch (Exception e) {
			// desfazer a transação
			this.manager.getTransaction().rollback();
		}
	}

	public void remover(Funcionario obj) {
		// abrir a transação
		this.manager.getTransaction().begin();
		try {
			// atualizar o objeto
			this.manager.remove(obj);
			// confirmar a transação
			this.manager.getTransaction().commit();
		} catch (Exception e) {
			// desfazer a transação
			this.manager.getTransaction().rollback();
		}
	}

	public Funcionario buscar(Integer chave) {
		return this.manager.find(Funcionario.class, chave);
	}

	public List<Funcionario> buscarTodos() {
		
		String jpql = "from Funcionario p  order by p.codigo";
		TypedQuery<Funcionario> query = this.manager.createQuery(jpql, Funcionario.class);
		
		return query.getResultList();
	}
}
