package modelo.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tab_filmes")
public class Filme {

	@Id
	private Integer idfilme;
	private String nomefilme;
	private String anofilme;
	private int qntfilme;
	private float valorfilme;
	
	@ManyToOne
	private Categoria categorias;
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idfilme == null) ? 0 : idfilme.hashCode());
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
		Filme other = (Filme) obj;
		if (idfilme == null) {
			if (other.idfilme != null)
				return false;
		} else if (!idfilme.equals(other.idfilme))
			return false;
		return true;
	}
	public Integer getIdfilme() {
		return idfilme;
	}
	public void setIdfilme(Integer idfilme) {
		this.idfilme = idfilme;
	}
	public String getNomefilme() {
		return nomefilme;
	}
	public void setNomefilme(String nomefilme) {
		this.nomefilme = nomefilme;
	}
	public String getAnofilme() {
		return anofilme;
	}
	public void setAnofilme(String anofilme) {
		this.anofilme = anofilme;
	}
	public int getQntfilme() {
		return qntfilme;
	}
	public void setQntfilme(int qntfilme) {
		this.qntfilme = qntfilme;
	}
	public float getValorfilme() {
		return valorfilme;
	}
	public void setValorfilme(float valorfilme) {
		this.valorfilme = valorfilme;
	}
	@Override
	public String toString() {
		return "Filme [idfilme=" + idfilme + ", nomefilme=" + nomefilme + ", anofilme=" + anofilme + ", qntfilme="
				+ qntfilme + ", valorfilme=" + valorfilme + "]";
	}
	
	
	
	
}
