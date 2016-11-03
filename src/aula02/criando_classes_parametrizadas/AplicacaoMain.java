package aula02.criando_classes_parametrizadas;

public class AplicacaoMain {

	public static void main(String[] args) {
		Buffer<String> b = new Buffer<String>();
		
		b.adicionar("1º elemento adicionado");
		b.adicionar("2º elemento adicionado");
		b.adicionar("3º elemento adicionado");
		b.adicionar("4º elemento adicionado");
		b.adicionar("5º elemento adicionado");
		
		String s = b.remover();
		System.out.println(s);
	}

}
