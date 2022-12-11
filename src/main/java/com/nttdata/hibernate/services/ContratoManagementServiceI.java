package com.nttdata.hibernate.services;

import com.nttdata.hibernate.persistence.Contrato;

import java.util.List;

/**
 * Taller 1 y 2 - Hibernate
 *
 * Interfaz del servicio de Contratos.
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

public interface ContratoManagementServiceI {
    /**
     * Inserta un nuevo contrato.
     *
     * @param newContract
     */
    public void insertNewContract(final Contrato newContract);

    /**
     * Actualiza un contrato existente.
     *
     * @param updatedContract
     */
    public void updateContract(final Contrato updatedContract);

    /**
     * Elimina un contrato existente.
     *
     * @param deletedContract
     */
    public void deleteContract(final Contrato deletedContract);

    /**
     * Obtiene un contrato mediante su ID.
     *
     * @param contractId
     */
    public Contrato searchById(final int contractId);

    /**
     * Obtiene contratos por id de cliente.
     *
     * @param id
     * @return List<Contrato>
     */
    public List<Contrato> searchByClientId(final Long id);
}
