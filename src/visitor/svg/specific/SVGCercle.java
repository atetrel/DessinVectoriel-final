package visitor.svg.specific;

import figure.Cercle;
import figure.Figure;
import visitor.SpecificVisitor;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public class SVGCercle extends SVGSpecific {



    @Override
    public void specificVisit(Figure f, HashMap<String,String> h) {
        Cercle c = (Cercle) f;
        this.visit(c);
    }

    public void visit(Cercle c){
        System.out.println("Je trace un cercle en SVG");
        this.ecrireDansFichier("Je trace un cercle en SVG");
    }
}
