package com.nttdata.hibernate;

import com.nttdata.hibernate.persistence.Contrato;
import com.nttdata.hibernate.services.ContratoManagementServiceI;
import com.nttdata.hibernate.services.ContratoManagementServiceImpl;
import org.hibernate.Session;

import com.nttdata.hibernate.persistence.Cliente;
import com.nttdata.hibernate.services.ClienteManagementServiceI;
import com.nttdata.hibernate.services.ClienteManagementServiceImpl;

import java.sql.Date;

/**
 * Taller 1 y 2 - Hibernate
 *
 * Clase Main.
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

public class Main {

	public static void main(String[] args) {
		
		final Session session = HibernateUtil.getSessionFactory().openSession();
		final ClienteManagementServiceI clientService = new ClienteManagementServiceImpl(session);
		final ContratoManagementServiceI contratoService = new ContratoManagementServiceImpl(session);
		
		final Cliente client1 = new Cliente();
		client1.setName("Manuel");
		client1.setFirstSurname("Casado");
		client1.setSecondSurname("Morales");
		client1.setDni("42834934D");
		
		final Cliente client2 = new Cliente();
		client2.setName("Javier");
		client2.setFirstSurname("Galvan");
		client2.setSecondSurname("Silva");
		client2.setDni("34892394G");

		clientService.insertNewClient(client1);
		clientService.insertNewClient(client2);

		final Contrato contract1 = new Contrato();
		contract1.setValidityDate(Date.valueOf("2018-12-27"));
		contract1.setExpirationDate(Date.valueOf("2023-12-27"));
		contract1.setMonthlyPrice(1400);
		contract1.setClient(client1);

		final Contrato contract2 = new Contrato();
		contract2.setValidityDate(Date.valueOf("2016-7-16"));
		contract2.setExpirationDate(Date.valueOf("2026-7-17"));
		contract2.setMonthlyPrice(1700);
		contract2.setClient(client2);

		contratoService.insertNewContract(contract1);
		contratoService.insertNewContract(contract2);


		session.close();
	}

}
