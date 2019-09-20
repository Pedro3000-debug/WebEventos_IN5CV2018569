package com.pedroronquillo.Entities;

import com.pedroronquillo.Entities.Detallecotizacion;
import com.pedroronquillo.Entities.Reservacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:46:12")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Date> fecha;
    public static volatile SingularAttribute<Cotizacion, String> formadepago;
    public static volatile CollectionAttribute<Cotizacion, Reservacion> reservacionCollection;
    public static volatile SingularAttribute<Cotizacion, Integer> idcotizacion;
    public static volatile SingularAttribute<Cotizacion, String> direccion;
    public static volatile SingularAttribute<Cotizacion, String> nombrefacturacion;
    public static volatile SingularAttribute<Cotizacion, String> telefono;
    public static volatile CollectionAttribute<Cotizacion, Detallecotizacion> detallecotizacionCollection;

}