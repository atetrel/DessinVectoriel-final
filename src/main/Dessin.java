package main;

import figure.Figure;
import figure.IFigure;
import ordre.dessin.IOrdreDessin;
import outils.FileHandler;
import visitor.FigureVisitor;
import ordre.IOrdre;

import java.util.ArrayList;

/**
 * Created by tetrel on 17/11/15.
 */
public class Dessin {
    String name;
    int width;
    int height;
    ArrayList<IOrdre> ordres;

    public Dessin(String name, int width, int height, ArrayList<IOrdre> ordres) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.ordres = ordres;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<IOrdre> getOrdres() {
        return ordres;
    }

    public Dessin(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.ordres = new ArrayList<IOrdre>();
    }

    public void add (IOrdre f) {
        ordres.add(f);
    }

    void draw (FigureVisitor fv) {

        FileHandler fh = new FileHandler(fv.getClass().getSimpleName().toLowerCase());
        fv.initierEcriture();
        for (IOrdre o : ordres) {
            o.executer(fv); // Ceci écrit déjà dans le fichier le contenu
        }
        fv.finirEcriture();
        fh.close();
    }

    public  void changeSize(double percentage){
        double multiplicator = percentage/100;
        width*=multiplicator;
        height*=multiplicator;
        for (IOrdre ordre : ordres){

            if(ordre.getClass().getSuperclass() == IOrdreDessin.class){
                ((IOrdreDessin)ordre).getFigure().changeSize(percentage);
            }

        }

    }

    public void translate(double abs,double ord){
        for (IOrdre ordre : ordres){
            if(ordre.getClass().getSuperclass() == IOrdreDessin.class){
                ((IOrdreDessin)ordre).getFigure().translate(abs, ord);
            }
        }
    }

}