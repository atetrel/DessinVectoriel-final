package figure;


import visitor.FigureVisitor;

import java.awt.*;
import java.util.Map;

/**
 * Created by tetrel on 17/11/15.
 */
public interface IFigure {

    void accept (FigureVisitor fv);

    void coloriser (Color color);

}
