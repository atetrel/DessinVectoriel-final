package figure;


import outils.Crayon;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 18/11/15.
 */
public abstract class Figure implements IFigure{
    // contient les options pour une figure (remplissage par exemple)
    private String entete;
    private String contenu;
    private String pied;
    private Crayon defaultCrayon;
    private Map<String,String> options;


    public Figure() {
        this.options = new HashMap<String,String>();
        this.defaultCrayon = Crayon.getDefaultCrayon();
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void coloriser(Color color) {
        options.put("couleur","nom couleur");
    }

    public void modifierTrait(Crayon crayon) {
        options.put("Crayon","Valeur du crayon");
    }

    public String getEntete() {
        return entete;
    }

    public void setEntete(String entete) {
        this.entete = entete;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getPied() {
        return pied;
    }

    public void setPied(String pied) {
        this.pied = pied;
    }


}
