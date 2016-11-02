package aula01.exercicios.exercicio2;

import java.lang.reflect.Field;

public class Property {
	
	public static void set(Object o, String field, String value) throws Exception {
		Field f = o.getClass().getDeclaredField(field);
		f.set(o, value);
	}
	
	public static <T> Object get(Object o, String field, Class<T> c) throws Exception {
		Field f = o.getClass().getDeclaredField(field);
		
		return f.get(o);
	}
}
