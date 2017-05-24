package modelo.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tab_clientes")
public class Cliente {
	
	@Id
	private Integer idcliente;
	private String nomecliente;
	private String cpfcliente;
	private String dtnascimento;
	private String telefone;
	private String endereco;
	
	@ManyToOne
	private Funcionario funcionario;
	
	
	
	
	
	
	
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getCpfcliente() {
		return cpfcliente;
	}
	public void setCpfcliente(String cpfcliente) {
		this.cpfcliente = cpfcliente;
	}
	public String getDtnascimento() {
		return dtnascimento;
	}
	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nomecliente=" + nomecliente + ", cpfcliente=" + cpfcliente
				+ ", dtnascimento=" + dtnascimento + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcliente == null) ? 0 : idcliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (idcliente == null) {
			if (other.idcliente != null)
				return false;
		} else if (!idcliente.equals(other.idcliente))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	

}
