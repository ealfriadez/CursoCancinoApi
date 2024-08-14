package pe.edu.unfv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

	@GetMapping("/metodo")
	private String pumetodo_get() {
		
		return "Metodo GET";
	}
	
	@GetMapping("/metodo/{id}")
	private String pumetodo_get_parametro(@PathVariable("id") String id) {
		
		return "Metodo GET con parametros = ".concat(id);
	}
}
