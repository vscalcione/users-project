package it.intersistemi.springframework.service;

import it.intersistemi.springframework.dto.ActivityDto;

public interface ActivityService extends CrudService<ActivityDto, String> {

	public Iterable<ActivityDto> listaAttivitaDipendente(Integer matrDipendente);

	public void assegnaAttivitaDipendente(String idAttivita, Integer idMatricola);

	public void rimuoviAttivitaDipendente(String idAttivita, Integer idMatricola);

}
