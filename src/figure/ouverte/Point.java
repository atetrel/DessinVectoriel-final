package figure.ouverte;

import figure.Figure;
import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public class Point extends FigureOuverte {
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

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    @Override
    public void accept(FigureVisitor fv,HashMap<String,String> parameters) {
        fv.visit(this,parameters);
    }

    @Override
    public void changeSize(double percentage) {
        abscisse*=(percentage/100);
        ordonnee*=(percentage/100);
    }

    @Override
    public void translate(double abs, double ord) {
        this.abscisse+=abs;
        this.ordonnee+=ordonnee;
    }

}
