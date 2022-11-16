package rogger.guia.app.cita.service;

import java.util.List;

import rogger.guia.app.cita.model.Hospital;

public interface HospitalService {
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);	
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
