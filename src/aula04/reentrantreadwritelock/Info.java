package aula04.reentrantreadwritelock;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class Info {
	private String info = "AAAAAAAAAA";
	private Random random = new Random();

	/**
	 * Lock destinado a operações que envolvem leitura e escrita de dados
	 */
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	/**
	 * Lock de leitura. Várias threads podem ter este lock simultâneamete.
	 */
	private ReadLock readLock = lock.readLock();

	/**
	 * Lock de escrita. Apenas uma thread pode obter este lock e, quando isso
	 * ocorre, as outras esperam. Este lock também só é obtido quando todos os
	 * locks de leitura são liberados.
	 */
	private WriteLock writeLock = lock.writeLock();

	public String getInfo() {
		// ativa o lock de leitura. A partir deste momento, se alguma thread
		// tentar ativar o lock de escrita, deve esperar até que todos os locks
		// de leitura sejam liberados
		readLock.lock();
		try {
			return info;
		} finally {
			readLock.unlock(); // liberação do lock de leitura
		}
	}

	public void setInfo() {
		// ativa o lock de escrita. A partir deste momento, nenhuma thread pode,
		// simultâneamente, ler ou escrever até que este lock seja liberado.
		writeLock.lock();
		try {
			info = "";
			for (int i = 0; i < 10; i++) {
				char c = (char) (random.nextInt(26) + 65);
				info += c;
			}
		} finally {
			writeLock.unlock(); // libera o lock de escrita
		}
	}
}
