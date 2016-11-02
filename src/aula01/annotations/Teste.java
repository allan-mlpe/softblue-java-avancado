package aula01.annotations;

public class Teste {
	
	@Executar(arg="ABC-M1")
	public void m1(String s) {
		System.out.println("m1 chamado com parâmetro: " + s);
	}
	
	@Executar(arg="123-M2")
	public void m2(String s) {
		System.out.println("m2 chamado com parâmetro: " + s);
	}
	
	public void m3(String s) {
		System.out.println("m3 chamado com parâmetro: " + s);
	}
}
