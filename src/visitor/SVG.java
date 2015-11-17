package visitor;

import figure.Cercle;
import figure.Segment;
import figure.Point;

/**
 * Created by tetrel on 17/11/15.
 */
public class SVG implements FigureVisitor, ActionVisitor {
    public static SVG INSTANCE;

    public SVG() {}


    @Override
    public void visit(Cercle c) {
        System.out.println("ajouter cercle");
    }

    @Override
    public void visit (Point p) {
        System.out.println("Ajouter point");
    }

    @Override
    public void visit(Segment l) {

    }

    @Override
    public void remplir(Cercle c) {

    }
}
