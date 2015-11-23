package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class While extends IOrdreLogique {

    private Function<Integer,IOrdre> ordre;
    private Predicate<Integer> condition;
    private Integer parametre;

    public While(Function<Integer, IOrdre> ordre, Predicate<Integer> condition, Integer parametre) {
        this.ordre = ordre;
        this.condition = condition;
        this.parametre = parametre;
    }

    @Override
    public void executer(FigureVisitor fv) {
        while (condition.test(parametre)){
            ordre.apply(parametre).executer(fv);
            parametre++;
        }
    }





}
