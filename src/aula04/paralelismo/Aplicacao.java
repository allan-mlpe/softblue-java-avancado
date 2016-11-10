package aula04.paralelismo;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Aplicacao {

	public static void main(String[] args) {

		// cria um array de 100M posições
		int[] array = new int[1000000];

		// preenche todo o array com 1
		Arrays.fill(array, 1);

		SumArrayTask sat = new SumArrayTask(array, 0, array.length - 1);

		// funciona como um executor de ForkJoinTasks
		ForkJoinPool fjp = new ForkJoinPool(); // se não passarmos um inteiro,
												// representando o número de
												// threads do pool,
												// automaticamente o número de
												// threads será igual ao número
												// de processadores do computador

		// executa a task e retorna o resultado
		Integer sumResult = fjp.invoke(sat);

		System.out.println(sumResult);
	}
}
