package com.nttdata.hibernate.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Taller 1 y 2 - Hibernate
 * 
 * Entidad Abstracta
 * 
 * @author Daniel Alberto Cosa Cosias
 *
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** Metodo ToString */
	public abstract String toString();
}
