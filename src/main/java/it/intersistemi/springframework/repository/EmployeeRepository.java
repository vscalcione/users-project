package it.intersistemi.springframework.repository;

import it.intersistemi.springframework.gestioneAttivita.entity.Dipendente;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Dipendente, Integer>{

	Iterable<Dipendente> findByAttivitasIdAttivita(String idAttivita);

}
