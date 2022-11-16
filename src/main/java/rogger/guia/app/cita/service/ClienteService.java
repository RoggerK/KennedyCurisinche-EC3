package rogger.guia.app.cita.service;

import java.util.List;

import rogger.guia.app.cita.model.Cliente;

public interface ClienteService {
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);	
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
