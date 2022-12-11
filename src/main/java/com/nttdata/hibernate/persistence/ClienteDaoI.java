package com.nttdata.hibernate.persistence;

import java.util.List;

/**
 * Taller 1 y 2 - Hibernate
 * 
 * DAO de tabla CLIENTE
 * 
 * @author Daniel Alberto Cosa Cosias
 *
 */
public interface ClienteDaoI extends CommonDaoI<Cliente> {
	
	/**
	 * Obtiene clientes por nombre y apellido.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @return List<Cliente>
	 */
	public List<Cliente> searchByNameAndSurname(final String name, final String surname1, final String surname2);
}
