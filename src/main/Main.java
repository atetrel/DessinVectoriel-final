package main;

import figure.Cercle;
import figure.Point;
import figure.Segment;
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

        Segment s = new Segment(new Point(0,0),new Point(10,10));
        d.add(s);
//
//        c.coloriser(Color.BLACK);
//        c.modifierTrait(Crayon.getDefaultCrayon());
//        c.ajouterParametre("style","top:10;left:10;width:200;height:200");
//
//        d.add(centre);
        d.add(c);

        FigureVisitor type = new VML();

        d.draw(type);

        type = new SVG();

        d.draw(type);



    }

}
