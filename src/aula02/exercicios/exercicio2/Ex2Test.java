package aula02.exercicios.exercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex2Test {

	@Test
	public void createNewInstanceFromSubclassOfService() {
		try {
			Service s = ServiceFactory.newInstance(ServiceImplementation.class);
			Service s2 = ServiceFactory.newInstance(ServiceFactory.class);
			
			assertEquals(s.getClass(), ServiceImplementation.class);
			assertEquals(s2.getClass(), ServiceFactory.class);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
