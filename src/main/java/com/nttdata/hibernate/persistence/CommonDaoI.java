package com.nttdata.hibernate.persistence;

import java.util.List;

/**
 * Taller 1 y 2 - Hibernate
 * 
 * DAO generico
 * 
 * @author Daniel Alberto Cosa Cosias
 *
 */
public interface CommonDaoI<T> {
	/**
	 * Inserta un registro en BBDD.
	 * 
	 * @param paramT
	 */
	public void insert(final T paramT);

	/**
	 * Actualiza un registro en BBDD.
	 * 
	 * @param paramT
	 */
	public void update(final T paramT);
	
	/**
	 * Elimina un registro en BBDD.
	 * 
	 * @param paramT
	 */
	public void delete(final T paramT);
	
	/**
	 * Localiza un registro por ID en BBDD.
	 * 
	 * @param id
	 */
	public T searchById(final int id);

	/**
	 * Búsqueda de todos los registros en BBDD.
	 * 
	 * @return List<T>
	 */
	public List<T> searchAll();
}
