package figure;

import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public class Segment extends Figure {
    Point depart;
    Point arrivee;

    public Segment(Point depart, Point arrivee) {
        super();
        this.depart = depart;
        this.arrivee = arrivee;
    }

    public Point getDepart() {
        return depart;
    }

    public Point getArrivee() {
        return arrivee;
    }

    @Override
    public void accept(FigureVisitor fv,HashMap<String,String> parameters) {
        fv.visit(this,parameters);
    }
}
