package aula04.reentrantreadwritelock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Aplicacao {

	public static void main(String[] args) {
		Info info = new Info();
		int numLeitores = 10; // número de threads que farão leitura de dado
		int numEscritores = 2; // número de threads que ferão escrita de dado

		ExecutorService es = Executors.newFixedThreadPool(numLeitores
				+ numEscritores);

		// cria uma série de runnables escritores e passa um a um ao executor
		for (int i = 0; i < numEscritores; i++) {
			Escritor e = new Escritor(info);
			es.execute(e);
		}

		// cria uma série de runnables leitores e passa um a um ao executor
		for (int i = 0; i < numLeitores; i++) {
			Leitor l = new Leitor("Leitor " + i, info);
			es.execute(l);
		}

		es.shutdown(); // finaliza o executor
	}
}
