package entities;

import entities.Ingredient;
import entities.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-28T18:32:44")
@StaticMetamodel(Recette.class)
public class Recette_ { 

    public static volatile SingularAttribute<Recette, Integer> id;
    public static volatile SingularAttribute<Recette, String> preparation;
    public static volatile SingularAttribute<Recette, String> remarque;
    public static volatile SingularAttribute<Recette, String> motsCles;
    public static volatile SingularAttribute<Recette, Boolean> difficulte;
    public static volatile CollectionAttribute<Recette, Ingredient> ingredientCollection;
    public static volatile SingularAttribute<Recette, Short> tempsCuisson;
    public static volatile SingularAttribute<Recette, String> nom;
    public static volatile SingularAttribute<Recette, Short> tempsPreparation;
    public static volatile SingularAttribute<Recette, Utilisateur> auteur;

}