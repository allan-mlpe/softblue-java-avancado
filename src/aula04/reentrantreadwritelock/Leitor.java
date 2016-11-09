package aula04.reentrantreadwritelock;

public class Leitor implements Runnable {
	private Info info;
	private String nome;
	
	public Leitor(String nome, Info info) {
		this.nome = nome;
		this.info = info;
	}
	
	@Override
	/**
	 * chama o método de leitura do info associado 10 vezes.
	 */
	public void run() {
		for(int i = 0; i < 10; i++) {
			String text = info.getInfo();
			System.out.println(nome + " => leu: " + text);
		}
	}
}
