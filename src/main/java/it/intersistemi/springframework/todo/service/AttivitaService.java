package it.intersistemi.springframework.todo.service;

import it.intersistemi.corso.dto.ActivityDto;

public interface AttivitaService extends CrudService<ActivityDto, String> {

	public Iterable<ActivityDto> listaAttivitaDipendente(Integer matrDipendente);

	public void assegnaAttivitaDipendente(String idAttivita, Integer idMatricola);

	public void rimuoviAttivitaDipendente(String idAttivita, Integer idMatricola);

}
