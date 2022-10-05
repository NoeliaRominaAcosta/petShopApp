package petshop.logic;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import petshop.logic.Duenio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-05T14:16:12", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, String> specialPet;
    public static volatile SingularAttribute<Mascota, String> namePet;
    public static volatile SingularAttribute<Mascota, String> colorPet;
    public static volatile SingularAttribute<Mascota, String> razaPet;
    public static volatile SingularAttribute<Mascota, Duenio> unDuenio;
    public static volatile SingularAttribute<Mascota, String> obsPet;
    public static volatile SingularAttribute<Mascota, String> alergicPet;

}