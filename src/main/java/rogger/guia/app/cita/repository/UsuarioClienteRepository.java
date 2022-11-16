package rogger.guia.app.cita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rogger.guia.app.cita.model.UsuarioCliente;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {
	UsuarioCliente findByUsuario(String usuario);
}
