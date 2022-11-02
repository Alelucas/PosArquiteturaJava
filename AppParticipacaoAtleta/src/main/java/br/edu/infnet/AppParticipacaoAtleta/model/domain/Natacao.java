package br.edu.infnet.AppParticipacaoAtleta.model.domain;

public class Natacao extends Evento {
	private String estilo;
	private int distancia;
	
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

public int getDistancia() {
	return distancia;
}

public void setDistancia(int distancia) {
	this.distancia = distancia;
}

}
