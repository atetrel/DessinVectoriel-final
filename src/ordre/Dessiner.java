package ordre;

import figure.Figure;
import visitor.FigureVisitor;

/**
 * Created by Vic on 21/11/2015.
 */
public class Dessiner implements IOrdre {
    private Figure f;

    public Dessiner(Figure f){
        this.f = f;
    }


    @Override
    public void executer(FigureVisitor visitor) {
        f.accept(visitor);
    }


}
