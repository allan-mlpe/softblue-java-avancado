package aula04.conditions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Simmula a aplicação onde um número de carros tenta atravessar um semáforo
 * quando o mesmo está aberto
 * 
 * @author Allan
 *
 */
public class Aplicacao {

	private static int NUM_CARROS = 5;

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(NUM_CARROS + 1);

		Semaforo semaforo = new Semaforo();
		es.execute(semaforo);

		for (int i = 0; i < NUM_CARROS; i++) {
			Carro c = new Carro(i, semaforo);
			es.execute(c);
		}

		es.shutdown();
	}
}
