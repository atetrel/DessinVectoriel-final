package visitor;

import figure.Cercle;
import figure.Segment;
import figure.Point;

/**
 * Created by tetrel on 17/11/15.
 */
public interface FigureVisitor {

    void visit(Cercle c);

    void visit(Point p);

    void visit(Segment l);

}
