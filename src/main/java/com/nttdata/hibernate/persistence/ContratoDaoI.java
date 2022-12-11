package com.nttdata.hibernate.persistence;

import java.util.List;

/**
 * Taller 1 y 2 - Hibernate
 *
 * DAO de tabla CONTRATO
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

public interface ContratoDaoI extends CommonDaoI<Contrato> {

    /**
     * Obtiene contratos por id de cliente.
     *
     * @param client_id
     * @return List<Contrato>
     */
    public List<Contrato> searchByClientId(final Long client_id);
}
