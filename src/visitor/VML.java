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
        contenu += "<v:"+c.getOptions().get("name")+"> \n";


        for (Map.Entry<String, String> entry : c.getOptions().entrySet())
        {
            contenu += entry.getKey()+"=\""+entry.getValue()+"\" ";
        }

        contenu += "\n</v:"+c.getOptions().get("name")+">";
    }


    public String display() {
        return getEntete()+"\n"+getContenu()+"\n"+getPied();
    }

    @Override
    public void visit(Point p) {

    }

    @Override
    public void visit(Segment l) {
        contenu += l.getContenu();
    }

}
