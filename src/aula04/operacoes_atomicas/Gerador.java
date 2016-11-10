package aula04.operacoes_atomicas;

import java.util.concurrent.atomic.AtomicInteger;

public class Gerador {
	
	private static int seq = 0;
	
	/**
	 * Atributo que representa um inteiro atômico
	 */
	private static AtomicInteger atomicSeq = new AtomicInteger(0);
	
	public static int getNextSeq() {
		int t = seq;
		seq++;
		return t;
	}
	
	public static int getNextAtomicSeq() {
		//retorna o valor do inteiro e incrementa automaticamente
		return atomicSeq.getAndIncrement();
	}
}
