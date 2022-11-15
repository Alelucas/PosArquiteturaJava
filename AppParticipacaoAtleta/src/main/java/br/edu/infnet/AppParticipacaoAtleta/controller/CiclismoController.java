package br.edu.infnet.AppParticipacaoAtleta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CiclismoService;

@Controller
public class CiclismoController {
	
	@Autowired
	private CiclismoService ciclismoService;
 
	@GetMapping(value = "/ciclismo/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", ciclismoService.obterLista());
			return "ciclismo/lista";
	}
	
	@GetMapping(value = "/ciclismo")
	public String telaCadastro() {		
		return "ciclismo/cadastro";
    }
	
	
	@PostMapping(value = "/ciclismo/incluir")
	public String incluir(Ciclismo ciclismo, @SessionAttribute("user") Usuario usuario) {
		
		ciclismo.setUsuario(usuario);
		ciclismoService.incluir(ciclismo);		
		return "redirect: /ciclismo/lista";
	}
	
	
	@GetMapping(value = "/ciclismo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		ciclismoService.excluir(id);
		return "redirect: /ciclismo/lista";
}
	
}