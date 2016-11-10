package aula04.conditions;

/**
 * Representa um carro que tenta atravessar uma esquina quando o semáforo está
 * aberto.
 * 
 * @author Allan
 *
 */
public class Carro implements Runnable {

	private Integer id;
	private Semaforo semaforo;

	public Carro(Integer id, Semaforo semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		while (true) {
			semaforo.atravessar(id);

			try {
				// faz a thread dormir entre 1 e 5 segundos
				Thread.sleep(1000 + (int) (Math.random() + 4000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
