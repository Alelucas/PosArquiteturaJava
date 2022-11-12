package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tnatacao")
public class Natacao extends Evento {
	private String estilo;
	private Integer distancia;
	
@Override
public String toString() {
	return super.toString() + ";" + estilo + ";" + distancia;
}

public String getEstilo() {
	return estilo;
}

public void setEstilo(String estilo) {
	this.estilo = estilo;
}

public Integer getDistancia() {
	return distancia;
}

public void setDistancia(Integer distancia) {
	this.distancia = distancia;
}



}
