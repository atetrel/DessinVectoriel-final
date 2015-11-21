package main;

import figure.Cercle;
import figure.Point;
import figure.Segment;
import ordre.Dessiner;
import ordre.IOrdre;
import outils.Crayon;
import visitor.FigureVisitor;
import visitor.svg.SVG;
import visitor.vml.VML;

import java.awt.*;

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
        IOrdre dessinerCercle = new Dessiner(c);


        d.add(dessinerCercle);

        FigureVisitor type = new VML();

        d.draw(type);

        type = new SVG();

        d.draw(type);



    }

}
