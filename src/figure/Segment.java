package figure;

import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class Segment extends Figure {
    Point depart;
    Point arrivee;

    public Segment(Point depart, Point arrivee) {
        super();
        this.getOptions().put("name","line");
        this.depart = depart;
        this.arrivee = arrivee;
    }

    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }
}
