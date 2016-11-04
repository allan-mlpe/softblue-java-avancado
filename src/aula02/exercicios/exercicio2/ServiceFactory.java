package aula02.exercicios.exercicio2;

public class ServiceFactory implements Service {
	
	public static <T extends Service> T newInstance(Class<T> c) throws InstantiationException, IllegalAccessException {
		T obj = c.newInstance();
		return obj;
	}
}
