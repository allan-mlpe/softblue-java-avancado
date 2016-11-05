package aula03.method_local_inner_class;

public class Aplicacao {
	public static void main(String[] args) {

		String variavelLocal = "Texto da Variável local";

		/**
		 * Esta inner class dentro do método main só pode ser usada dentro do
		 * próprio método o qual está declarada. Ou seja, ela é acessível apenas
		 * dentro do escopo do método main.
		 * 
		 * @author Allan
		 *
		 */
		class Texto {
			private String t;

			public Texto(String t) {
				this.t = t;
			}

			public void imprimir() {
				System.out.println(t);
			}

			public void imprimirTextoDaVariavelLocal() {
				System.out.println(variavelLocal);
			}
		}

		Texto t = new Texto("mensagem da method local inner class");
		t.imprimir();
		t.imprimirTextoDaVariavelLocal();

	}
}
