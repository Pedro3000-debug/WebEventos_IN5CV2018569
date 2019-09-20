package com.pedroronquillo.Entities;

import com.pedroronquillo.Entities.Cliente;
import com.pedroronquillo.Entities.Cotizacion;
import com.pedroronquillo.Entities.Sucursales;
import com.pedroronquillo.Entities.Tipoevento;
import com.pedroronquillo.Entities.Ubicacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:46:12")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Date> fecha;
    public static volatile SingularAttribute<Reservacion, Cotizacion> idcotizacion;
    public static volatile SingularAttribute<Reservacion, Date> horafinal;
    public static volatile SingularAttribute<Reservacion, Sucursales> idsucursal;
    public static volatile SingularAttribute<Reservacion, Date> horainicio;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;
    public static volatile SingularAttribute<Reservacion, Cliente> idcliente;
    public static volatile SingularAttribute<Reservacion, Tipoevento> idtipoevento;
    public static volatile SingularAttribute<Reservacion, Ubicacion> idubicacion;

}