package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import java.time.LocalDateTime;

public abstract class Evento {
	private int codigo;
	private String nome;
	private LocalDateTime dt_realizacao;
	private Boolean assistencia_pcd;
	private String tipo_assistencia_pcd;

	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + dt_realizacao +  ";" + assistencia_pcd + ";" + tipo_assistencia_pcd;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
}
