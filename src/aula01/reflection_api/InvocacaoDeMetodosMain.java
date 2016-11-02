package aula01.reflection_api;

import java.lang.reflect.Method;

/**
 * Nesta classe são feitas demonstrações da invocação de métodos de classes
 * utilizando a reflection API.
 * 
 * @author Allan
 *
 */
public class InvocacaoDeMetodosMain {

	public static void main(String[] args) {
		Class<Televisao> c = Televisao.class;

		try {
			Televisao tv = c.newInstance();

			// quando o método não tem parâmetros podemos passar apenas o nome
			// do método
			// ou usar ainda um seguindo parâmetro declarado como null
			Method m = c.getDeclaredMethod("ligar");
			m.invoke(tv);

			// método com parâmetro
			Method m2 = c.getDeclaredMethod("mudarCanal", int.class);
			m2.invoke(tv, 11);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
