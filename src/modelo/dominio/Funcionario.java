package modelo.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tab_funcionarios")
public class Funcionario {
	
	@Id
	private Integer codigo;
	private String nome;
	
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(Integer codigo, String nome, List<Cliente> clientes) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		Clientes = clientes;
	}

	@OneToMany(mappedBy="funcionario")
	private List<Cliente> Clientes;
	
	public Integer getCodigo() {
		return codigo;
	}
//	public String getCodigoStr() {
//		if (this.codigo == null)
//			return "";
//		
//		return this.codigo.toString();
//	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
		

}
