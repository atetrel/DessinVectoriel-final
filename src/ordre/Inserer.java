package ordre;

import figure.ouverte.Point;
import main.Dessin;
import visitor.FigureVisitor;

import java.util.ArrayList;

/**
 * Created by Vic on 22/11/2015.
 * Insere un dessin dans un autre, apres l'avoir redimensionne.
 * L'origine du dessin insere dans le dessin qui l'acceuille est le point d'insertion specifie.
 */
public class Inserer implements IOrdre {

    private Dessin cible;
    private Dessin aAjouter;
    private double percentage;
    private Point pointDinsertion;

    public Inserer(Dessin cible, Dessin aAjouter, double percentage, Point pointDinsertion) {
        this.cible = cible;
        this.aAjouter = aAjouter;
        this.percentage = percentage;
        this.pointDinsertion = pointDinsertion;

        aAjouter.changeSize(percentage);
        aAjouter.translate(pointDinsertion.getAbscisse(),pointDinsertion.getOrdonnee());
        ArrayList<IOrdre> ordesAAjouter = aAjouter.getOrdres();
        for(IOrdre ordre : ordesAAjouter){
            cible.add(ordre);
        }

    }

    @Override
    public void executer(FigureVisitor fv) {

    }
}