package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcorrida")
public class Corrida extends Evento {
	private String tipo;
	private Integer percurso;
	private Boolean obstaculo;
	
@Override
public String toString() {
	return super.toString() + ";" + tipo + ";" + percurso + ";" + obstaculo;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Integer getPercurso() {
	return percurso;
}

public void setPercurso(Integer percurso) {
	this.percurso = percurso;
}

public Boolean getObstaculo() {
	return obstaculo;
}

public void setObstaculo(Boolean obstaculo) {
	this.obstaculo = obstaculo;
}



}
