package aula04.runnable;

/**
 * Classe que implementa a interface Runnable. Classes que implementam esta
 * interface, não possuem retorno no método run e este método também não é capaz
 * de lançar exceções.
 * 
 * @author Allan
 *
 */
public class MyRunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println("Mensagem da thread!");
	}

}
