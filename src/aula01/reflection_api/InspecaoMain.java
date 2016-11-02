package aula01.reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Nesta classe é feita a demonstração de como inspecionar os atributos e
 * métodos de uma classe utilizando como base a reflection API.
 * 
 * @author Allan
 *
 */

public class InspecaoMain {

	public static void main(String[] args) {

		Class<Televisao> c = Televisao.class;

		/*
		 * //outra forma de fazer try { Class c1 =
		 * Class.forName("aula01.reflection_api.Televisao");
		 * System.out.println(c1.getSimpleName()); //imprime o nome simples da
		 * classe System.out.println(c1.getName()); //imprime o nome completo da
		 * classe, incluindo sua estrutura de pacotes } catch(Exception e) {
		 * e.printStackTrace(); }
		 * 
		 * //mais uma forma de fazer Class<Televisao> c2 = Televisao.class;
		 */

		// obtém os atributos da classe
		// Field[] fields = c.getFields(); //retorna apenas os atributos
		// publicos da classe
		Field[] fields = c.getDeclaredFields();

		System.out.println("ATRIBUTOS");
		System.out.println("=======================");
		System.out.println(String.format("|%-10s|%10s|", "Nome", "Tipo"));

		for (Field f : fields) {
			// System.out.println(f.getName() + "\t --> " + f.getGenericType());
			System.out.println(String.format("|%-10s|%10s|", f.getName(),
					f.getType())); // -10 define o tamanho da string. Se a
									// string for menor, será completada com
									// espaços em branco. O sinal de - adiciona
									// os espaços à direita.
		}

		System.out.println("********************************************");
		System.out.println("MÉTODOS");
		System.out.println("=================================================");
		System.out.println(String.format("|%-15s|%-15s|%-15s|", "Método",
				"Parâmetros", "Retorno"));

		// Method[] methods = c.getMethods(); //retorna todos os métodos,
		// incluindo toString, equals, wait, etc.
		Method[] methods = c.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println(String.format("|%-15s|%-15s|%-15s|",
					m.getName(), m.getParameterCount(), m.getReturnType()));
		}
	}

}
