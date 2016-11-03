package aula02.wildcards;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoMain {
	/**
	 * Recebe uma lista de bebidas e chama o método preparar de cada item da
	 * lista. Como o polimorfismo não é válido no Generics, este método não
	 * funciona caso seja passada uma lista de cafés ou chás.
	 * 
	 * @param bebidas
	 *            lista de bebidas
	 */
	public static void prepararBebidas(List<Bebida> bebidas) {
		for (Bebida b : bebidas) {
			b.preparar();
		}
	}

	/**
	 * Recebe uma lista de bebidas e chama o método preparar de cada item da
	 * lista. Neste caso, como usamos o wildcard com a keyword extends, podemos
	 * passar como parâmetro uma lista de qualquer objeto que seja do tipo
	 * Bebida ou de uma subclasse de Bebida, como Cafe ou Cha, por exemplo.
	 * 
	 * @param bebidas
	 *            lista de bebidas
	 */
	public static void prepararBebidasComExtends(List<? extends Bebida> bebidas) {
		for (Bebida b : bebidas) {
			b.preparar();
		}
	}

	/**
	 * Recebe uma lista de bebidas e chama o método preparar de cada item da
	 * lista. Neste caso, como usamos o wildcard com a keyword super, podemos
	 * passar como parâmetro uma lista de qualquer objeto que seja do tipo Cafe
	 * ou de uma superclasse, como Bebida ou Object, por exemplo. Porém, é
	 * necessário fazer um cast no corpo do método.
	 * 
	 * @param bebidas
	 */
	public static void prepararBebidasComSuper(List<? super Cafe> bebidas) {
		for (Object b : bebidas) {
			Cafe c = (Cafe) b;
			c.preparar();
		}
	}
	
	public static void main(String[] args) {
		List<Bebida> bebidas = new ArrayList<Bebida>();
		bebidas.add(new Cafe());
		bebidas.add(new Cha());

		List<Cafe> cafes = new ArrayList<Cafe>();
		cafes.add(new Cafe());
		cafes.add(new Cafe());
		
		List<Cha> chas = new ArrayList<Cha>();
		chas.add(new Cha());
		chas.add(new Cha());
		
		
		//só funciona com uma lista de bebidas
		prepararBebidas(bebidas);

		// prepararBebidas(cafes); 	//causa erro de compilação. Só aceita lista
									// de elementos do tipo Bebida.
		prepararBebidasComExtends(bebidas);
		prepararBebidasComExtends(cafes);
		prepararBebidasComExtends(chas);
		
		
		prepararBebidasComSuper(bebidas);
		prepararBebidasComSuper(cafes);
		//prepararBebidasComSuper(chas); //causa erro de compilação. Cha não é do tipo Cafe e nem está na hierarquia das superclasses de Cafe.
	}
}
