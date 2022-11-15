package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.NatacaoService;

@Order(6)
@Component
public class NatacaoTeste implements ApplicationRunner {

	@Autowired
	private NatacaoService natacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Natação ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Natacao n1 = new Natacao ();
		n1.setNome("Circuito Verão de Natação");
		n1.setDt_realizacao(LocalDateTime.now());
		n1.setAssistencia_pcd(false);
		n1.setTipo_assistencia_pcd("rampas de acesso");
		n1.setEstilo("costas");
		n1.setDistancia(50);
		n1.setUsuario(usuario);
		System.out.println (" > " + n1);
		natacaoService.incluir(n1);
		
				
	}

}
