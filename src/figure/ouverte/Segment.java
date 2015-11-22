package figure.ouverte;

import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public class Segment extends FigureOuverte {
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

    public void setDepart(Point depart) {
        this.depart = depart;
    }

    public void setArrivee(Point arrivee) {
        this.arrivee = arrivee;
    }

    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }

    @Override
    public void changeSize(double percentage) {
        depart.changeSize(percentage);
        arrivee.changeSize(percentage);
    }

    @Override
    public void translate(double abs, double ord) {
        depart.translate(abs, ord);
    }
}
