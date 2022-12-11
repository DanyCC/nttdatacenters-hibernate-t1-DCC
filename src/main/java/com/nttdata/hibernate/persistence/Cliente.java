package com.nttdata.hibernate.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Taller 1 y 2 - Hibernate
 * 
 * Entidad de tabla CLIENTE
 * 
 * @author Daniel Alberto Cosa Cosias
 *
 */

@Entity
@Table(name = "cliente")
public class Cliente extends AbstractEntity implements Serializable {
	
	/** Serial Version */
	private static final long serialVersionUID = 1L;
	
	/** Identificador (LONG) */
	private Long id;
	
	/** Nombre */
	private String name;
	
	/** Primer Apellido */
	private String firstSurname;

	/** Segundo Apellido */
	private String secondSurname;
	
	/** DNI */
	private String dni;

	/**
	 * @return CLIENT_ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLIENT_ID")
	public Long getClientId() {
		return id;
	}
	/**
	 * @param id  CLIENT_ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLIENT_ID")
	public void setClientId(Long id) {
		this.id = id;
	}

	/**
	 * @return NAME
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name set NAME
	 */
	@Column(name = "NAME")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return FIRST_SURNAME
	 */
	@Column(name = "FIRST_SURNAME")
	public String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * @param surname set FIRST_SURNAME
	 */
	@Column(name = "FIRST_SURNAME")
	public void setFirstSurname(String surname) {
		firstSurname = surname;
	}

	/**
	 * @return SECOND_SURNAME
	 */
	@Column(name = "SECOND_SURNAME")
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @param surname set SECOND_SURNAME
	 */
	@Column(name = "SECOND_SURNAME")
	public void setSecondSurname(String surname) {
		secondSurname = surname;
	}

	/**
	 * @return DNI
	 */
	@Column(name = "DNI", nullable = false)
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni set DNI
	 */
	@Column(name = "DNI",  nullable = false)
	public void setDni(String dni) {
		if (dni.length() == 9 && dni.substring(0, 7).matches("-?\\d+(\\.\\d+)?") && Character.isAlphabetic(dni.charAt(8))) {
			this.dni = dni;
		} else {
			System.out.println("Error en la validacion: Formato de DNI incorrecto. Formato: NNNNNNNNX");
		}
	}

	@Override
	public String toString() {
		return "Cliente [CLIENT_ID=" + id + ", NAME=" + name + ", FIRST_SURNAME=" + firstSurname + ", SECOND_SURNAME=" + secondSurname + ", DNI=" + dni + "]";
	}
}
