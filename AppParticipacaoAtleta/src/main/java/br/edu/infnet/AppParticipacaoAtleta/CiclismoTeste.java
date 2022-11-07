package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.controller.CiclismoController;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;

@Component
public class CiclismoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Ciclismo ##");
		
		Ciclismo c1 = new Ciclismo ();
		c1.setNome("Riders 2022");
		c1.setDt_realizacao(LocalDateTime.now());
		c1.setAssistencia_pcd(true);
		c1.setTipo_assistencia_pcd("handbikes e triciclos");
		c1.setCategoria("montanha");
		c1.setClassificacao("C1");
		c1.setTipo_bicicleta("convencional");
		System.out.println (" > " + c1);
		CiclismoController.incluir(c1);
				
		Ciclismo c2 = new Ciclismo ();
		c2.setNome("Pedala Galera");
		c2.setDt_realizacao(LocalDateTime.now());
		c2.setAssistencia_pcd(true);
		c2.setTipo_assistencia_pcd("handbikes e triciclos");
		c2.setCategoria("estrada");
		c2.setClassificacao("T1");
		c2.setTipo_bicicleta("triciclo");
		System.out.println (" > " + c2);
		CiclismoController.incluir(c2);
		
		Ciclismo c3 = new Ciclismo ();
		c3.setNome("Night Riders 2022");
		c3.setDt_realizacao(LocalDateTime.now());
		c3.setAssistencia_pcd(true);
		c3.setTipo_assistencia_pcd("handbikes e triciclos");
		c3.setCategoria("pista");
		c3.setClassificacao("H2");
		c3.setTipo_bicicleta("handbike");
		System.out.println (" > " + c3);
		CiclismoController.incluir(c3);
		
	}

}
