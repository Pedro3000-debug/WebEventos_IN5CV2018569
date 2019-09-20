/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedroronquillo.Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizacion.findAll", query = "SELECT c FROM Cotizacion c")
    , @NamedQuery(name = "Cotizacion.findByIdcotizacion", query = "SELECT c FROM Cotizacion c WHERE c.idcotizacion = :idcotizacion")
    , @NamedQuery(name = "Cotizacion.findByNombrefacturacion", query = "SELECT c FROM Cotizacion c WHERE c.nombrefacturacion = :nombrefacturacion")
    , @NamedQuery(name = "Cotizacion.findByDireccion", query = "SELECT c FROM Cotizacion c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Cotizacion.findByTelefono", query = "SELECT c FROM Cotizacion c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Cotizacion.findByFecha", query = "SELECT c FROM Cotizacion c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cotizacion.findByFormadepago", query = "SELECT c FROM Cotizacion c WHERE c.formadepago = :formadepago")})
public class Cotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcotizacion")
    private Integer idcotizacion;
    @Size(max = 45)
    @Column(name = "nombrefacturacion")
    private String nombrefacturacion;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "formadepago")
    private String formadepago;
    @OneToMany(mappedBy = "idcotizacion")
    private Collection<Reservacion> reservacionCollection;
    @OneToMany(mappedBy = "idcotizacion")
    private Collection<Detallecotizacion> detallecotizacionCollection;

    public Cotizacion() {
    }

    public Cotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Integer getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public String getNombrefacturacion() {
        return nombrefacturacion;
    }

    public void setNombrefacturacion(String nombrefacturacion) {
        this.nombrefacturacion = nombrefacturacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    @XmlTransient
    public Collection<Reservacion> getReservacionCollection() {
        return reservacionCollection;
    }

    public void setReservacionCollection(Collection<Reservacion> reservacionCollection) {
        this.reservacionCollection = reservacionCollection;
    }

    @XmlTransient
    public Collection<Detallecotizacion> getDetallecotizacionCollection() {
        return detallecotizacionCollection;
    }

    public void setDetallecotizacionCollection(Collection<Detallecotizacion> detallecotizacionCollection) {
        this.detallecotizacionCollection = detallecotizacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizacion != null ? idcotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacion)) {
            return false;
        }
        Cotizacion other = (Cotizacion) object;
        if ((this.idcotizacion == null && other.idcotizacion != null) || (this.idcotizacion != null && !this.idcotizacion.equals(other.idcotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pedroronquillo.com.pedroronquillo.Entities.Cotizacion[ idcotizacion=" + idcotizacion + " ]";
    }
    
}
