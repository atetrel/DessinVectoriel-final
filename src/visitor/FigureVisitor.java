package visitor;

import figure.Cercle;
import figure.Figure;
import figure.Segment;
import figure.Point;

import java.awt.*;

/**
 * Created by tetrel on 17/11/15.
 */
public abstract class FigureVisitor {

    public abstract void visit(Cercle c);

    public abstract void visit(Point p);

    public abstract void visit(Segment l);

    public abstract String display();

}
