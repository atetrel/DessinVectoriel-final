package visitor.vml.specific;

import figure.Figure;
import figure.ouverte.Point;
import figure.ouverte.Segment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tetrel on 21/11/15.
 */
public class VMLSegment extends VMLSpecifc {


    @Override
    public void specificVisit(Figure f) {
        Segment segment  = (Segment) f;
        String s = this.visit(segment);
        this.ecrireDansFichier(s);
    }


    public String visit (Segment s) {

        String contenu = "";

        Point p1 = s.getDepart();
        Point p2 = s.getArrivee();

        contenu += "from=\""+p1.getAbscisse()+","+p1.getOrdonnee()+"\n to=\""+p2.getAbscisse()+","+p2.getOrdonnee()+"\"\n";

        contenu+= this.addParameters(s.getParameters());

        return this.VMLStringAutomation("line",contenu);

    }
}
