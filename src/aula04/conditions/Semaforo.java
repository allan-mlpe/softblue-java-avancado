package aula04.conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Representa um semáforo que troca entre os estados aberto/fechado
 * periodicamente entre 1 e 5 segundos.
 * 
 * @author Allan
 *
 */
public class Semaforo implements Runnable {

	private Boolean aberto = false;
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	@Override
	/**
	 * Em loop infinito o semáforo troca o valor de aberto periodicamente entre 1 e 5 segundos
	 */
	public void run() {
		while (true) {
			lock.lock(); // restringe o acesso durante a alteração do atributo
			try {
				aberto = !aberto;

				if (aberto) {
					// acorda todas as threads que estavam dormindo quando o
					// sinal está aberto
					condition.signalAll();
				}

				System.out.println("Semáforo aberto: " + aberto);
			} finally {
				lock.unlock(); // libera o lock após atualizar o valor do
								// atributo
			}

			try {
				// faz a thread dormir de 1 a 5 segundos
				Thread.sleep(1000 + (int) (Math.random() * 4000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Método invocado por um objeto do tipo {@link Carro} que tenta atravessar
	 * o semáforo caso o mesmo esteja aberto
	 * 
	 * @param id id do carro
	 */
	public void atravessar(int id) {
		lock.lock();
		try {
			while (!aberto) {
				System.out.println("Carro " + id + " aguardando...");
				// se o sinal está fechado, a thread dorme e libera o lock para
				// o acesso de outras threads
				condition.await();
			}
			System.out.println("Carro " + id + " atravessou!");

		} catch (InterruptedException e) {
			e.printStackTrace();

		} finally {
			lock.unlock();
		}
	}
}
