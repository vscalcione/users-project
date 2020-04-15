package it.intersistemi.corso.repository;

import it.intersistemi.corso.gestioneAttivita.entity.Dipendente;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Dipendente, Integer>{

	Iterable<Dipendente> findByAttivitasIdAttivita(String idAttivita);

}
