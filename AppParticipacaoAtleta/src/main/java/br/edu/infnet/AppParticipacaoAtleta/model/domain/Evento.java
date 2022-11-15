package br.edu.infnet.AppParticipacaoAtleta.model.domain;


import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tevento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private LocalDateTime dt_realizacao;
	private Boolean assistencia_pcd;
	private String tipo_assistencia_pcd;
	
	@ManyToMany(mappedBy = "eventos")
	private List<Participacao> participacao;	
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@Override
	public String toString() {
		return id + ";" + nome + ";" + dt_realizacao +  ";" + assistencia_pcd + ";" + tipo_assistencia_pcd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDt_realizacao() {
		return dt_realizacao;
	}

	public void setDt_realizacao(LocalDateTime dt_realizacao) {
		this.dt_realizacao = dt_realizacao;
	}

	public Boolean getAssistencia_pcd() {
		return assistencia_pcd;
	}

	public void setAssistencia_pcd(Boolean assistencia_pcd) {
		this.assistencia_pcd = assistencia_pcd;
	}

	public String getTipo_assistencia_pcd() {
		return tipo_assistencia_pcd;
	}

	public void setTipo_assistencia_pcd(String tipo_assistencia_pcd) {
		this.tipo_assistencia_pcd = tipo_assistencia_pcd;
	}

	public List<Participacao> getParticipacao() {
		return participacao;
	}

	public void setParticipacao(List<Participacao> participacao) {
		this.participacao = participacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	

	
		
}
