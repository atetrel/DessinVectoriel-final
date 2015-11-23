package ordre;

import outils.Crayon;
import visitor.FigureVisitor;

/**
 * Created by Vic on 22/11/2015.
 * Change l'epaisseur dy crayon.
 */
public class ChangerEpaisseur implements IOrdre {

    private int largeur;

    public ChangerEpaisseur(int largeur) {
        this.largeur = largeur;
    }

    @Override
    public void executer(FigureVisitor fv) {
        Crayon.getDefaultCrayon().setLargeur(largeur);
    }
}
