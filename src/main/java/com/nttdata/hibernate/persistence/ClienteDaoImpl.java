package com.nttdata.hibernate.persistence;

import java.util.List;

import org.hibernate.Session;

/**
 * Taller 1 y 2 - Hibernate
 * 
 * DAO de tabla CLIENTES (Implementacion)
 * 
 * @author Daniel Alberto Cosa Cosias
 *
 */
public class ClienteDaoImpl extends CommonDaoImpl<Cliente> implements ClienteDaoI{

	public ClienteDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	@Override
	public List<Cliente> searchByNameAndSurname(String name, String surname1, String surname2) {
		
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Localiza clientes en funcion del nombre y apellidos.
				@SuppressWarnings("unchecked")
				final List<Cliente> clientList = session.createQuery("FROM CLIENTS WHERE NAME='" + name + "' && " + "FIRST_SURNAME='" + surname1 + "' && " + "SECOND_SURNAME='" + surname2 + "'").list();

				return clientList;
	}

}
