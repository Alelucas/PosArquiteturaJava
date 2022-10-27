package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;

@Component
public class NatacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Natacao n1 = new Natacao ();
		n1.estilo = "costas";
		n1.distancia = 50;
		System.out.println ("Natacao - " + n1);
		
		Natacao n2 = new Natacao ();
		n2.estilo = "peito";
		n2.distancia = 100;
		System.out.println ("Natacao - " + n2);
		
		Natacao n3 = new Natacao ();
		n3.estilo = "borboleta";
		n3.distancia = 100;
		System.out.println ("Natacao - " + n3);
		
	}

}
