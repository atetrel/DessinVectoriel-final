package main;

import figure.Figure;
import figure.IFigure;
import ordre.dessin.IOrdreDessin;
import outils.FileHandler;
import visitor.FigureVisitor;
import ordre.IOrdre;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Objet qui fera l'objet d'une onterpretation. Il contient une séquence d'ordres.
 * Interpreter un dessin renvoie un et un seul fichier qui contient de résultat de l'exécution séquentielle de tous ses ordres.
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

    public Dessin(String name, int height, int width) {
        this(name,width,height,new ArrayList<IOrdre>());

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


    public void add (IOrdre f) {
        ordres.add(f);
    }

    /**
     * Execute sequentiellement les ordres et renvoie un fichier nomme name.language
     * @param fv
     */
    void draw (FigureVisitor fv) {

        FileHandler fh = new FileHandler(name+"."+fv.getClass().getSimpleName().toLowerCase());
        fv.initierEcriture(this);


        for (IOrdre o : ordres) {
            o.executer(fv);
        }


        fv.finirEcriture(this);
        fh.close();
    }

    /**
     * Mise a l'echelle de tout le dessin
     * @param percentage
     */
    public  void changeSize(double percentage){
        double multiplicator = percentage/100;
        width=(int)(width*multiplicator);
        height=(int)(height*multiplicator);

        for (IOrdre ordre : ordres){

            if(ordre.getClass().getSuperclass() == IOrdreDessin.class){
                ((IOrdreDessin)ordre).getFigure().changeSize(percentage);
            }

        }

    }


    /**
     * Translation de tout le dessin
     * @param abs
     * @param ord
     */
    public void translate(double abs,double ord){
        for (IOrdre ordre : ordres){
            if(ordre.getClass().getSuperclass() == IOrdreDessin.class){
                ((IOrdreDessin)ordre).getFigure().translate(abs, ord);
            }
        }
    }

}