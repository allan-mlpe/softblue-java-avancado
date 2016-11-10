package aula04.future_task;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Aplicacao {
	public static void main(String[] args) throws Exception {

		// executor responsável por executar a thread da busca
		ExecutorService es = Executors.newSingleThreadExecutor();

		Localizador l = new Localizador("c:/Users/Allan/Desktop", "svn.txt");

		// classe que vai executar a tarefa futura.
		FutureTask<File> futureTask = new FutureTask<>(l); // recebe o callable
															// como parâmetro

		// FutureTask implementa Runnable, então podemos passá-la para o
		// executor
		es.execute(futureTask);

		// o método isDone() retorna true quando a tarefa foi finalizada, isto
		// é, a execução do método call foi concluída
		while (!futureTask.isDone()) {
			System.out.println("Buscando o arquivo...");
			Thread.sleep(2000);
		}

		// o método get da futureTask retorna o valor retornado do método call
		// do Callable
		File file = futureTask.get();

		if (file != null) {
			System.out.println("Arquivo encontrado em: "
					+ file.getAbsolutePath());
		} else {
			System.out.println("Arquivo não encontrado :(");
		}

		//finaliza o executor
		es.shutdown();
	}
}
