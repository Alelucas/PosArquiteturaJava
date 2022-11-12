package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CorridaService;

@Order(6)
@Component
public class CorridaTeste implements ApplicationRunner {
	
	@Autowired
	private CorridaService corridaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Corridas ##");
		
		Corrida cr1 = new Corrida ();
		cr1.setNome("Corrida da Primavera");
		cr1.setDt_realizacao(LocalDateTime.now());
		cr1.setAssistencia_pcd(false);
		cr1.setTipo_assistencia_pcd("ajudante cadeirante");
		cr1.setTipo("rua");
		cr1.setPercurso(21);
		cr1.setObstaculo(false);
		System.out.println (" > " + cr1);
		corridaService.incluir(cr1);
		
		Corrida cr2 = new Corrida ();
		cr2.setNome("Runners 2022");
		cr2.setDt_realizacao(LocalDateTime.now());
		cr2.setAssistencia_pcd(false);
		cr2.setTipo_assistencia_pcd("ajudante cadeirante");
		cr2.setTipo("pista");
		cr2.setPercurso(200);
		cr2.setObstaculo(true);
		System.out.println (" > " + cr2);
		corridaService.incluir(cr2);
			
		Corrida cr3 = new Corrida ();
		cr3.setNome("Corrida de Verão");
		cr3.setDt_realizacao(LocalDateTime.now());
		cr3.setAssistencia_pcd(false);
		cr3.setTipo_assistencia_pcd("ajudante cadeirante");
		cr3.setTipo("pista");
		cr3.setPercurso(100);
		cr3.setObstaculo(false);
		System.out.println (" > " + cr3);
		corridaService.incluir(cr3);
	}

}
