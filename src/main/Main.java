package main;

import figure.fermee.Cercle;
import figure.ouverte.Etiquette;
import figure.ouverte.Point;

import ordre.*;
import ordre.dessin.*;
import ordre.logique.*;
import visitor.*;
import visitor.svg.SVG;
import visitor.vml.VML;

import java.util.ArrayList;


/**
 * Created by tetrel on 17/11/15.
 */
public class Main {

    private static void testAngelin(){
        Dessin d = new Dessin("test",200,200);

        int x = 60;
        int y = 60;
        double rayon = 20;
        Point centre = new Point (x,y);
        Cercle c = new Cercle(centre, rayon);


        d.add(new Remplir(c,"#0000ff"));
        d.add(new ChangerCouleur("#cc0000"));
        d.add(new Dessiner(c));
        d.add(new ChangerCouleur("#000000"));

        Etiquette e = new Etiquette("Blabla",5,centre);
        d.add(new Dessiner(e));

        d.add(new Etiqueter("Cercle",5,e));

        //EXEMPLE : comment appeler un certain langage par une string passée au main.
//        String s = args[0];
//        String language = "visitor."+s.toLowerCase()+"."+s;
//        FigureVisitor newType = (FigureVisitor) Class.forName(language).newInstance();


        FigureVisitor type = new SVG(d);

        FigureVisitor type2 = new VML();

        d.draw(type);
        d.draw(type2);
    }



    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        testAngelin();


    }

}