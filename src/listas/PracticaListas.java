package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class PracticaListas {

	public List<Integer> dosListaEnOtraOrdenada(List<Integer> l1, List<Integer> l2){
		List<Integer> aux = new LinkedList<Integer>();
		
		aux.addAll(l1);
		aux.addAll(l2);
		
		Collections.sort(aux);
		
		return aux;
	}
	
	public List<Integer> eliminarDuplicados(List<Integer> l){
		List<Integer> aux = new LinkedList<Integer>();
		
		for (Integer integer : l) {
			if(!aux.contains(integer)) {
				aux.add(integer);
			}
		}
		
		return aux;		
	}
	
	public List<Integer> eliminarDuplicadoConSet(List<Integer> l){
		List<Integer> aux = new LinkedList<Integer>();
		
		Set<Integer> conjunto = new TreeSet<Integer>();
//		Set<Integer> conjunto = new HashSet<Integer>();
//		Set<Integer> conjunto = new LinkedHashSet<Integer>();
		
		conjunto.addAll(l);
		aux.addAll(conjunto);
		
		return aux;
	}
	
	public List<Integer> invertirLista(List<Integer> l){
		List<Integer> aux = new LinkedList<Integer>();
		
		for (int i = l.size() - 1; i >= 0; i--) {
            aux.add(l.get(i));
        }
		return aux;
	}
	
	public List<Integer> invertirListaConIterator(List<Integer> l){
//		List<Integer> aux = new ArrayList<Integer>();//ArrayList o LinkedList
//		ListIterator<Integer> element = l.listIterator();//recore la lista hacia adelante		
//		while(element.hasNext()) {
//			aux.add(element.next());
//		}
		
		List<Integer> aux = new LinkedList<Integer>();
		
		ListIterator<Integer> element = l.listIterator(l.size());//recorre la lista hacia atras
		while(element.hasPrevious()) {
			aux.add(element.previous());
		}
		
		return aux;	
	}
	
	
	
	public static void main(String[] args) {
		
		PracticaListas lista = new PracticaListas();
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(Arrays.asList(2,1,3,5,4));
		
		
//		List<Integer> l2 = new ArrayList<Integer>();
//		l2.addAll(Arrays.asList(2,4,7));
//		List<Integer> l3 = lista.invertirLista(l1);
		List<Integer> l3 = lista.invertirListaConIterator(l1);
//		List<Integer> l3 = lista.dosListaEnOtraOrdenada(l1, l2);

		System.out.println(l3);
//		System.out.println(l3);
	}
}
