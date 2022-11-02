package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;

@Component
public class CorridaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Corridas ##");
		
		Corrida cr1 = new Corrida ();
		cr1.setTipo("rua");
		cr1.setPercurso(21);
		cr1.setObstaculo(false);
		System.out.println ("Corrida - " + cr1);
		
		Corrida cr2 = new Corrida ();
		cr2.setTipo("pista");
		cr2.setPercurso(200);
		cr2.setObstaculo(true);
		System.out.println ("Corrida - " + cr2);
			
		Corrida cr3 = new Corrida ();
		cr3.setTipo("pista");
		cr3.setPercurso(100);
		cr3.setObstaculo(false);
		System.out.println ("Corrida - " + cr3);
	}

}
