package figure;


import figure.ouverte.Point;
import outils.Crayon;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 18/11/15.
 */
public abstract class Figure implements IFigure{
    // contient les options pour une figure (remplissage par exemple)

    protected Point pointDetiquetage;

    protected HashMap<String,String> parameters;

    public Point getPointDetiquetage(){return pointDetiquetage; }

    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    public void addParameter(String key, String value){
        this.parameters.put(key, value);
    }


    public Figure() {
        this.parameters = new HashMap<String, String>();
    }

}
