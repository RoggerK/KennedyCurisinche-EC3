package rogger.guia.app.cita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.cita.model.Hospital;
import rogger.guia.app.cita.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalRepository repository;
	
	@Override
	public void guardar(Hospital hospital) {
		// TODO Auto-generated method stub
		hospital.setIdHospital(0);
		repository.save(hospital);
	}

	@Override
	public void actualizar(Hospital hospital) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(hospital);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Hospital> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hospital obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
