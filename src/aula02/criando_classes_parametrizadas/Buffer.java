package aula02.criando_classes_parametrizadas;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um buffer de elementos que podem ser parametrizados.
 * @author Allan
 */
public class Buffer<T> {
	
	private List<T> lista = new ArrayList<T>();
	
	/**
	 * Adiciona um objeto qualquer à lista do buffer.
	 * @param obj objeto a ser adicionado ao buffer.
	 */
	public void adicionar(T obj) {
		lista.add(obj);
	}
	
	/**
	 * Remove o primeiro elemento do buffer e retorna-o.
	 * @return primeiro elemento da fila do buffer.
	 */
	public T remover() {
		T obj = lista.get(0);
		lista.remove(0);
		
		return obj;
	}
}
