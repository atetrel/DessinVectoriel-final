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

    /**
     * Est utile pour la creation de svg.
     * La structure permet a chaque langage d'avoir sa propre logique de generation.
     */
    public static final String GUILL = "\"";

    public SVG() {
        this(100,100);
    }

    public SVG(int height,int width) {
        this.entete = "<svg" +
                " height="
                +GUILL+height+GUILL+
                " width="+
                GUILL+width+GUILL+
                " xmlns="+GUILL+"http://www.w3.org/2000/svg"+GUILL+
                " viewBox="+GUILL+"0 0 "+width+
                " "+height+GUILL+
                " > "+System.lineSeparator();
        this.contenu = "";
        this.pied = System.lineSeparator()+"</svg>";
    }

    @Override
    public String getEntete() {
        return entete;
    }

    public String getUpdatedEntete(int h,int w) {
        entete = new SVG(h,w).entete;
        return entete;
    }

    public void setEntete(String entete) {
        this.entete = entete;
    }

    public String getPied() {
        return pied;
    }

    @Override
    public void initierEcriture(Dessin d) {
        this.ecrireDansFichier(getUpdatedEntete(d.getHeight(),d.getWidth()));
    }

    @Override
    public void finirEcriture(Dessin d) {
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
