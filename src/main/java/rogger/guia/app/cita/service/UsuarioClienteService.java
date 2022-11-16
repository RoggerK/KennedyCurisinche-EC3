package rogger.guia.app.cita.service;

import java.util.List;

import rogger.guia.app.cita.model.UsuarioCliente;

public interface UsuarioClienteService {
	void guardar(UsuarioCliente usuarioCliente);
	void actualizar(UsuarioCliente usuarioCliente);
	void eliminar(Integer id);	
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);
}
