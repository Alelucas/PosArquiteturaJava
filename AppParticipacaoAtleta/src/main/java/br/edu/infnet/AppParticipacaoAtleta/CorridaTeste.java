package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;

@Component
public class CorridaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Corrida cr1 = new Corrida ();
		cr1.tipo = "rua";
		cr1.percurso = 21;
		cr1.obstaculo = false;
		System.out.println ("Corrida - " + cr1);
		
		Corrida cr2 = new Corrida ();
		cr2.tipo = "pista";
		cr2.percurso = 200;
		cr2.obstaculo = true;
		System.out.println ("Corrida - " + cr2);
			
		Corrida cr3 = new Corrida ();
		cr3.tipo = "pista";
		cr3.percurso = 100;
		cr3.obstaculo = false;
		System.out.println ("Corrida - " + cr3);
	}

}
