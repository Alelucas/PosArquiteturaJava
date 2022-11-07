package br.edu.infnet.AppParticipacaoAtleta.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;

@Controller
public class ParticipacaoController {
	
	private static Map<Integer, Participacao> mapa = new HashMap<Integer, Participacao> ();
	private static Integer id = 1;
	
	public static void incluir(Participacao participacao) {
		participacao.setId(id++);
		mapa.put(participacao.getId(),participacao);
	}
		
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Participacao> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/participacao/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", obterLista());
			return "participacao/lista";	
 	}
	
	@GetMapping(value = "/participacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		excluir(id);
		return "redirect: /participacao/lista";
	}
}
