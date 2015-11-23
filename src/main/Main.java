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

    private static FigureVisitor createVisitor(String s){
        String language = "visitor."+s.toLowerCase()+"."+s;
        try {
            return (FigureVisitor) Class.forName(language).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("This language is not implemented.");
            e.printStackTrace();
        }
        return null;
    }

    private static void output(Dessin d,String s){
        FigureVisitor fv = createVisitor(s);


    }

    private static void testAngelin(){
        Dessin d = new Dessin("test",300,200);

        int x = 100;
        int y = 100;
        double rayon = 20;
        Cercle c = new Cercle(new Point (x,y), rayon);


        d.add(new Remplir(c,"#0000ff"));
        d.add(new ChangerCouleur("#cc0000"));
        d.add(new Dessiner(c));
        d.add(new ChangerCouleur("#000000"));

        d.add(new Etiqueter("Cercle",5,c));


        output(d,"SVG");

    }



    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        testAngelin();


    }

}