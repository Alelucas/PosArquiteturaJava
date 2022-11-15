package br.edu.infnet.AppParticipacaoAtleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.NatacaoService;

@Controller
public class NatacaoController {
 
	@Autowired
	private NatacaoService natacaoService;
	
	@GetMapping(value = "/natacao/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", natacaoService.obterLista());
			return "natacao/lista";
    }
	
	@GetMapping(value = "/natacao")
	public String telaCadastro() {		
		return "natacao/cadastro";
    }
	
	
	@PostMapping(value = "/natacao/incluir")
	public String incluir(Natacao natacao, @SessionAttribute("user") Usuario usuario) {
		
		natacao.setUsuario(usuario);
		natacaoService.incluir(natacao);		
		return "redirect: /natacao/lista";
	}
			
	@GetMapping(value = "/natacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		natacaoService.excluir(id);
		return "redirect: /natacao/lista";
	}
	
}
