package figure;


import visitor.FigureVisitor;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 17/11/15.
 */
public interface IFigure {

   // void accept(FigureVisitor fv);

    void accept(FigureVisitor fv, HashMap<String,String> parameters);

    void coloriser (Color color);

}
