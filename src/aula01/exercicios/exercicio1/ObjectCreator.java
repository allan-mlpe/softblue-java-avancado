package aula01.exercicios.exercicio1;

import java.lang.reflect.Method;

public class ObjectCreator {
	public static <T> T create(Class<T> classe) throws Exception {
		Method[] methods = classe.getMethods();
		T obj = classe.newInstance();
		
		for(Method m : methods) {
			Init annotation = m.getAnnotation(Init.class);
			if(annotation != null) {
				if(annotation.runOnInstantiation()) {
					m.invoke(obj);
				}
			}
		}
		
		return obj;
	}
}
