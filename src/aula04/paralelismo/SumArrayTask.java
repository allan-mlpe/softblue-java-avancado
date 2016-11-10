package aula04.paralelismo;

import java.util.concurrent.RecursiveTask;

public class SumArrayTask extends RecursiveTask<Integer> {

	private int[] array;
	private int minN;
	private int maxN;

	public SumArrayTask(int[] array, int minN, int maxN) {
		this.array = array;
		this.minN = minN;
		this.maxN = maxN;
	}

	@Override
	protected Integer compute() {
		int numElem = maxN - minN + 1;
		int half = numElem / 2;
		int partialSum = 0;

		// critério de parada da recursão. Se o tamanho do array for menor do
		// que 4, retornamos a soma desse array.
		if (numElem < 4) {
			for (int i = 0; i < numElem; i++) {
				partialSum += array[i];
			}

			return partialSum;
		}

		// dividindo a tarefa para fazer a soma da metade esquerda
		SumArrayTask leftTask = new SumArrayTask(array, minN, minN + half);
		// dividindo a tarefa para fazer a soma da metade direita
		SumArrayTask rightTask = new SumArrayTask(array, minN + half + 1, maxN);

		leftTask.fork(); // subdivide a tarefa, agenda o processamento da tarefa
							// para ser executado paralelamente em outro núcleo

		// para fazer a soma do lado direito não vamos criar uma nova task.
		// Vamos aproveitar a task corrente para fazer esse processamento.
		int resultRight = rightTask.compute();

		// pegando o resultado da soma do lado esquerdo. O método join retorna o
		// resultado de compute quando a tarefa for concluída
		int resultLeft = leftTask.join();

		partialSum = resultLeft + resultRight;

		return partialSum;
	}
}
