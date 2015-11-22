package main;

import figure.fermee.Cercle;
import figure.ouverte.Point;

import ordre.*;
import ordre.dessin.*;
import ordre.logique.*;
import visitor.*;
import visitor.svg.SVG;


/**
 * Created by tetrel on 17/11/15.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Dessin d = new Dessin("test",10,10);

        int x = 0;
        int y = 0;
        double rayon = 10;
        Point centre = new Point (x,y);
        Cercle c = new Cercle(centre, rayon);


        d.add(new Remplir(c,"bleu"));
        d.add(new Coloriser(c,"rouge"));
        d.add(new Dessiner(c));



        //EXEMPLE : comment appeler un certain langage par une string passée au main.
//        String s = args[0];
//        String language = "visitor."+s.toLowerCase()+"."+s;
//        FigureVisitor newType = (FigureVisitor) Class.forName(language).newInstance();


        FigureVisitor type = new SVG();

        d.draw(type);





    }

}