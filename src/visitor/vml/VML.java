package visitor.vml;


import figure.Figure;
import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class VML extends FigureVisitor {
    private String entete;
    private String pied;
    private String contenu;

    public VML() {
        this.entete = "";
        this.contenu = "";
        this.pied = "";
    }

    public String getEntete() {
        return entete;
    }

    public String getPied() {
        return pied;
    }

    public String getContenu() {
        return contenu;
    }

    //
//    public void visit(Cercle c) {
//
//        contenu += new VMLCercle().visit(c);
//    }
//
//
//
//    public String display() {
//        return getEntete()+"\n"+getContenu()+"\n"+getPied();
//    }
//
//
//    public void visit(Point p) {
//
//    }
//
//
//    public void visit(Segment l) {
//        contenu += "<v:line \n";
//
//        for (Map.Entry<String, String> entry : l.getOptions().entrySet())
//        {
//            if (entry.getKey()!="name") {
//                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
//            }
//        }
//        Point p1 = l.getDepart();
//        Point p2 = l.getArrivee();
//
//        contenu += "from=\""+p1.getAbscisse()+","+p1.getOrdonnee()+"\n to=\""+p2.getAbscisse()+","+p2.getOrdonnee()+"\">\n";
//
//        contenu += "</v:line>\n";
//
//    }

}
