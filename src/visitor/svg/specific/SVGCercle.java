package visitor.svg.specific;

import figure.Cercle;
import figure.Figure;
import visitor.SpecificVisitor;

/**
 * Created by Vic on 21/11/2015.
 */
public class SVGCercle extends SpecificVisitor {

    @Override
    public void specificVisit(Figure f) {
        Cercle c = (Cercle) f;
        this.visit(c);
    }

    public void visit(Cercle c){
        System.out.println("Je trace un cercle en SVG");
        this.ecrireDansFichier("Je trace un cercle en SVG");
    }
}
