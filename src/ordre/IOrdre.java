package ordre;

import visitor.FigureVisitor;

/**
 * Created by Vic on 21/11/2015.
 */
public interface IOrdre {

    public void executer(FigureVisitor fv);
}
