package aula03.anonymous_inner_class;

public class Aplicacao {
	
	public static void main(String[] args) {
		/*
		 * Inner Classes anônimas só servem para implementar métodos abstratos, sobrescrever métodos ou implementar uma interface.
		 * Inner Classes anônimas também são úteis quando temos uma classe que não precisa ter um nome.
		 */
		
		
		/**
		 * Implementação de uma inner class que estende da classe abstrata bebida
		 */
		Bebida b1 = new Bebida() {
			@Override
			public void preparar() {
				System.out.println("Preparando chá...");	
			}
		};
		
		b1.preparar();
	}
}
