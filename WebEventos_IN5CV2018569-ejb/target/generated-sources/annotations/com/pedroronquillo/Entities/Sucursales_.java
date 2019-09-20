package com.pedroronquillo.Entities;

import com.pedroronquillo.Entities.Area;
import com.pedroronquillo.Entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:46:12")
@StaticMetamodel(Sucursales.class)
public class Sucursales_ { 

    public static volatile CollectionAttribute<Sucursales, Reservacion> reservacionCollection;
    public static volatile SingularAttribute<Sucursales, String> salones;
    public static volatile SingularAttribute<Sucursales, String> direccion;
    public static volatile SingularAttribute<Sucursales, Integer> idsucursal;
    public static volatile CollectionAttribute<Sucursales, Area> areaCollection;
    public static volatile SingularAttribute<Sucursales, String> nombre;

}