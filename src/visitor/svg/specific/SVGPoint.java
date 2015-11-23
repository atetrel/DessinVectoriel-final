package visitor.svg.specific;

import figure.Figure;
import figure.fermee.Cercle;
import figure.ouverte.Point;

/**
 * Created by Vic on 23/11/2015.
 */
public class SVGPoint extends SVGSpecific {

    @Override
    public void specificVisit(Figure f) {
        Point p = (Point) f;
        this.ecrireDansFichier(this.visit(p));
    }

    private String visit(Point p) {
        Cercle c = new Cercle(p,2);
        c.addParameter("Remplir","#000000");
    return new SVGCercle().visit(c);
    }
}
