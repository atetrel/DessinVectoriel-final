package ordre;

import figure.ouverte.Point;
import main.Dessin;
import visitor.FigureVisitor;

import java.util.ArrayList;

/**
 * Created by Vic on 22/11/2015.
 */
public class Inserer implements IOrdre {

    private Dessin cible;
    private Dessin aAjouer;
    private double percentage;
    private Point pointDinsertion;


    @Override
    public void executer(FigureVisitor fv) {
        aAjouer.changeSize(percentage);
        aAjouer.translate(pointDinsertion.getAbscisse(),pointDinsertion.getOrdonnee());
        ArrayList<IOrdre> ordesAAjouter = aAjouer.getOrdres();
        for(IOrdre ordre : ordesAAjouter){
            cible.add(ordre);
        }
    }
}