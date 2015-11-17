package main;

import figure.Cercle;
import figure.Point;
import visitor.SVG;

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

        d.add(centre);
        d.add(c);

        d.draw(new SVG());

    }

}
