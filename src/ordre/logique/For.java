package ordre.logique;

import figure.Figure;
import figure.fermee.Cercle;
import figure.ouverte.Point;
import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class For extends IOrdreLogique {

    private Function<Integer, Figure> figure;
    private Function<Figure, IOrdre> ordre;
    private int interateur;
    private Predicate<Integer> conditionDArret;

    public For(Function<Integer, Figure> figure, Function<Figure, IOrdre> ordre, int interateur, Predicate<Integer> conditionDArret) {
        this.figure = figure;
        this.ordre = ordre;
        this.interateur = interateur;
        this.conditionDArret = conditionDArret;
    }

    @Override
    public void executer(FigureVisitor fv) {
        for (Integer i = interateur;conditionDArret.test(i);i++){
            this.ordre.apply(this.figure.apply(i)).executer(fv);
        }
    }
}
