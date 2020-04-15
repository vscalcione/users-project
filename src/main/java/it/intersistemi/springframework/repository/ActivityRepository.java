package it.intersistemi.springframework.repository;

import it.intersistemi.springframework.gestioneAttivita.entity.Attivita;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Attivita, String> {

	Iterable<Attivita> findByDipendentesIdMatricola(Integer idMatricola);
}
