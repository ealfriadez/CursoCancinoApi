package pe.edu.unfv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unfv.model.EjemploModel;
import pe.edu.unfv.utilidades.Utilidades;

@RestController
@RequestMapping("/v1")
public class ResponseEntityController {

	@GetMapping("/response-entity")
	public ResponseEntity<String> metodo_get(){
		
		return ResponseEntity.ok("Metodo GET desde ResponseEntity");
	}
	
	@GetMapping("/response-entity-personalizado")
	public ResponseEntity<Object> metodo_entity_personalizado(){
		
		return Utilidades.generateResponse(HttpStatus.OK, "ResponseEntity Personalizado");
	}
	
	@GetMapping("/response-entity/{id}")
	public ResponseEntity<String> metodo_get_parametro(@PathVariable("id") Integer id){
		
		return ResponseEntity.ok("Metodo GET desde ResponseEntity con parametro " + id );
	}	
	
	@PostMapping("/response-entity")
	public ResponseEntity<String> metodo_post(){
		
		return ResponseEntity.ok("Metodo POST desde ResponseEntity");
	}
	
	/*
	{
	    "nombre": "Eleazar Alfredo",
		"correo": "ealfriadez@gmail.com",
		"precio": "1570.65",
		"descripcion": "Calle las Retamas 345 - Ñaña"
	}
	*/
	@PostMapping("/response-entity-json")
	public ResponseEntity<String> metodo_post_json(@RequestBody EjemploModel model){
		
		return ResponseEntity.ok("Metodo POST desde ResponseEntity del model con datos ".concat(model.getNombre()).concat(" - ").concat(model.getCorreo()));
	}
	
	@PutMapping("/response-entity")
	public ResponseEntity<String> metodo_put(){
		
		return ResponseEntity.ok("Metodo PUT desde ResponseEntity");
	}
	
	@DeleteMapping("/response-entity")
	public ResponseEntity<String> metodo_delete(){
		
		return ResponseEntity.ok("Metodo DELETE desde ResponseEntity");
	}
	
	
}
