package listas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListasTest {

	@Test
	void test() {
		PracticaListas pl = new PracticaListas();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,2,1,4,2,4,3));
		List<Integer> esperada = new ArrayList<Integer>(Arrays.asList(1,2,4,3));
		
		assertEquals(esperada, pl.eliminarDuplicados(l1));
	}
	
	@Test
	void invertirListaTest() {
		PracticaListas lista = new PracticaListas();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 5, 4));
		
		List<Integer> esperado = new LinkedList<Integer>(Arrays.asList(4, 5, 3, 1, 2));
		
		assertEquals(esperado, lista.invertirLista(l1));
	}

}
