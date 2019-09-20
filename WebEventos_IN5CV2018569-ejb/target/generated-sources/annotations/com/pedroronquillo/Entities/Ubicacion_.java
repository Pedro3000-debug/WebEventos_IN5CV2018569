package com.pedroronquillo.Entities;

import com.pedroronquillo.Entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:46:12")
@StaticMetamodel(Ubicacion.class)
public class Ubicacion_ { 

    public static volatile CollectionAttribute<Ubicacion, Reservacion> reservacionCollection;
    public static volatile SingularAttribute<Ubicacion, String> lugarreservacion;
    public static volatile SingularAttribute<Ubicacion, Integer> idubicacion;
    public static volatile SingularAttribute<Ubicacion, String> salon;

}