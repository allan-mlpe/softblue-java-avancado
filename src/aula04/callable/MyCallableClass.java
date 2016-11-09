package aula04.callable;

import java.util.concurrent.Callable;

/**
 * Classe que implementa a interface Callable. Ao implementar esta interface, a
 * thread recebe um tipo parametrizado que representa o retorno do método call().
 * 
 * @author Allan
 *
 */
public class MyCallableClass implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "Hello World!";
	}

}
