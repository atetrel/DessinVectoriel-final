package visitor;

import figure.Figure;
import outils.FileHandler;

/**
 * Created by Vic on 21/11/2015.
 */
public abstract class SpecificVisitor {

    public abstract void specificVisit(Figure f);
    public void ecrireDansFichier(String content){
        FileHandler.STATIC_ACCESS.ecrireDansFichier(content);
    }
}
