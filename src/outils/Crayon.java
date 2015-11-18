package outils;

import visitor.FigureVisitor;

import java.awt.*;

/**
 * Created by tetrel on 17/11/15.
 */
public class Crayon implements IOutils {
    private Color couleur;
    private int largeur;
    public static final Color DEFAULT_COULEUR = Color.BLACK;
    public static final int DEFAULT_LARGEUR = 5;
    public static Crayon INSTANCE = new Crayon(DEFAULT_COULEUR,DEFAULT_LARGEUR);

    public Crayon(Color couleur, int largeur) {
        this.couleur = couleur;
        this.largeur = largeur;
    }

    public static Crayon getDefaultCrayon() {
        if (INSTANCE == null) {
            INSTANCE = new Crayon(DEFAULT_COULEUR,DEFAULT_LARGEUR);
        }
        return INSTANCE;
    }


}
