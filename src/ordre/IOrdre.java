package ordre;

import visitor.FigureVisitor;

/**
 * Created by Vic on 21/11/2015.
 * Interface des ordres.
 */
public interface IOrdre {

    /**
     * Méthode appelée à la l'execution de l'ordre, c'est a dire lorsqu'une creation de fihcier a ete appellee.
     * @param fv
     */
    public void executer(FigureVisitor fv);
}
