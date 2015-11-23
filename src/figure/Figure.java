package figure;


import figure.ouverte.Point;
import outils.Crayon;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 18/11/15.
 */
public abstract class Figure implements IFigure{

    /**
     * Permet de poser facilement une etiquette sur une figure
     */
    protected Point pointDetiquetage;

    /**
     * Permet de passer arbitrairement des paramètres aux générateurs de code
     */
    protected HashMap<String,String> parameters;


    public Point getPointDetiquetage(){return pointDetiquetage; }


    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Ajoute un paramètre aux paramètres de la figure
     * @param key le paramètre à passer
     * @param value la valeur du paramètre
     */
    public void addParameter(String key, String value){
        this.parameters.put(key, value);
    }


    public Figure() {
        this.parameters = new HashMap<String, String>();
    }

}
