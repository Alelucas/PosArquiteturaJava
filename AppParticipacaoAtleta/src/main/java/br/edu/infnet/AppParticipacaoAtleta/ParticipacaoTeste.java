package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;

@Component
public class ParticipacaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Participacao p1 = new Participacao ();
		p1.dt_inscricao = '';
		System.out.println ("Participacao - " + p1);
		
		Participacao p2 = new Participacao ();
		p2.dt_inscricao = '';
		System.out.println ("Participacao - " + p2);
		
		Participacao p3 = new Participacao ();
		p3.dt_inscricao = '';
		System.out.println ("Participacao - " + p3);
	}

}
