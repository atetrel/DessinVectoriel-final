package figure;

import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public class Point extends Figure {
    private double abscisse;
    private double ordonnee;

    public Point(double abscisse, double ordonnee) {
        super();
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    @Override
    public void accept(FigureVisitor fv,HashMap<String,String> parameters) {
        fv.visit(this,parameters);
    }

}
