package aula04.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AplicacaoThreadPool {

	public static void main(String[] args) {
		MyRunnableClass mrc1 = new MyRunnableClass();
		MyRunnableClass mrc2 = new MyRunnableClass();
		MyRunnableClass mrc3 = new MyRunnableClass();
		MyRunnableClass mrc4 = new MyRunnableClass();
		MyRunnableClass mrc5 = new MyRunnableClass();
		
		
		//cria um pool capaz de executor até 5 threads simultâneamente
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		//passa os runnables como parâmetro para a execução
		es.execute(mrc1);
		es.execute(mrc2);
		es.execute(mrc3);
		es.execute(mrc4);
		es.execute(mrc5);
		
		es.shutdown();
	}

}
