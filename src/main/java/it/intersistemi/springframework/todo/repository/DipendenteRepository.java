package it.intersistemi.springframework.todo.repository;

import it.intersistemi.corso.gestioneAttivita.entity.Dipendente;
import org.springframework.data.repository.CrudRepository;

public interface DipendenteRepository extends CrudRepository<Dipendente, Integer>{

	Iterable<Dipendente> findByAttivitasIdAttivita(String idAttivita);

}
