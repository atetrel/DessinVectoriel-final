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

    /**
     * Methode accept pour le patron visiteur
     * @param fv le visiteur
     */
    void accept(FigureVisitor fv);

    /**
     * Modifie la taille de la figure selon le pourcentage en parametre.
     * @param percentage
     */
    void changeSize(double percentage);

    /**
     * Translate la figure selon les paramètres
     * @param abs
     * @param ord
     */
    void translate(double abs,double ord);


}
