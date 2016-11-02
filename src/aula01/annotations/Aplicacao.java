package aula01.annotations;

import java.lang.reflect.Method;
/**
 * Nesta classe vamos criar um objeto e invocar seus métodos anotados com a annotation {@link Executar} 
 * @author Allan
 *
 */
public class Aplicacao {

	private static void executar(Object o) throws Exception {
		
		Method[] methods = o.getClass().getDeclaredMethods();
		
		for(Method m : methods) {
			Executar e = m.getAnnotation(Executar.class);
			if(e != null) {
				String arg = e.arg(); //valor de arg passado na anotação do método
				m.invoke(o, arg);
			}
		}
		
	}	
	
	public static void main(String[] args) {
		try {
			Teste t = new Teste();
			executar(t);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
