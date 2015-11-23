package visitor;

/**
 * Created by Vic on 21/11/2015.
 * Visiteur specifique a un ordre et un langage.
 *
 */
public abstract class SpecificOrder {

    /**
     * Renvoir le code traduisant l'ordre a executer
     * @param param le parametre de l'ordre.
     * @return
     */
    public abstract String execute(String param);

}
