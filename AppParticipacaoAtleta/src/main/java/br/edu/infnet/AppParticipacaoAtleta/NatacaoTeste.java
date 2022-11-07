package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.controller.NatacaoController;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;

@Component
public class NatacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Natação ##");
		
		Natacao n1 = new Natacao ();
		n1.setNome("Circuito Verão de Natação");
		n1.setDt_realizacao(LocalDateTime.now());
		n1.setAssistencia_pcd(false);
		n1.setTipo_assistencia_pcd("rampas de acesso");
		n1.setEstilo("costas");
		n1.setDistancia(50);
		System.out.println (" > " + n1);
		NatacaoController.incluir(n1);
		
		Natacao n2 = new Natacao ();
		n2.setNome("Circuito Primavera de Natação");
		n2.setDt_realizacao(LocalDateTime.now());
		n2.setAssistencia_pcd(false);
		n2.setTipo_assistencia_pcd("rampas de acesso");
		n2.setEstilo("peito");
		n2.setDistancia(100);
		System.out.println (" > " + n2);
		NatacaoController.incluir(n2);
		
		Natacao n3 = new Natacao ();
		n3.setNome("Circuito Outono de Natação");
		n3.setDt_realizacao(LocalDateTime.now());
		n3.setAssistencia_pcd(false);
		n3.setTipo_assistencia_pcd("rampas de acesso");
		n3.setEstilo("borboleta");
		n3.setDistancia(100);
		System.out.println (" > " + n3);
		NatacaoController.incluir(n3);
		
	}

}
