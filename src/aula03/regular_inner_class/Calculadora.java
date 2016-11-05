package aula03.regular_inner_class;

public class Calculadora {
	private int valor1;
	private int valor2;
	
	class Soma {
		private int resultado;
		
		public void somar() {
			resultado = valor1 + valor2;
		}
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	
	public int getValor2() {
		return valor2;
	}
	
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public int somar() {
		Soma innerClass = new Soma(); //instancia a innerClass
		innerClass.somar(); //chama o método somar da innerClass
		return innerClass.resultado; //acessa o atributo resultado da innerClass
	}
}
