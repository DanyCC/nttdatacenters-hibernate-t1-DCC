package com.nttdata.hibernate.services;

import java.util.List;

import com.nttdata.hibernate.persistence.Cliente;

/**
 * Taller 1 y 2 - Hibernate
 * 
 * Interfaz del servicio de Clientes.
 * 
 * @author Daniel Alberto Cosa Cosias
 *
 */
public interface ClienteManagementServiceI {
	
	/**
	 * Inserta un nuevo cliente.
	 * 
	 * @param newClient
	 */
	public void insertNewClient(final Cliente newClient);

	/**
	 * Actualiza un cliente existente.
	 * 
	 * @param updatedClient
	 */
	public void updateClient(final Cliente updatedClient);

	/**
	 * Elimina un cliente existente.
	 * 
	 * @param deletedClient
	 */
	public void deleteClient(final Cliente deletedClient);

	/**
	 * Obtiene un cliente mediante su ID.
	 * 
	 * @param clientId
	 */
	public Cliente searchById(final int clientId);

	/**
	 * Obtiene clientes por nombre y apellidos.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @return List<Contrato>
	 */
	public List<Cliente> searchByNameAndSurnames(final String name, final String surname1, final String surname2);
}
