/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedroronquillo.SessionBean;

import com.pedroronquillo.Entities.Detallecotizacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class DetallecotizacionFacade extends AbstractFacade<Detallecotizacion> implements DetallecotizacionFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5CV_2018569PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallecotizacionFacade() {
        super(Detallecotizacion.class);
    }
    
}
