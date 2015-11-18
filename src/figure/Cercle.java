package figure;

import visitor.FigureVisitor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 17/11/15.
 */
public class Cercle extends Figure {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        super();
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }

}
