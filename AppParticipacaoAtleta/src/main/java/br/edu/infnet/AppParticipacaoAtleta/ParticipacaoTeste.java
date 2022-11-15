package br.edu.infnet.AppParticipacaoAtleta;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Evento;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.ParticipacaoService;

@Order(7)
@Component
public class ParticipacaoTeste implements ApplicationRunner{

	@Autowired
	private ParticipacaoService participacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Participação ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Atleta a1 = new Atleta ();
		a1.setId(1);	
		
		Ciclismo c1 = new Ciclismo();
		c1.setId(1);
		
		Corrida cr1 = new Corrida();
		cr1.setId(1);
		
		Natacao n1 = new Natacao();
		n1.setId(1);
		
		List<Evento> eventosDisponiveis = new ArrayList<Evento>();
		eventosDisponiveis.add(c1);
		eventosDisponiveis.add(cr1);
		eventosDisponiveis.add(n1);
																				
		Participacao p1 = new Participacao ();
		p1.setDt_inscricao(LocalDateTime.now());
		p1.setAtleta(a1);
		p1.setEventos(eventosDisponiveis);
		p1.setUsuario(usuario);
		System.out.println (" > " + p1);
		participacaoService.incluir(p1);
		
		
		
		
	}

}
