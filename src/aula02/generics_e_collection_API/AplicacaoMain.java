package aula02.generics_e_collection_API;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoMain {

	public static void main(String[] args) {
		/*
		//Exemplo sem o generics
		List l1 = new ArrayList();
		l1.add("Casa");
		l1.add("Sapato");
		l1.add("abc");
		l1.add(new Integer(11)); //como não paremetrizamos um tipo, a lista aceita qualquer Object
		
		for(Object o : l1) {
			System.out.println((String) o); //no entanto, o objeto Integer irá causar uma exceção no momento do cast
		}
		*/
		
		//Usando o generics
		List<String> l2 = new ArrayList<String>();
		l2.add("def");
		l2.add("Carro");
		l2.add("Computador");
		
		for(String s : l2) { //podemos chamar os elementos da lista diretamente como String
			System.out.println(s); //dispensamos a necessidade do cast
		}
		
		
	}

}
