package visitor;


import figure.Cercle;
import figure.Figure;
import figure.Point;
import figure.Segment;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

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



    @Override
    public void visit(Cercle c) {

        contenu += "<v:arc \n";


        for (Map.Entry<String, String> entry : c.getOptions().entrySet())
        {
            if (entry.getKey()!="name") {
                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
            }
        }

        contenu += "\nstartangle=\"0\" endangle=\"360\"";

        contenu += ">\n</v:arc>\n";
    }


    public String display() {
        return getEntete()+"\n"+getContenu()+"\n"+getPied();
    }

    @Override
    public void visit(Point p) {

    }

    @Override
    public void visit(Segment l) {
        contenu += "<v:line \n";

        for (Map.Entry<String, String> entry : l.getOptions().entrySet())
        {
            if (entry.getKey()!="name") {
                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
            }
        }
        Point p1 = l.getDepart();
        Point p2 = l.getArrivee();

        contenu += "from=\""+p1.getAbscisse()+","+p1.getOrdonnee()+"\n to=\""+p2.getAbscisse()+","+p2.getOrdonnee()+"\">\n";

        contenu += "</v:line>\n";

    }

}
