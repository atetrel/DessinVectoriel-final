package main;

import figure.fermee.Cercle;
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

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Dessin d = new Dessin("test",10,10);

        int x = 0;
        int y = 0;
        double rayon = 10;
        Point centre = new Point (x,y);
        Cercle c = new Cercle(centre, rayon);

        int i = 0;

        d.add(new ChangerCouleur("rouge"));
        d.add(new Dessiner(c));
        d.add(new ChangerCouleur("noir"));
        d.add(new Etiqueter("Cercle",5,c));



        //EXEMPLE : comment appeler un certain langage par une string passée au main.
//        String s = args[0];
//        String language = "visitor."+s.toLowerCase()+"."+s;
//        FigureVisitor newType = (FigureVisitor) Class.forName(language).newInstance();


        FigureVisitor type = new SVG();
      //  ArrayList<Integer> liste = new ArrayList<Integer>();
        //liste.add(1);
        //liste.add(2);
        //liste.add(3);

        While whilee = new While(new Remplir(c,"bleu"),p -> p<5,0);
        whilee.executer(type);

        //If iff = new If(new Remplir(c,"rouge"),new Remplir(c,"bleu"),false);
        //iff.executer(type);
//        For forr = new For(new Remplir(c,"bleu"),i,p -> p<5);
        //forr.executer(type);
//        FigureVisitor type2 = new VML();

        d.draw(type);
//        d.draw(type2);





    }

}