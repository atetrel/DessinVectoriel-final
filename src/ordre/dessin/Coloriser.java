package ordre.dessin;

import figure.Figure;
import ordre.IOrdre;
import visitor.FigureVisitor;

/**
 * Created by Vic on 22/11/2015.
 */
public class Coloriser implements IOrdre {

    private Figure f;
    private String color;

    public static String KEY = Coloriser.class.getSimpleName();

    public Coloriser(Figure f, String color) {
        this.f = f;
        this.color = color;
    }


    @Override
    public void executer(FigureVisitor fv) {
        f.addParameter(KEY,color);
    }
}
