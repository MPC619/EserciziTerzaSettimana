package giorno11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EsempiCollections {

	public static void main(String[] args) {
		ArrayList<String> frasi = new ArrayList<>();
//Nell'Arraylist non devo specificare la dimensione iniziale e la sua dimensione non è una costante
//Per inserirci della roba dobbiamo usare add
//Add int index string element  ti permette di inserire quello che vuoi alla posizione che vuoi,
		// se la posizione è occupata fa scalare tutto a destra
		ArrayList<String> frasi2 = new ArrayList<>();

		ArrayList<String> frasi3 = new ArrayList<>(Arrays.asList("ciao", "hola"));
//QUESTO SOPRA è IL MODO PER AGGIUNGERE DIRETTAMENTE STRINGHE (forse anche altro) all'interno dell'ArrayList		
		frasi2.add("pippo");
		frasi2.add("ciccio");
//add dovrebbe essere un fottuto Overload perchè con lo stesso nome ce ne sono 4, Motherfuckergod		
		frasi.addAll(frasi2);

		frasi.remove(0);
//Il remove elimina la roba in quella posizione e compatta tutto l'ArrayList, spostando a sinistra in teoria
		frasi.remove(frasi2);
//Remove object elimina  gesù cristo che gli hai passato in precedenza (credo)	

		List<Integer> r = createList(10);

	}

	public static ArrayList<Integer> createArray(int maxNum) {
//QUI SOPRA NON POSSO FARE UNA GENERICS SULLE PRIMITIVE, LE GENERICS FUNZIONANO SOLO CON LE CLASSI NON CON LE PRIMITI		
//QUINDI NON POSSO USARE int, ma devo scrivere Integer (LA VERSIONE OGGETTO DI int CREDO)
		ArrayList<Integer> result = new ArrayList<>(maxNum + 1);
		for (int i = 0; i <= maxNum; i++) {
			result.add(i);
		}
		return result;
	}

	public static List<Integer> createList(int maxNum) {
//LA RIFACCIO COME FAREBBE UN PROGRAMMATORE SERIO - HO CAMBIATO SOLAMENTE ArrayList con List (e nome funzione)
//STA MENATA perchè in futuro potrebbe cambiare e ritornare un'altra implementazione di List
		ArrayList<Integer> result = new ArrayList<>(maxNum + 1);
		for (int i = 0; i <= maxNum; i++) {
			result.add(i);
		}
		return result;
	}
}
