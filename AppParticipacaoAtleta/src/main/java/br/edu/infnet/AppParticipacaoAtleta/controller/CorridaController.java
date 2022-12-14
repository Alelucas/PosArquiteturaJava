package br.edu.infnet.AppParticipacaoAtleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CorridaService;

@Controller
public class CorridaController {
		
	@Autowired
	private CorridaService corridaService;
		
		@GetMapping(value = "/corrida/lista")
			public String telaLista(Model model) {		
				model.addAttribute("listagem", corridaService.obterLista());
				return "corrida/lista";
	    }
		
		@GetMapping(value = "/corrida")
		public String telaCadastro() {		
			return "corrida/cadastro";
	    }
		
		
		@PostMapping(value = "/corrida/incluir")
		public String incluir(Corrida corrida, @SessionAttribute("user") Usuario usuario) {
			
			corrida.setUsuario(usuario);
			corridaService.incluir(corrida);		
			return "redirect: /corrida/lista";
		}
		
		@GetMapping(value = "/corrida/{id}/excluir")
		public String exclusao(@PathVariable Integer id) {		
			corridaService.excluir(id);
			return "redirect: /corrida/lista";
		}
	
}
