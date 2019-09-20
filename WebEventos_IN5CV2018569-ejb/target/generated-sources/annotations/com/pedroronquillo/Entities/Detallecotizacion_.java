package com.pedroronquillo.Entities;

import com.pedroronquillo.Entities.Cotizacion;
import com.pedroronquillo.Entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:46:12")
@StaticMetamodel(Detallecotizacion.class)
public class Detallecotizacion_ { 

    public static volatile SingularAttribute<Detallecotizacion, Integer> iddetallecotizacion;
    public static volatile SingularAttribute<Detallecotizacion, Cotizacion> idcotizacion;
    public static volatile SingularAttribute<Detallecotizacion, Double> precioventa;
    public static volatile SingularAttribute<Detallecotizacion, Producto> idproducto;
    public static volatile SingularAttribute<Detallecotizacion, Double> preciofacturacion;

}