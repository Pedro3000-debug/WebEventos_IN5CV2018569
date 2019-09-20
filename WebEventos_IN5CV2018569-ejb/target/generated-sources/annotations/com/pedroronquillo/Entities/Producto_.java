package com.pedroronquillo.Entities;

import com.pedroronquillo.Entities.Detallecotizacion;
import com.pedroronquillo.Entities.Tipoproducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:46:12")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile SingularAttribute<Producto, Date> fechaVencimineto;
    public static volatile CollectionAttribute<Producto, Tipoproducto> tipoproductoCollection;
    public static volatile SingularAttribute<Producto, Integer> idproducto;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile CollectionAttribute<Producto, Detallecotizacion> detallecotizacionCollection;

}