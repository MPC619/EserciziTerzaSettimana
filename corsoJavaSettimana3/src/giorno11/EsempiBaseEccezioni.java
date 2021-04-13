package giorno11;

public class EsempiBaseEccezioni {

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
		catch(IllegalArgumentException x) {
		System.out.println("Ho gestito l'eccezione");
		System.out.println(x.getMessage());
//Sto getMessage credo che intercetti il messaggio che ha inviato sotto throw (riga29)		
	}
		System.out.println("Finita funzione 1");
	}
	public static void funzione2() {
		System.out.println("Inizio funzione 2");
		funzione3();
		System.out.println("Finita funzione 2");
	}
	public static void funzione3() {
		System.out.println("Inizio funzione 3");
		throw new IllegalArgumentException("Messaggio dell'eccezione");
//		System.out.println("Finita funzione 3"); IL CODICE NON RAGGIUNGERà MAI QUESTA FUNZIONE (PER IL THROW QUI SOPRA)
// QUESTA è UN ECCEZIONE UNCHECKED		
	}
}
