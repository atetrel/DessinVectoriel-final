package figure;


import visitor.FigureVisitor;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 17/11/15.
 * Interface des figures.
 * Permet de verifier l'implementation du patron visiteur.
 */
public interface IFigure {

    void accept(FigureVisitor fv);

    void changeSize(double percentage);

    void translate(double abs,double ord);


}
