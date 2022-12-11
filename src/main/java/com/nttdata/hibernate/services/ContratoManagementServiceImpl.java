package com.nttdata.hibernate.services;

import com.nttdata.hibernate.persistence.Contrato;
import com.nttdata.hibernate.persistence.ContratoDaoI;
import com.nttdata.hibernate.persistence.ContratoDaoImpl;
import org.hibernate.Session;

/**
 * Taller 1 y 2 - Hibernate
 *
 * Interfaz del servicio de Contratos (Implementacion).
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

import java.util.List;

public class ContratoManagementServiceImpl implements ContratoManagementServiceI{
    /** DAO: contrato */
    private ContratoDaoI contratoDao;

    /**
     * Método constructor.
     */
    public ContratoManagementServiceImpl(final Session session) {
        this.contratoDao = new ContratoDaoImpl(session);
    }

    @Override
    public void insertNewContract(Contrato newContract) {
        // Verificación de nulidad e inexistencia.
        if (newContract != null && newContract.getContractId() == null) {

            // Insercción del nuevo contrato.
            contratoDao.insert(newContract);
        }
    }

    @Override
    public void updateContract(Contrato updatedContract) {
        // Verificación de nulidad e inexistencia.
        if (updatedContract != null && updatedContract.getContractId() == null) {

            // Actualizacion del contrato.
            contratoDao.update(updatedContract);
        }
    }

    @Override
    public void deleteContract(Contrato deletedContract) {
        // Verificación de nulidad e inexistencia.
        if (deletedContract != null && deletedContract.getContractId() == null) {

            // Borrado del contrato.
            contratoDao.delete(deletedContract);
        }
    }

    @Override
    public Contrato searchById(int contractId) {
        return null;
    }

    @Override
    public List<Contrato> searchByClientId(Long id) {
        // Resultado.
        List<Contrato> contractList;

        // Obtención de contratos.
        contractList = contratoDao.searchByClientId(id);
        return contractList;
    }
}
