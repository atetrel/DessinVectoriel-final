package ordre.logique;

import figure.Figure;
import figure.fermee.Cercle;
import figure.ouverte.Point;
import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class For extends IOrdreLogique {

    private Function<Integer, Figure> figure;
    private Function<Figure, ArrayList<IOrdre>> ordres;
    private int interateur;
    private Predicate<Integer> conditionDArret;

    public For(Function<Integer, Figure> figure, Function<Figure, ArrayList<IOrdre>> ordre, int interateur, Predicate<Integer> conditionDArret) {
        this.figure = figure;
        this.ordres = ordre;
        this.interateur = interateur;
        this.conditionDArret = conditionDArret;
    }

    @Override
    /**
     * methode executer qui applique la methode executer de l'interface IOrdre sur les ordres calcules en appliquant la
     * fonction figure a l'indice de la boucle
     * @param fv c'est le FigureVisitor qui est passe en argument dans la methode draw de Dessin
     * */
    public void executer(FigureVisitor fv) {
        for (Integer i = interateur; conditionDArret.test(i); i++) {
            Figure f = figure.apply(i);
            ArrayList<IOrdre> ordress = ordres.apply(f);
            if (!ordress.isEmpty()) {
                for (IOrdre o : ordress) {
                    o.executer(fv);
                }
            }
        }
    }
}
