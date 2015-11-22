package ordre.dessin;

import figure.Figure;
import ordre.IOrdre;

/**
 * Created by Vic on 22/11/2015.
 */
public abstract class IOrdreDessin implements IOrdre {

    protected Figure f;

    public Figure getFigure(){
        return f;

    }
}
