package ordre.dessin;

import figure.Figure;
import figure.ouverte.Etiquette;
import ordre.IOrdre;
import visitor.FigureVisitor;


/**
 * Created by Vic on 22/11/2015.
 */
public class Etiqueter extends IOrdreDessin {
    private String text;
    private int fontSize;

    public Etiqueter(String text, int fontSize, Figure f) {
        this.text = text;
        this.fontSize = fontSize;
        this.f = f;
    }

    @Override
    public void executer(FigureVisitor fv) {
        Etiquette e = new Etiquette(text,fontSize,f.getPointDetiquetage());
        e.accept(fv);
    }
}
