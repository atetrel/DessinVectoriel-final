package main;

import figure.Figure;
import figure.IFigure;
import outils.FileHandler;
import visitor.FigureVisitor;
import ordre.IOrdre;

import java.util.ArrayList;

/**
 * Created by tetrel on 17/11/15.
 */
public class Dessin {
    String name;
    int width;
    int height;
    ArrayList<IOrdre> ordres;

    public Dessin(String name, int width, int height, ArrayList<IOrdre> ordres) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.ordres = ordres;
    }

    public Dessin(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.ordres = new ArrayList<IOrdre>();
    }

    void add (IOrdre f) {
        ordres.add(f);
    }

    void draw (FigureVisitor fv) {

        FileHandler fh = new FileHandler(fv.getClass().getSimpleName().toLowerCase());
        fv.initierEcriture();
        for (IOrdre o : ordres) {
            o.executer(fv); // Ceci écrit déjà dans le fichier le contenu
        }
        fv.finirEcriture();
        fh.close();
    }

}
