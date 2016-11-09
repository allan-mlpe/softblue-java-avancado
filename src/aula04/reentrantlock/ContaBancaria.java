package aula04.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ContaBancaria {
	private double saldo;

	/**
	 * o lock é acionado em regiões de código críticas, impedindo acesso
	 * simultâneo de várias threads
	 */
	private ReentrantLock lock = new ReentrantLock();

	public void creditar(double valor) {
		lock.lock(); // início da região crítica
		try {
			saldo += valor;
		} finally { // devemos sempre acionar o unlock dentro do finally
			lock.unlock(); // fim da região crítica
		}
	}

	public void debitar(double valor) {
		lock.lock(); // início da região crítica
		try {
			saldo -= valor;
		} finally {
			lock.unlock(); // fim da região crítica
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
