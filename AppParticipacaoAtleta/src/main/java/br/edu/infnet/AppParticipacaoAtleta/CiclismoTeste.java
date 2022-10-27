package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;

@Component
public class CiclismoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Ciclismo c1 = new Ciclismo ();
		c1.categoria = "montanha";
		c1.classificacao = "C1";
		c1.tipo_bicicleta = "convencional";
		System.out.println ("Ciclismo - " + c1);
				
		Ciclismo c2 = new Ciclismo ();
		c2.categoria = "estrada";
		c2.classificacao = "T1";
		c2.tipo_bicicleta = "triciclo";
		System.out.println ("Ciclismo - " + c2);
		
		Ciclismo c3 = new Ciclismo ();
		c3.categoria = "pista";
		c3.classificacao = "H2";
		c3.tipo_bicicleta = "handbike";
		System.out.println ("Ciclismo - " + c3);
		
	}

}
