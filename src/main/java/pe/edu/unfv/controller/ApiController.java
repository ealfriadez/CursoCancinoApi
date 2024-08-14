package pe.edu.unfv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unfv.model.EjemploModel;

@RestController
@RequestMapping("/v1")
public class ApiController {

	@GetMapping("/metodo")
	private String pumetodo_get() {
		
		return "Metodo GET";
	}
	
	@GetMapping("/metodo/{id}")
	private String pumetodo_get_parametro(@PathVariable("id") String id) {
		
		return "Metodo GET con parametros = ".concat(id);
	}
	
	@PostMapping("/metodo-json")
	public String metodo_json(@RequestBody EjemploModel model) {
		
		return "datos = ".concat(model.getNombre()).concat(" - ").concat(model.getCorreo());
	}
}
