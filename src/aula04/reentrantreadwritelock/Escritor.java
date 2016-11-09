package aula04.reentrantreadwritelock;

public class Escritor implements Runnable {

	private Info info;
	
	public Escritor(Info config) {
		info = config;
	}
	
	@Override
	/**
	 * Chama o método de escrita do info associado 10 vezes.
	 */
	public void run() {
		for(int i = 0; i < 10; i++) {
			info.setInfo();
		}
	}

}
