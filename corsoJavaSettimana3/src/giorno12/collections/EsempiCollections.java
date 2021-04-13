package giorno12.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
	}

}
