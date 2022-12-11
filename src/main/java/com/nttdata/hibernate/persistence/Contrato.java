package com.nttdata.hibernate.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Taller 1 y 2 - Hibernate
 *
 * Entidad de tabla CONTRATO
 *
 * @author Daniel Alberto Cosa Cosias
 *
 */

@Entity
@Table(name = "contrato")
public class Contrato extends AbstractEntity implements Serializable {

    /** Serial Version */
    private static final long serialVersionUID = 1L;

    /** Identificador (LONG) */
    private Long id;

    /** Fecha de Vigencia (DATE) */
    private Date validityDate;

    /** Fecha de Caducidad (Date) */
    private Date expirationDate;

    /** Precio Mensual (INT) */
    private int monthlyPrice;

    /** ID de cliente (LONG) */
    private Cliente client;

    /**
     * @return CONTRACT_ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CONTRACT_ID", unique = true)
    public Long getContractId() {
        return id;
    }
    /**
     * @param id  CONTRACT_ID
     */
    @Id
    @Column(name = "CONTRACT_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public void setContractId(Long id) {
        this.id = id;
    }

    /**
     * @return VALIDITY_DATE
     */
    @Column(name = "VALIDITY_DATE", nullable = false)
    public Date getValidityDate() {
        return validityDate;
    }

    /**
     * @param validityDate VALIDITY_DATE
     */
    @Column(name = "VALIDITY_DATE", nullable = false)
    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    /**
     * @return EXPIRATION_DATE
     */
    @Column(name = "EXPIRATION_DATE")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate EXPIRATION_DATE
     */
    @Column(name = "EXPIRATION_DATE")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return MONTHLY_PRICE
     */
    @Column(name = "MONTHLY_PRICE")
    public int getMonthlyPrice() {
        return monthlyPrice;
    }

    /**
     * @param monthlyPrice MONTHLY_PRICE
     */
    @Column(name = "MONTHLY_PRICE")
    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    /**
     * @return CLIENT_ID
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    public Cliente getClient() {
        return client;
    }

    /**
     * @param client CLIENT_ID
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    public void setClient(Cliente client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Contrato [CLIENT_ID=" + id + ", VALIDITY_DATE=" + validityDate + ", EXPITRATION_DATE=" + expirationDate + ", MONTHLY_PRICE=" + monthlyPrice + ", CLIENT_ID=" + client + "]";
    }
}
