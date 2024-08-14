package pe.edu.unfv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EjemploModel {

	private String nombre;
	private String correo;
	private String precio;
	private String descripcion;
}
