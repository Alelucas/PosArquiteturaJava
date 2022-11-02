package br.edu.infnet.AppParticipacaoAtleta.model.domain;

public class Corrida extends Evento {
	private String tipo;
	private int percurso;
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

public int getPercurso() {
	return percurso;
}

public void setPercurso(int percurso) {
	this.percurso = percurso;
}

public Boolean getObstaculo() {
	return obstaculo;
}

public void setObstaculo(Boolean obstaculo) {
	this.obstaculo = obstaculo;
}

}
