package rogger.guia.app.cita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.cita.model.UsuarioCliente;
import rogger.guia.app.cita.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {
	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public void guardar(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub
		usuarioCliente.setIdUsuario(0);
		repository.save(usuarioCliente);
	}

	@Override
	public void actualizar(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(usuarioCliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
}
