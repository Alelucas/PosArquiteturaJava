package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CiclismoService;

@Order(4)
@Component
public class CiclismoTeste implements ApplicationRunner {
	
	@Autowired
	private CiclismoService ciclismoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Ciclismo ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Ciclismo c1 = new Ciclismo ();
		c1.setNome("Riders 2022");
		c1.setDt_realizacao(LocalDateTime.now());
		c1.setAssistencia_pcd(true);
		c1.setTipo_assistencia_pcd("handbikes e triciclos");
		c1.setCategoria("montanha");
		c1.setClassificacao("C1");
		c1.setTipo_bicicleta("convencional");
		c1.setUsuario(usuario);
		System.out.println (" > " + c1);
		ciclismoService.incluir(c1);
				
				
	}

}
