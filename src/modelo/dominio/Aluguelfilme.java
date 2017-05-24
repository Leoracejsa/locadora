package modelo.dominio;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="tab_Alugueis")
public class Aluguelfilme {
	
	@Id
	
	private Integer codigo;
	private Date dtinicio;
	private Date dtfim;
	
	@ManyToOne
	@JoinColumn (name="id_cliente")
	private Cliente cliente;
	
	
	@ManyToOne
	@JoinColumn (name="id_filme")
	private Filme filme;


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Date getDtinicio() {
		return dtinicio;
	}


	public void setDtinicio(Date dtinicio) {
		this.dtinicio = dtinicio;
	}


	public Date getDtfim() {
		return dtfim;
	}


	public void setDtfim(Date dtfim) {
		this.dtfim = dtfim;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	
	


	@Override
	public String toString() {
		return "Aluguelfilme [codigo=" + codigo + ", dtinicio=" + dtinicio + ", dtfim=" + dtfim + ", cliente=" + cliente
				+ ", filme=" + filme + "]";
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
		Aluguelfilme other = (Aluguelfilme) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
