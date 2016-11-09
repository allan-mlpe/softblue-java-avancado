package aula04.reentrantlock;

public class ClienteBanco implements Runnable {
	
	private ContaBancaria conta;
	
	public ClienteBanco(ContaBancaria conta) {
		this.conta = conta;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				conta.creditar(100);
				Thread.sleep(100);
				conta.debitar(100);
				Thread.sleep(100);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
}
