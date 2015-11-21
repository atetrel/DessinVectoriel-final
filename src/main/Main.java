package main;

import figure.Cercle;
import figure.Point;
import ordre.dessin.Dessiner;
import ordre.IOrdre;
import ordre.dessin.Remplir;
import visitor.FigureVisitor;
import visitor.svg.SVG;
import visitor.vml.VML;

/**
 * Created by tetrel on 17/11/15.
 */
public class Main {

    public static void main(String[] args) {

        Dessin d = new Dessin("test",10,10);

        int x = 0;
        int y = 0;
        double rayon = 10;
        Point centre = new Point (x,y);
        Cercle c = new Cercle(centre, rayon);
        IOrdre dessinerCercle = new Remplir(c,"bleu");

        d.add(dessinerCercle);

        FigureVisitor type = new VML();

        d.draw(type);





    }

}
