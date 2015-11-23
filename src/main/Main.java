package main;

import figure.fermee.Cercle;
import figure.fermee.FigureFermee;
import figure.ouverte.Etiquette;
import figure.ouverte.Point;

import figure.ouverte.Segment;
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
        d.draw(fv);
    }

    private static void testAngelin(){
        Dessin d = new Dessin("test",300,200);

        int x = 99;
        int y = 100;
        double rayon = 20;
        Cercle c = new Cercle(new Point (x,y), rayon);
        d.add(new Remplir(c,"#0000ff"));
        d.add(new ChangerCouleur("#cc0000"));
        d.add(new Dessiner(c));
        d.add(new ChangerCouleur("#000000"));
        d.add(new Etiqueter("Cercle",5,c));


        Segment s = new Segment(new Point(20,20),new Point(200,200));
        d.add(new Dessiner(s));

        Point p = new Point(100,50);
        d.add(new Dessiner(p));

        output(d,"SVG");
        output(d,"VML");

    }

    private static void logo(){
        Dessin d = new Dessin("logo",1000,1000);

        Point centre = new Point(500,500);
        Cercle grand = new Cercle(centre,450);
        d.add(new Remplir(grand,"#0000ff"));
        d.add(new Dessiner(grand));
        Cercle petit = new Cercle(centre,380);
        d.add(new ChangerCouleur("#cc0000"));
        d.add(new ChangerEpaisseur(5));
        d.add(new Remplir(petit,"#ffffff"));
        d.add(new Dessiner(petit));
        Segment gauche = new Segment(centre,new Point(200,200));
        Segment droit = new Segment(centre,new Point(800,200));
        Point bas = new Point(500,800);
        Segment ggauche = new Segment(bas,new Point(200,200));
        Segment ddroit = new Segment(bas,new Point(800,200));
        d.add(new ChangerEpaisseur(3));
        d.add(new Dessiner(gauche));
        d.add(new Dessiner(droit));
        d.add(new Dessiner(ddroit));
        d.add(new Dessiner(ggauche));
        int i = 0;
        For forr = new For(p -> new Cercle(new Point(500, 300+ 200* p), 100/(p+1)), p -> {
            ArrayList<IOrdre> ordress = new ArrayList<IOrdre>();
            ordress.add(new Remplir((FigureFermee) p, "#66B2CC"));
            ordress.add(new Dessiner(p));
            return ordress;
        }, i, p -> p < 3);
        d.add(forr);

        output(d,"SVG");
        output(d,"VML");

    }

    public static void testPierre(){
        Dessin d = new Dessin("logo",1000,1000);

        int i = 0;
        For forr = new For(p -> new Cercle(new Point(20 * p, 20 * p), 20), p -> {
            ArrayList<IOrdre> ordress = new ArrayList<IOrdre>();
            ordress.add(new Remplir((FigureFermee) p, "rouge"));
            ordress.add(new Dessiner(p));
            return ordress;
        }, i, p -> p < 5);


//        d.add(forr);


        int j = 0;
        While whilee = new While(p -> new Cercle(new Point(15 * p, 15 * p), 20), p -> {
            ArrayList<IOrdre> ordress = new ArrayList<IOrdre>();
            ordress.add(new Remplir((FigureFermee) p, "rouge"));
            ordress.add(new Dessiner(p));
            return ordress;
        }, j, p -> p < 5, p -> p + 1);

//        d.add(whilee);

        Cercle c = new Cercle(new Point(1, 1), 32);
        ArrayList<IOrdre> ordres1 = new ArrayList<>();
        ordres1.add(new Remplir(c, "rouge"));
        ordres1.add(new Dessiner(c));

        ArrayList<IOrdre> ordres2 = new ArrayList<>();
        ordres2.add(new Remplir(c, "bleu"));
        ordres2.add(new Dessiner(c));
        If iff = new If(ordres1, false, ordres2);

        d.add(iff);


        output(d, "SVG");
    }


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        logo();

    }

}