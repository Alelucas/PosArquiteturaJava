package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.controller.ParticipacaoController;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;

@Component
public class ParticipacaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Participação ##");
		
		Atleta a1 = new Atleta ();
		a1.setCpf("62158680008");
		a1.setNome("Sergio Baptista");
		a1.setGenero(false);
		a1.setPcd(true);		
		
		Atleta a2 = new Atleta ();
		a2.setCpf("13664995066");
		a2.setNome("Isabelle Resende");
		a2.setGenero(true);
		a2.setPcd (false);
		
				
		Ciclismo ec2 = new Ciclismo ();
		ec2.setNome("Pedala Galera");
		ec2.setDt_realizacao(LocalDateTime.now());
		ec2.setAssistencia_pcd(true);
		ec2.setTipo_assistencia_pcd("handbikes e triciclos");
		
		Corrida ecr2 = new Corrida ();	
		ecr2.setNome("Runners 2022");
		ecr2.setDt_realizacao(LocalDateTime.now());
		ecr2.setAssistencia_pcd(false);
		ecr2.setTipo_assistencia_pcd("ajudante cadeirante");
		
		Natacao en2 = new Natacao ();	
		en2.setNome("Circuito Primavera de Natação");
		en2.setDt_realizacao(LocalDateTime.now());
		en2.setAssistencia_pcd(false);
		en2.setTipo_assistencia_pcd("rampas de acesso");
						
		Participacao p1 = new Participacao ();
		p1.setDt_inscricao(LocalDateTime.now());
		p1.setAtleta(a1);
		p1.setEventos(ec2);
		System.out.println (" > " + p1);
		ParticipacaoController.incluir(p1);
		
		Participacao p2 = new Participacao ();
		p2.setDt_inscricao(LocalDateTime.now());
		p2.setAtleta(a2);
		p2.setEventos(ecr2);
		System.out.println (" > " + p2);
		ParticipacaoController.incluir(p2);
		
		Participacao p3 = new Participacao ();
		p3.setDt_inscricao(LocalDateTime.now());
		p3.setAtleta(a2);
		p3.setEventos(en2);
		System.out.println (" > " + p3);
	    ParticipacaoController.incluir(p3);
		
		
	}

}
