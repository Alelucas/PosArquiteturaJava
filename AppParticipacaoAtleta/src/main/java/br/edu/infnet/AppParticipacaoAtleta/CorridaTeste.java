package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CorridaService;

@Order(5)
@Component
public class CorridaTeste implements ApplicationRunner {
	
	@Autowired
	private CorridaService corridaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Corridas ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Corrida cr1 = new Corrida ();
		cr1.setNome("Corrida da Primavera");
		cr1.setDt_realizacao(LocalDateTime.now());
		cr1.setAssistencia_pcd(false);
		cr1.setTipo_assistencia_pcd("ajudante cadeirante");
		cr1.setTipo("rua");
		cr1.setPercurso(21);
		cr1.setObstaculo(false);
		cr1.setUsuario(usuario);
		System.out.println (" > " + cr1);
		corridaService.incluir(cr1);
				
	}

}
