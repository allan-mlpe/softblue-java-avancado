package aula04.operacoes_atomicas;


public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Usando o gerador usando o método "comum"
		for (int i = 0; i < 10; i++) {
			int seq = Gerador.getNextSeq();
			System.out.println(seq);
		}
		
		System.out.println("============");
		
		//Usando o gerador usando o AtomicInteger
		for (int i = 0; i < 10; i++) {
			int seq = Gerador.getNextAtomicSeq();
			System.out.println(seq);
		}
	}
}
