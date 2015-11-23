package ordre.logique;

import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by Vic on 21/11/2015.
 */
public class If extends IOrdreLogique {

    private ArrayList<IOrdre> ordre;
    private boolean condition;
    private ArrayList<IOrdre> ordreElse;

    public If(ArrayList<IOrdre> ordre, boolean condition, ArrayList<IOrdre> ordreElse) {
        this.ordre = ordre;
        this.condition = condition;
        this.ordreElse = ordreElse;
    }

    @Override
    /**
     * methode executer qui applique la methode executer de l'interface IOrdre sur l'ordre this.ordre ou sur ordreElse
     * selon si this.condition est vrai ou faux
     * @param fv c'est le FigureVisitor qui est passe en argument dans la methode draw de Dessin
     * */
    public void executer(FigureVisitor fv) {
        if (condition) {
            for(IOrdre o : ordre)
                o.executer(fv);
        }
        else {
            for (IOrdre o : ordreElse) {
                o.executer(fv);
            }
        }
    }
}
