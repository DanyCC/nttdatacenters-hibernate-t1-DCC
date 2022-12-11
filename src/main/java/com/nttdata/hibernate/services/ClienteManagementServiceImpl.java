package com.nttdata.hibernate.services;

import org.hibernate.Session;

import com.nttdata.hibernate.persistence.Cliente;
import com.nttdata.hibernate.persistence.ClienteDaoI;
import com.nttdata.hibernate.persistence.ClienteDaoImpl;

import java.util.List;

/**
 * Taller 1 y 2 - Hibernate
 *
 * Interfaz del servicio de Clientes (Implementacion).
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

public class ClienteManagementServiceImpl implements ClienteManagementServiceI {
	/** DAO: cliente */
	private ClienteDaoI clienteDao;

	/**
	 * Método constructor.
	 */
	public ClienteManagementServiceImpl(final Session session) {
		this.clienteDao = new ClienteDaoImpl(session);
	}

	@Override
	public void insertNewClient(final Cliente newCliente) {

		// Verificación de nulidad e inexistencia.
		if (newCliente != null && newCliente.getClientId() == null) {

			// Insercción del nuevo cliente.
			clienteDao.insert(newCliente);
		}

	}

	@Override
	public void updateClient(final Cliente updatedClient) {

		// Verificación de nulidad y existencia.
		if (updatedClient != null && updatedClient.getClientId() == null) {

			// Actualización del cliente.
			clienteDao.update(updatedClient);
		}

	}

	@Override
	public void deleteClient(final Cliente deletedClient) {

		// Verificación de nulidad y existencia.
		if (deletedClient != null && deletedClient.getClientId() == null) {

			// Eliminación del cliente.
			clienteDao.delete(deletedClient);
		}

	}

	@Override
	public Cliente searchById(final int clientId) {

		// Resultado.
		Cliente client = null;

		// Verificación de nulidad.
		if (clientId != 0) {

			// Obtención del cliente por ID.
			client = clienteDao.searchById(clientId);
		}

		return client;
	}

	@Override
	public List<Cliente> searchByNameAndSurnames(String name, String surname1, String surname2) {

		// Resultado.
		List<Cliente> playersList;

		// Obtención de clientes.
		playersList = clienteDao.searchByNameAndSurname(name, surname1, surname2);

		return playersList;
	}
}
