/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedroronquillo.Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallecotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecotizacion.findAll", query = "SELECT d FROM Detallecotizacion d")
    , @NamedQuery(name = "Detallecotizacion.findByIddetallecotizacion", query = "SELECT d FROM Detallecotizacion d WHERE d.iddetallecotizacion = :iddetallecotizacion")
    , @NamedQuery(name = "Detallecotizacion.findByPreciofacturacion", query = "SELECT d FROM Detallecotizacion d WHERE d.preciofacturacion = :preciofacturacion")
    , @NamedQuery(name = "Detallecotizacion.findByPrecioventa", query = "SELECT d FROM Detallecotizacion d WHERE d.precioventa = :precioventa")})
public class Detallecotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallecotizacion")
    private Integer iddetallecotizacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preciofacturacion")
    private Double preciofacturacion;
    @Column(name = "precioventa")
    private Double precioventa;
    @JoinColumn(name = "idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne
    private Cotizacion idcotizacion;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne
    private Producto idproducto;

    public Detallecotizacion() {
    }

    public Detallecotizacion(Integer iddetallecotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
    }

    public Integer getIddetallecotizacion() {
        return iddetallecotizacion;
    }

    public void setIddetallecotizacion(Integer iddetallecotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
    }

    public Double getPreciofacturacion() {
        return preciofacturacion;
    }

    public void setPreciofacturacion(Double preciofacturacion) {
        this.preciofacturacion = preciofacturacion;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    public Cotizacion getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Cotizacion idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallecotizacion != null ? iddetallecotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecotizacion)) {
            return false;
        }
        Detallecotizacion other = (Detallecotizacion) object;
        if ((this.iddetallecotizacion == null && other.iddetallecotizacion != null) || (this.iddetallecotizacion != null && !this.iddetallecotizacion.equals(other.iddetallecotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pedroronquillo.com.pedroronquillo.Entities.Detallecotizacion[ iddetallecotizacion=" + iddetallecotizacion + " ]";
    }
    
}
