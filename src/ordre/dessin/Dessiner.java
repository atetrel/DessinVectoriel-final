package ordre.dessin;

import figure.Figure;
import ordre.IOrdre;
import visitor.FigureVisitor;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public class Dessiner extends IOrdreDessin {

    public Dessiner(Figure f){
        this.f = f;
    }



    @Override
    public void executer(FigureVisitor visitor) {
        f.accept(visitor);
    }




}
