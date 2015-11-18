package main;

import figure.Figure;
import figure.IFigure;
import visitor.FigureVisitor;

import java.util.ArrayList;

/**
 * Created by tetrel on 17/11/15.
 */
public class Dessin {
    String name;
    int width;
    int height;
    ArrayList<Figure> figures;

    public Dessin(String name, int width, int height, ArrayList<Figure> figures) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.figures = figures;
    }

    public Dessin(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.figures = new ArrayList<Figure>();
    }

    void add (Figure f) {
        figures.add(f);
    }

    void draw (FigureVisitor fv) {
        for (Figure f : figures) {
            f.accept(fv);
        }
    }

}
