package giorno11;

import java.io.FileNotFoundException;

public class EsempiBaseEccezioni3 {
	
	public static void main(String[] args) {
		System.out.println("Inizio programma");
		funzione1();
		System.out.println("Fine programma");
	}
	public static void funzione1() {
		System.out.println("Inizio funzione 1");
		try {
		funzione2();
		}
		catch(FileNotFoundException x) {
		System.out.println("Ho gestito l'eccezione");
		System.out.println(x.getMessage());
	}
		System.out.println("Finita funzione 1");
	}
	public static void funzione2() throws FileNotFoundException {
		System.out.println("Inizio funzione 2");
		funzione3();
		System.out.println("Finita funzione 2");
	}
	public static void funzione3() throws FileNotFoundException {
//Il programma mi ha obbligato a dichiararlo sopra (che ci sarebbe potuto essere l'errore)	 
		System.out.println("Inizio funzione 3");
		throw new FileNotFoundException("Non ho trovato il file");
//		System.out.println("Finita funzione 3"); IL CODICE NON RAGGIUNGERà MAI QUESTA FUNZIONE (PER IL THROW QUI SOPRA)
// QUESTA è UN ECCEZIONE CHECKED		
	}
}