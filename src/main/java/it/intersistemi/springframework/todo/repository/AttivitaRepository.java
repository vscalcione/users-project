package it.intersistemi.springframework.todo.repository;

import it.intersistemi.corso.gestioneAttivita.entity.Attivita;
import org.springframework.data.repository.CrudRepository;

public interface AttivitaRepository extends CrudRepository<Attivita, String> {

	Iterable<Attivita> findByDipendentesIdMatricola(Integer idMatricola);
}
