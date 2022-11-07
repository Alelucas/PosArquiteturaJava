package br.edu.infnet.AppParticipacaoAtleta.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;

@Controller
public class CorridaController {
		private static Map<Integer, Corrida> mapa = new HashMap<Integer, Corrida> ();
		private static Integer id = 1;
		
		public static void incluir(Corrida corrida) {
			corrida.setId(id++);
			mapa.put(corrida.getId(), corrida);
		}
			
		public static void excluir(Integer id) {
			mapa.remove(id);
		}
			
		public static Collection<Corrida> obterLista(){
			return mapa.values();
		}
		
		@GetMapping(value = "/corrida/lista")
			public String telaLista(Model model) {		
				model.addAttribute("listagem", obterLista());
				return "corrida/lista";
	    }
		
		@GetMapping(value = "/corrida/{id}/excluir")
		public String exclusao(@PathVariable Integer id) {		
			excluir(id);
			return "redirect: /corrida/lista";
		}
	
}
