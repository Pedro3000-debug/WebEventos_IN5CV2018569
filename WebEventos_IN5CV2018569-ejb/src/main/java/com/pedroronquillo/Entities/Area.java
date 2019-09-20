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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a")
    , @NamedQuery(name = "Area.findByIdarea", query = "SELECT a FROM Area a WHERE a.idarea = :idarea")
    , @NamedQuery(name = "Area.findByLugarrversacion", query = "SELECT a FROM Area a WHERE a.lugarrversacion = :lugarrversacion")
    , @NamedQuery(name = "Area.findBySalon", query = "SELECT a FROM Area a WHERE a.salon = :salon")})
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarea")
    private Integer idarea;
    @Size(max = 45)
    @Column(name = "lugarrversacion")
    private String lugarrversacion;
    @Size(max = 45)
    @Column(name = "salon")
    private String salon;
    @JoinColumn(name = "idsucursal", referencedColumnName = "idsucursal")
    @ManyToOne
    private Sucursales idsucursal;

    public Area() {
    }

    public Area(Integer idarea) {
        this.idarea = idarea;
    }

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }

    public String getLugarrversacion() {
        return lugarrversacion;
    }

    public void setLugarrversacion(String lugarrversacion) {
        this.lugarrversacion = lugarrversacion;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public Sucursales getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(Sucursales idsucursal) {
        this.idsucursal = idsucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarea != null ? idarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.idarea == null && other.idarea != null) || (this.idarea != null && !this.idarea.equals(other.idarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pedroronquillo.com.pedroronquillo.Entities.Area[ idarea=" + idarea + " ]";
    }
    
}
