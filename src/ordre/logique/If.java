package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

/**
 * Created by Vic on 21/11/2015.
 */
public class If implements IOrdre {
    IOrdre ordre;
    boolean condition;

    @Override
    public void executer(FigureVisitor fv) {

    }
}
