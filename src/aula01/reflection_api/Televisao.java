package aula01.reflection_api;

public class Televisao {
	
	@SuppressWarnings("unused")
	private boolean ligada;
	private int canal;
	
	public void ligar() {
		ligada = true;
		System.out.println("TV ligada!");
	}
	
	public void desligar() {
		ligada = false;
		System.out.println("TV desligada!");
	}
	
	public void mudarCanal(int canal) {
		this.canal = canal;
		System.out.println("Novo canal: " + this.canal);
	}
}
