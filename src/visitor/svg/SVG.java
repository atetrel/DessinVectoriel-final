package visitor.svg;


import figure.fermee.Cercle;
import figure.ouverte.Segment;
import figure.ouverte.Point;
import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class SVG extends FigureVisitor {
    private String entete;
    private String pied;
    private String contenu;

    public SVG() {
        this.entete = "";
        this.contenu = "";
        this.pied = "";
    }


    public String getEntete() {
        return entete;
    }

    public void setEntete(String entete) {
        this.entete = entete;
    }

    public String getPied() {
        return pied;
    }

    @Override
    public void initierEcriture() {

    }

    @Override
    public void finirEcriture() {

    }

    public void setPied(String pied) {
        this.pied = pied;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }


    public void visit(Cercle c) {
        System.out.println("ajouter cercle");
    }


    public void visit (Point p) {
        System.out.println("Ajouter point");
    }


    public void visit(Segment l) {
    }

    public String display() {
        return getEntete()+"\n"+getContenu()+"\n"+getPied();
    }
}
