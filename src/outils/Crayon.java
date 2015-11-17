package outils;

import visitor.FigureVisitor;

import java.awt.*;

/**
 * Created by tetrel on 17/11/15.
 */
public class Crayon implements IOutils {
    private Color couleur;
    private int largeur;

    public Crayon(Color couleur, int largeur) {
        this.couleur = couleur;
        this.largeur = largeur;
    }

    void dessiner () {

    }

}
