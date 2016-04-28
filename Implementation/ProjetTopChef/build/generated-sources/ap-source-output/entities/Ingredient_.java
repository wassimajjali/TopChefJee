package entities;

import entities.Recette;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-28T18:32:44")
@StaticMetamodel(Ingredient.class)
public class Ingredient_ { 

    public static volatile SingularAttribute<Ingredient, String> unite;
    public static volatile SingularAttribute<Ingredient, Recette> idRecette;
    public static volatile SingularAttribute<Ingredient, Integer> quantite;
    public static volatile SingularAttribute<Ingredient, Integer> idIngredient;
    public static volatile SingularAttribute<Ingredient, String> nom;

}