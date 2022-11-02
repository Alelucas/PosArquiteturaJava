package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;

@Component
public class CiclismoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Ciclismo ##");
		
		Ciclismo c1 = new Ciclismo ();
		c1.setCategoria("montanha");
		c1.setClassificacao("C1");
		c1.setTipo_bicicleta("convencional");
		System.out.println ("Ciclismo - " + c1);
				
		Ciclismo c2 = new Ciclismo ();
		c2.setCategoria("estrada");
		c2.setClassificacao("T1");
		c2.setTipo_bicicleta("triciclo");
		System.out.println ("Ciclismo - " + c2);
		
		Ciclismo c3 = new Ciclismo ();
		c3.setCategoria("pista");
		c3.setClassificacao("H2");
		c3.setTipo_bicicleta("handbike");
		System.out.println ("Ciclismo - " + c3);
		
	}

}
