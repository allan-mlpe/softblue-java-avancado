package aula02.exercicios.exercicio1;

import java.util.ArrayList;

/**
 * Esta classe representa um Map para armazenar dados no esquema chave-valor.
 * @author Allan
 *
 */
public class Map<T, T1> {
	/**
	 * Lista de chaves do map
	 */
	private ArrayList<T> keys;
	/**
	 * Lista de valores do map
	 */
	private ArrayList<T1> values;
	
	/**
	 * Construtor padrão
	 */
	public Map() {
		keys = new ArrayList<T>();
		values = new ArrayList<T1>();
	}
	
	/**
	 * Adiciona uma nova entrada chave-valor ao map
	 * @param key chave
	 * @param value valor
	 * @return true se a inclusão for bem sucedida ou false caso contrário
	 */
	public boolean put(T key, T1 value) {
		boolean res = false;
		if(keys.contains(key)) {
			int keyIndex = keys.indexOf(key);
			T1 add = values.set(keyIndex, value);
			res = add != null;
		} else {
			keys.add(key);
			res = values.add(value);
		}
		return res;
	}
	
	/**
	 * Obtém um valor do map que está mapeado para a chave passada com parâmetro
	 * @param key chave do valor que está sendo buscado
	 * @return o valor correspondente à chave passada como parâmetro
	 */
	public T1 get(T key) {
		T1 value = null;
		if(keys.contains(key)) {
			int keyIndex = keys.indexOf(key);
			value = values.get(keyIndex);
		}
		return value;
	}
	
	/**
	 * Limpa o map apagando todas as entradas chave-valor
	 */
	public void clear() {
		keys.clear();
		values.clear();
	}
}
