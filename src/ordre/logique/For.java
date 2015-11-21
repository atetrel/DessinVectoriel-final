package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

/**
 * Created by Vic on 21/11/2015.
 */
public class For implements IOrdre {
    private IOrdre ordre;
    private int interateur;
    private boolean conditionDArret;

    @Override
    public void executer(FigureVisitor fv) {

    }
}
