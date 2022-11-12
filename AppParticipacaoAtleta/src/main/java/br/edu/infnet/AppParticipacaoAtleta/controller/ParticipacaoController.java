package br.edu.infnet.AppParticipacaoAtleta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.AppParticipacaoAtleta.model.service.ParticipacaoService;


@Controller
public class ParticipacaoController {
	
	@Autowired
	private ParticipacaoService participacaoService;
		
	@GetMapping(value = "/participacao/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", participacaoService.obterLista());
			return "participacao/lista";	
 	}
	
	@GetMapping(value = "/participacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		participacaoService.excluir(id);
		return "redirect: /participacao/lista";
	}
}
