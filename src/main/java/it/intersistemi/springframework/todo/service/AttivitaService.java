package it.intersistemi.springframework.todo.service;

import it.intersistemi.springframework.todo.model.AttivitaDto;

public interface AttivitaService extends CrudService<AttivitaDto, String> {

	public Iterable<AttivitaDto> listaAttivitaDipendente(Integer matrDipendente);

	public void assegnaAttivitaDipendente(String idAttivita, Integer idMatricola);

	public void rimuoviAttivitaDipendente(String idAttivita, Integer idMatricola);

}
