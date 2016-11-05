package aula03.static_inner_class;

public class OuterClass {
	int x = 10;

	/**
	 * Esta é uma inner classe estática. Ela não tem relação com a OuterClass,
	 * exceto o fato de estar declarada dentro da OuterClass.
	 * 
	 * @author Allan
	 *
	 */
	public static class StaticInnerClass {
		public void method() {
			System.out.println("Método da staticInnerClass");
		}
	}
	
	public class NonStaticInnerClass {
		public void method() {
			System.out.println("Método da nonStaticInnerClass");
		}
	}

}
