package br.edu.infnet.AppParticipacaoAtleta;



import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;



@Order(3)
@Component
public class EventoTeste implements ApplicationRunner{
	
//@Autowired
//private EventoService eventoService;

@Override
public void run(ApplicationArguments args) throws Exception {
	System.out.println("## Cadastramento de Eventos ##");
		
	Usuario usuario = new Usuario();
	usuario.setId(1);
	
//	Evento ev1 = new Evento();
//	ev1.setNome("Riders 2022");
//	ev1.setDt_realizacao(LocalDateTime.now());
//	ev1.setAssistencia_pcd(true);
//	ev1.setTipo_assistencia_pcd("handbikes e triciclos");
//	ev1.setUsuario(usuario);
//	eventoService.incluir(ev1);
	
	
	
}

}
