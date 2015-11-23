package outils;

import visitor.FigureVisitor;

import java.awt.*;

/**
 * Created by tetrel on 17/11/15.
 * Singleton contenant les paramètres de dessin.
 */
public class Crayon {
    private String couleur;
    private int largeur;
    public static final String DEFAULT_COULEUR = "000000";
    public static final int DEFAULT_LARGEUR = 2;

    private static Crayon INSTANCE;



    private Crayon(String couleur, int largeur) {
        this.couleur = couleur;
        this.largeur = largeur;
    }

    public static Crayon getDefaultCrayon() {
        if (INSTANCE == null) {
            INSTANCE = new Crayon(DEFAULT_COULEUR,DEFAULT_LARGEUR);
        }
        return INSTANCE;
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
