package ordre;

import outils.Crayon;
import visitor.FigureVisitor;

/**
 * Created by Vic on 22/11/2015.
 * Change la couleur du crayon.
 */
public class ChangerCouleur implements IOrdre {

    private String couleur;

    public ChangerCouleur(String couleur) {
        this.couleur = couleur;
    }



    @Override
    public void executer(FigureVisitor fv) {
        Crayon.getDefaultCrayon().setCouleur(this.couleur);
    }
}
