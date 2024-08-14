package pe.edu.unfv.service;

import java.util.List;
import java.util.Optional;

import pe.edu.unfv.model.UsuariosModel;

public interface IUsuariosService {

	List<UsuariosModel> getAllNameUser();
	Optional<UsuariosModel> getUserById(Integer id);
	UsuariosModel getUserByEmailAndEstate(String email, Integer estate);
	UsuariosModel getUserByEmail(String email);
	UsuariosModel saveUser(UsuariosModel user);
	void deleteUser(Integer id);
}
