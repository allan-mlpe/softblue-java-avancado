package aula02.exercicios.exercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class Ex1Test {
	
	Map<Integer, String> map;
	
	@Before
	public void init() {
		map = new Map<Integer, String>();
	}
	
	@Test
	public void addKeyValueTest() {
		Integer key = new Integer(11);
		String value = "Allan";
		
		map.put(key, value);		
		assertEquals(value, map.get(key));
	}
	
	@Test
	public void clearMapTest() {
		map.clear();
		assertNull(map.get(10));
	}
	
	@Test
	public void addDuplicateKey() {
		map.put(1, "Valor1");
		map.put(1, "Valor2");
		
		assertEquals("Valor2", map.get(1));
	}
}
