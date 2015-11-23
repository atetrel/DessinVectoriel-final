package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class While extends IOrdreLogique {

    private Predicate<Integer> condition;
    private Integer parametre;

    public While(IOrdre ordree,Predicate<Integer> condition, Integer parametre) {
        this.condition = condition;
        this.parametre = parametre;
        this.ordre = ordree;
    }

    @Override
    public void executer(FigureVisitor fv) {
        while (condition.test(parametre)){
            ordre.executer(fv);
            parametre++;
        }
    }





}
