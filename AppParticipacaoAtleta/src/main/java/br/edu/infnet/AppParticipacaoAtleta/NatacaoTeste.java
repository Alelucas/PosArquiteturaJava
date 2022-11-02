package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;

@Component
public class NatacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Natação ##");
		
		Natacao n1 = new Natacao ();
		n1.setEstilo("costas");
		n1.setDistancia(50);
		System.out.println ("Natacao - " + n1);
		
		Natacao n2 = new Natacao ();
		n2.setEstilo("peito");
		n2.setDistancia(100);
		System.out.println ("Natacao - " + n2);
		
		Natacao n3 = new Natacao ();
		n3.setEstilo("borboleta");
		n3.setDistancia(100);
		System.out.println ("Natacao - " + n3);
		
	}

}
