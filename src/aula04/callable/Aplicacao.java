package aula04.callable;


public class Aplicacao {
	public static void main(String[] args) {
		MyCallableClass mcc = new MyCallableClass();
		try {
			String msgFromCallable = mcc.call();
			System.out.println(msgFromCallable);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
