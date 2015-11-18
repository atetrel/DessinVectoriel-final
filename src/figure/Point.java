package figure;

import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class Point extends Figure {
    private double abscisse;
    private double ordonnee;

    public Point(double abscisse, double ordonnee) {
        super();
        this.getOptions().put("name","point");
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }

}
