/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedroronquillo.Entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "reservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacion.findAll", query = "SELECT r FROM Reservacion r")
    , @NamedQuery(name = "Reservacion.findByIdreservacion", query = "SELECT r FROM Reservacion r WHERE r.idreservacion = :idreservacion")
    , @NamedQuery(name = "Reservacion.findByFecha", query = "SELECT r FROM Reservacion r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Reservacion.findByHorainicio", query = "SELECT r FROM Reservacion r WHERE r.horainicio = :horainicio")
    , @NamedQuery(name = "Reservacion.findByHorafinal", query = "SELECT r FROM Reservacion r WHERE r.horafinal = :horafinal")})
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "horainicio")
    @Temporal(TemporalType.TIME)
    private Date horainicio;
    @Column(name = "horafinal")
    @Temporal(TemporalType.TIME)
    private Date horafinal;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne
    private Cliente idcliente;
    @JoinColumn(name = "idsucursal", referencedColumnName = "idsucursal")
    @ManyToOne
    private Sucursales idsucursal;
    @JoinColumn(name = "idtipoevento", referencedColumnName = "idtipodeevento")
    @ManyToOne
    private Tipoevento idtipoevento;
    @JoinColumn(name = "idubicacion", referencedColumnName = "idubicacion")
    @ManyToOne
    private Ubicacion idubicacion;
    @JoinColumn(name = "idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne
    private Cotizacion idcotizacion;

    public Reservacion() {
    }

    public Reservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(Date horafinal) {
        this.horafinal = horafinal;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Sucursales getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(Sucursales idsucursal) {
        this.idsucursal = idsucursal;
    }

    public Tipoevento getIdtipoevento() {
        return idtipoevento;
    }

    public void setIdtipoevento(Tipoevento idtipoevento) {
        this.idtipoevento = idtipoevento;
    }

    public Ubicacion getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(Ubicacion idubicacion) {
        this.idubicacion = idubicacion;
    }

    public Cotizacion getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Cotizacion idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservacion != null ? idreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.idreservacion == null && other.idreservacion != null) || (this.idreservacion != null && !this.idreservacion.equals(other.idreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pedroronquillo.com.pedroronquillo.Entities.Reservacion[ idreservacion=" + idreservacion + " ]";
    }
    
}
