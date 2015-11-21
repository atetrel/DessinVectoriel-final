package ordre.dessin;

import figure.Figure;
import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public class Remplir implements IOrdre {
    Figure f;
    String color;
    public static String KEY = Remplir.class.getSimpleName();

    public Remplir(Figure f, String color) {
        this.f = f;
        this.color = color;
    }

    @Override
    public void executer(FigureVisitor fv) {
        HashMap<String,String> h = new HashMap<String, String>();
        h.put(KEY,color);
        f.accept(fv,h);
    }


}
