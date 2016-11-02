package aula01.exercicios.exercicio1;

public class ClasseAnotada {
	
	public void metodo1() {
		System.out.println("MÉTODO 1");
	}
	
	@Init(runOnInstantiation=false)
	public void metodo2() {
		System.out.println("MÉTODO 2");
	}
	
	@Init(runOnInstantiation=false)
	public void metodo3() {
		System.out.println("MÉTODO 3");
	}
	
	@Init(runOnInstantiation=false)
	public void metodo4() {
		System.out.println("MÉTODO 4");
	}
	
	@Init(runOnInstantiation=true)
	public void metodo5() {
		System.out.println("MÉTODO 5");
	}
	
	@Init(runOnInstantiation=true)
	public void metodo6() {
		System.out.println("MÉTODO 6");
	}
}
