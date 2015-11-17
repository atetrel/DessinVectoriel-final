package figure;

import Actions.Actions;
import visitor.ActionVisitor;
import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class Cercle implements Figure, Actions {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }

    @Override
    public void remplir(ActionVisitor av) {
        av.remplir(this);
    }
}
