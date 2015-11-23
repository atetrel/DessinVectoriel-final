package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class If extends IOrdreLogique {

    private boolean condition;
    private IOrdre ordreElse;

    public If(IOrdre ordreIf,IOrdre ordreElse, boolean condition) {
        this.ordre = ordreIf;
        this.ordreElse = ordreElse;
        this.condition = condition;
    }

    @Override
    public void executer(FigureVisitor fv) {
        if (condition) {
            this.ordre.executer(fv);
        }
        else {
            ordreElse.executer(fv);
        }
    }
}
