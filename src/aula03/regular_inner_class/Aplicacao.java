package aula03.regular_inner_class;

public class Aplicacao {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.setValor1(11);
		c.setValor2(20);
				
		int result = c.somar();
		System.out.println(result);
	}
}
