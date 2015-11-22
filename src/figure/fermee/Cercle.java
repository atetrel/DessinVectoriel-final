package figure.fermee;

import figure.ouverte.Point;
import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public class Cercle extends FigureFermee {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        super();
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void accept(FigureVisitor fv,HashMap<String,String> parameters) {
        fv.visit(this,parameters);
    }

    @Override
    public void changeSize(double percentage) {

        rayon*=percentage/100;
        centre.changeSize(percentage);

    }

    @Override
    public void translate(double abs, double ord) {
        centre.translate(abs,ord);
    }

}
