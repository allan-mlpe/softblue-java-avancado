package aula04.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AplicacaoSingleThread {
	public static void main(String[] args) {
		
		MyRunnableClass mrc = new MyRunnableClass();
		
		//constroi um executor que é capaz de executar uma thread de cada vez
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		//cria uma nova thread e executa o método run do Runnable
		es.execute(mrc);
		
		//para a execução do Executor
		es.shutdown();
	}
}
