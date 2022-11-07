package br.edu.infnet.AppParticipacaoAtleta.controller;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;

@Controller
public class CiclismoController {
 
	private static Map<Integer, Ciclismo> mapa = new HashMap<Integer, Ciclismo> ();
	private static Integer id = 1;
	
	public static void incluir(Ciclismo ciclismo) {
		ciclismo.setId(id++);
		mapa.put(ciclismo.getId(), ciclismo);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
		
	public static Collection<Ciclismo> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/ciclismo/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", obterLista());
			return "ciclismo/lista";
	}
	
	@GetMapping(value = "/ciclismo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		excluir(id);
		return "redirect: /ciclismo/lista";
}
	
}