package ordre.dessin;

import figure.Figure;
import figure.fermee.FigureFermee;
import ordre.IOrdre;
import ordre.logique.IOrdreLogique;
import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public class Remplir extends IOrdreDessin {
    String color;
    public static String KEY = Remplir.class.getSimpleName();

    public Remplir(FigureFermee f, String color) {
        this.f = f;
        this.color = color;
    }

    @Override
    public void executer(FigureVisitor fv) {
        f.addParameter(KEY,color);
        System.out.println(color);
    }


}
