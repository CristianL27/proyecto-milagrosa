package com.milagrosa.inventario.logic;

import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-01-17T02:37:03", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Lotes.class)
public class Punto_ { 

    public static volatile SingularAttribute<Lotes, Integer> nLote;
    public static volatile SingularAttribute<Lotes, Date> fecha;
    public static volatile SingularAttribute<Lotes, Float> monto;

}