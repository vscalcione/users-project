package it.intersistemi.corso.repository;

import it.intersistemi.corso.gestioneAttivita.entity.Attivita;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Attivita, String> {

	Iterable<Attivita> findByDipendentesIdMatricola(Integer idMatricola);
}
