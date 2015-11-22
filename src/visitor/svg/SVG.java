package visitor.svg;


import figure.fermee.Cercle;
import figure.ouverte.Segment;
import figure.ouverte.Point;
import main.Dessin;
import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class SVG extends FigureVisitor {
    private String entete;
    private String pied;
    private String contenu;


    public static final String GUILL = "\"";

    public SVG() {
        this(100,100);
    }

    public SVG(Dessin d) {
        this(d.getHeight(),d.getWidth());
    }

    public SVG(int height,int width) {
        this.entete = "<svg" +
                " height="
                +GUILL+height+GUILL+
                " width="+
                GUILL+width+GUILL+
                ">"+System.lineSeparator();
        this.contenu = "";
        this.pied = System.lineSeparator()+"</svg>";
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
        this.ecrireDansFichier(getEntete());
    }

    @Override
    public void finirEcriture() {
        this.ecrireDansFichier(getPied());
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
