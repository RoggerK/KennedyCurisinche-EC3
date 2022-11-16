package rogger.guia.app.cita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rogger.guia.app.cita.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	
}
