package giorno12.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EsempiCollections {

	public static void main(String[] args) {

		Set<String> frasi = new HashSet<>();
		frasi.add("ciao bello");
		frasi.add("buongiorno");
		frasi.add("ciao bello");
		System.out.println(frasi.size());
		for (String s : frasi) {
			System.out.println(s);
//Stampa in ordine casuale perchè non c'è un ordine dentro un set
//Il for each fa un accesso sequenziale
//il for normale fa un accesso random		
		
		}
		List<String> listaFrasi = new ArrayList<>();
		listaFrasi.add("ciao bello");
		listaFrasi.add("buongiorno");
		listaFrasi.add("ciao bello");
		System.out.println(listaFrasi.size());
		for (String p : listaFrasi) {
			System.out.println(p);
//List accetta duplicati, Set no			
		}
		for (int i = 0; i < listaFrasi.size(); i++) {
			System.out.println(listaFrasi.get(i));
		}
		for (Iterator<String> it = listaFrasi.iterator(); it.hasNext() ; ) {
			String s = it.next();
			System.out.println(it.getClass().getSimpleName());
			System.out.println(s);
//Un iterator è un oggetto che sa darmi tutti gli elementi di una Collection in maniera sequenziale attraverso il metodo
//next e la sa fare nella maniera più efficente possibile per quella Collection
		}
		List<String> listaLinkataFrasi = new LinkedList<String>();
		listaLinkataFrasi.add("ciao bello");
		listaLinkataFrasi.add("buongiorno");
		listaLinkataFrasi.add("ciao bello");
		System.out.println(listaLinkataFrasi.size());
		for (int i = 0; i < listaLinkataFrasi.size(); i++) {
			System.out.println(listaLinkataFrasi.get(i));			
		}
		for (String x : listaLinkataFrasi) {
			System.out.println(x);
		}
		for (Iterator<String> it2 = listaLinkataFrasi.iterator(); it2.hasNext(); ) {
			String y = it2.next();
			System.out.println(y);
			System.out.println(it2.getClass().getSimpleName());
		}
//Iterator è un'interfaccia		
		Map<String, Persona> registro = new HashMap<>();
		Persona carlo = new Persona("Carlo","Manuzzi","abcde",LocalDate.of(1980, 8, 20));
		Persona paul = new Persona("Paul","Phoenix","abdf",LocalDate.of(1990, 10, 8));
		registro.put(carlo.getCodiceFiscale(), carlo);
		Persona precedente = registro.put(paul.getCodiceFiscale(), paul);
		System.out.println(precedente);
		Persona p = registro.get("abcde");
		if (p != null) {
			System.out.println(p.getNome());
		}
		Persona mark = new Persona("Mark","Lenders","abcde",LocalDate.of(1995, 10, 5));
		boolean isPresent = registro.containsKey("abcde");
		System.out.println(isPresent);
		Persona old = registro.put(mark.getCodiceFiscale(), mark);
		System.out.println(old.getNome());
//Questo ciclo for cicla sul set delle chiavi della mappa, le chiavi sono in un set perchè sono uniche
//Quindi scorre le chiavi una a una, le stampa e recupera il valore associato con il metodo get e stampa anche questo		
		for (String chiave : registro.keySet()) {
			System.out.println(chiave);
			Persona x = registro.get(chiave);
			System.out.println(x.getNome());
		}
//Questo ciclo for cicla su tutti i valori della mappa (colonna di destra) ignorando le chiavi e cicla su tutti i valori
//inseriti nella mappa		
		for (Persona pe : registro.values()) {
			System.out.println(pe.getCognome());
		}
//Se io voglio accedere a tutte le chiavi e a tutti i valori della mappa in maniera efficente, ciclando sulle coppie
//si accede alle coppie chiave valore senza fare ricerche
		for (Map.Entry<String, Persona> coppia : registro.entrySet()) {
			System.out.println(coppia.getKey());
			System.out.println(coppia.getValue().getNome());
		}
	}

}
