package aula04.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Aplicacao {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		ContaBancaria conta = new ContaBancaria();
		
		ClienteBanco cb1 = new ClienteBanco(conta);
		ClienteBanco cb2 = new ClienteBanco(conta);
		
		es.execute(cb1);
		es.execute(cb2);
		
		//só para a thread após ela terminar sua execução
		es.shutdown();
		
		try {
			while(!es.isTerminated()) {
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		double saldo = conta.getSaldo();
		System.out.println(saldo);
	}

}
