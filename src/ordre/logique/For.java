package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class For extends IOrdreLogique {

    private int interateur;
    private Predicate<Integer> conditionDArret;

    public For(IOrdre ordre, int interateur, Predicate<Integer> conditionDArret) {
        this.ordre = ordre;
        this.interateur = interateur;
        this.conditionDArret = conditionDArret;
    }

    @Override
    public void executer(FigureVisitor fv) {
        for (Integer i = interateur;conditionDArret.test(i);i++){
            this.ordre.executer(fv);
        }
    }
}
