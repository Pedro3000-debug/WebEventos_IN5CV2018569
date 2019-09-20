/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedroronquillo.Entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "tipoevento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoevento.findAll", query = "SELECT t FROM Tipoevento t")
    , @NamedQuery(name = "Tipoevento.findByIdtipodeevento", query = "SELECT t FROM Tipoevento t WHERE t.idtipodeevento = :idtipodeevento")
    , @NamedQuery(name = "Tipoevento.findByIdreservacion", query = "SELECT t FROM Tipoevento t WHERE t.idreservacion = :idreservacion")
    , @NamedQuery(name = "Tipoevento.findByDescripcion", query = "SELECT t FROM Tipoevento t WHERE t.descripcion = :descripcion")})
public class Tipoevento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipodeevento")
    private Integer idtipodeevento;
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idtipoevento")
    private Collection<Reservacion> reservacionCollection;

    public Tipoevento() {
    }

    public Tipoevento(Integer idtipodeevento) {
        this.idtipodeevento = idtipodeevento;
    }

    public Integer getIdtipodeevento() {
        return idtipodeevento;
    }

    public void setIdtipodeevento(Integer idtipodeevento) {
        this.idtipodeevento = idtipodeevento;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Reservacion> getReservacionCollection() {
        return reservacionCollection;
    }

    public void setReservacionCollection(Collection<Reservacion> reservacionCollection) {
        this.reservacionCollection = reservacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodeevento != null ? idtipodeevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoevento)) {
            return false;
        }
        Tipoevento other = (Tipoevento) object;
        if ((this.idtipodeevento == null && other.idtipodeevento != null) || (this.idtipodeevento != null && !this.idtipodeevento.equals(other.idtipodeevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pedroronquillo.com.pedroronquillo.Entities.Tipoevento[ idtipodeevento=" + idtipodeevento + " ]";
    }
    
}
