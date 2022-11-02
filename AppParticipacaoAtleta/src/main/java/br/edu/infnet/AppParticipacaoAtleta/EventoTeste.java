package br.edu.infnet.AppParticipacaoAtleta;


import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;


@Component
public class EventoTeste implements ApplicationRunner{

@Override
public void run(ApplicationArguments args) throws Exception {
	System.out.println("## Cadastramento de Eventos ##");
		
	Ciclismo c1 = new Ciclismo ();
	c1.setCategoria("montanha");
	c1.setClassificacao("C1");
	c1.setTipo_bicicleta("convencional");
	c1.setCodigo(002);
	c1.setNome("Riders 2022");
	c1.setDt_realizacao(LocalDateTime.now());
	c1.setAssistencia_pcd(true);
	c1.setTipo_assistencia_pcd("handbikes e triciclos");
	System.out.println ("Evento - " + c1);
	
	Corrida cr1 = new Corrida ();
	cr1.setTipo("rua");
	cr1.setPercurso(21);
	cr1.setObstaculo(false);
	cr1.setCodigo(001);
	cr1.setNome("Corrida da Primavera");
	cr1.setDt_realizacao(LocalDateTime.now());
	cr1.setAssistencia_pcd(false);
	cr1.setTipo_assistencia_pcd("ajudante cadeirante");
	System.out.println ("Evento - " + cr1);

	Natacao n1 = new Natacao ();
	n1.setEstilo("costas");
	n1.setDistancia(50);
	n1.setCodigo(003);
	n1.setNome("Circuito Verão de Natação");
	n1.setDt_realizacao(LocalDateTime.now());
	n1.setAssistencia_pcd(false);
	n1.setTipo_assistencia_pcd("rampas de acesso");
	System.out.println ("Evento - " + n1);
}

}
