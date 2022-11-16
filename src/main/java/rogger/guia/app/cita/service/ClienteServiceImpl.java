package rogger.guia.app.cita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.cita.model.Cliente;
import rogger.guia.app.cita.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		cliente.setIdCliente(0);
		repository.saveAndFlush(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
