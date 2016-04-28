package entities;

import entities.Recette;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-28T18:32:44")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> prenom;
    public static volatile SingularAttribute<Utilisateur, String> etat;
    public static volatile SingularAttribute<Utilisateur, String> mail;
    public static volatile SingularAttribute<Utilisateur, String> pseudo;
    public static volatile SingularAttribute<Utilisateur, Boolean> isAdmin;
    public static volatile SingularAttribute<Utilisateur, String> password;
    public static volatile CollectionAttribute<Utilisateur, Recette> recetteCollection;
    public static volatile SingularAttribute<Utilisateur, String> nom;

}