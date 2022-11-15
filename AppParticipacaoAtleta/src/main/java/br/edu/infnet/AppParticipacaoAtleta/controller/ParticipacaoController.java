package br.edu.infnet.AppParticipacaoAtleta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.AtletaService;
import br.edu.infnet.AppParticipacaoAtleta.model.service.EventoService;
import br.edu.infnet.AppParticipacaoAtleta.model.service.ParticipacaoService;


@Controller
public class ParticipacaoController {
	
	@Autowired
	private ParticipacaoService participacaoService;
	@Autowired
	private AtletaService atletaService;
	@Autowired
	private EventoService eventoService;
	
		
	@GetMapping(value = "/participacao/lista")
		public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
			model.addAttribute("listagem", participacaoService.obterLista(usuario));
			return "participacao/lista";	
 	}
	
	@GetMapping(value = "/participacao")
	public String telaCadastro(Model model,@SessionAttribute("user") Usuario usuario ) {	
		
		model.addAttribute("atleta", atletaService.obterLista(usuario));
		model.addAttribute("evento", eventoService.obterLista(usuario));			
		return "participacao/cadastro";
    }
	
	
	@PostMapping(value = "/participacao/incluir")
	public String incluir(Participacao participacao, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Atleta: " + participacao.getAtleta());
		System.out.println("Eventos: " + participacao.getEventos());
		
		participacao.setUsuario(usuario);
		participacaoService.incluir(participacao);		
		return "redirect: /atleta/lista";
	}
		
	
	@GetMapping(value = "/participacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		participacaoService.excluir(id);
		return "redirect: /participacao/lista";
	}
}
