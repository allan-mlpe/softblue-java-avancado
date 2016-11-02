package aula01.exercicios.exercicio2;

public class Ex2Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		try {
			Property.set(p, "nome", "Jão");
			System.out.println(Property.get(p, "nome", String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
