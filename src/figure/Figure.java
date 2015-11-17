package figure;

import Actions.Actions;
import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public interface Figure extends Actions {

    void accept (FigureVisitor fv);

}
