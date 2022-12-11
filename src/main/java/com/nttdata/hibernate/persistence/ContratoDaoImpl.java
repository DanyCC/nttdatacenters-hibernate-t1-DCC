package com.nttdata.hibernate.persistence;

import org.hibernate.Session;

import java.util.List;

/**
 * Taller 1 y 2 - Hibernate
 *
 * DAO de tabla CONTRATO (Implementacion)
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

public class ContratoDaoImpl extends CommonDaoImpl<Contrato> implements ContratoDaoI{

    public ContratoDaoImpl(Session session) {
        super(session);
        this.session = session;
    }

    @Override
    public List<Contrato> searchByClientId(Long client_id) {
        // Verificación de sesión abierta.
        if (!session.getTransaction().isActive()) {
            session.getTransaction().begin();
        }

        // Localiza contratos en funcion del id de cliente.
        final List<Contrato> contractList = session.createQuery("FROM CLIENTS WHERE CLIENT_ID= " + client_id + "'").list();

        return contractList;
    }
}
