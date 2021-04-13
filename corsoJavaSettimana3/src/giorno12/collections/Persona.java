package giorno12.collections;

import java.time.LocalDate;

public class Persona {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private LocalDate dataNascita;
	public Persona(String nome, String cognome, String codiceFiscale, LocalDate dataNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.dataNascita = dataNascita;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	
	
}
