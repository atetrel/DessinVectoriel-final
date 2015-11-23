package ordre.logique;

import figure.Figure;
import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class While extends IOrdreLogique {


    private Function<Integer, Figure> figure;
    private Function<Figure, ArrayList<IOrdre>> ordres;
    private Integer parametre;
    private Predicate<Integer> conditionDArret;
    private Function<Integer,Integer> incrementation;


    public While(Function<Integer, Figure> figure, Function<Figure, ArrayList<IOrdre>> ordres, Integer parametre, Predicate<Integer> conditionDArret, Function<Integer,Integer> incrementation) {
        this.figure = figure;
        this.ordres = ordres;
        this.parametre = parametre;
        this.conditionDArret = conditionDArret;
        this.incrementation = incrementation;
    }

    @Override
    /**
     * methode executer qui applique la methode executer de l'interface IOrdre sur les ordres calcules en appelant
     * la fonction ordres sur le resultat de la fonction figure
     * @param fv c'est le FigureVisitor qui est passe en argument dans la methode draw de Dessin
     * */
    public void executer(FigureVisitor fv) {
        while (conditionDArret.test(parametre)){
            Figure f = figure.apply(parametre);
            ArrayList<IOrdre> ordress = ordres.apply(f);
            if (!ordress.isEmpty()) {
                for (IOrdre o : ordress) {
                    o.executer(fv);
                }
            }
            parametre = incrementation.apply(parametre);
        }
    }





}
