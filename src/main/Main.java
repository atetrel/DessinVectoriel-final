package main;

import figure.fermee.Cercle;
import figure.ouverte.Point;

import ordre.*;
import ordre.dessin.*;
import ordre.logique.*;
import visitor.*;
import visitor.svg.SVG;
import visitor.vml.VML;


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
        d.add(new ChangerCouleur("rouge"));
        d.add(new Dessiner(c));
        d.add(new ChangerCouleur("noir"));
        d.add(new Etiqueter("Cercle",5,c));



        //EXEMPLE : comment appeler un certain langage par une string passée au main.
//        String s = args[0];
//        String language = "visitor."+s.toLowerCase()+"."+s;
//        FigureVisitor newType = (FigureVisitor) Class.forName(language).newInstance();


        FigureVisitor type = new SVG();

//        FigureVisitor type2 = new VML();

        d.draw(type);
//        d.draw(type2);





    }

}