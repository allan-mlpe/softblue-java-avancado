package aula01.exercicios.exercicio1;

public class Ex1Main {

	public static void main(String[] args) {
		try {
			ObjectCreator.create(ClasseAnotada.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
