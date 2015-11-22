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
    public void specificVisit(Figure f, HashMap<String,String> h) {
        Segment segment  = (Segment) f;
        String s = this.visit(segment,h);
        this.ecrireDansFichier(s);
    }


    public String visit (Segment s, HashMap<String,String> h) {

        String contenu = "";

        contenu += "<v:line \n";




        Point p1 = s.getDepart();
        Point p2 = s.getArrivee();

        contenu += "from=\""+p1.getAbscisse()+","+p1.getOrdonnee()+"\n to=\""+p2.getAbscisse()+","+p2.getOrdonnee()+"\">\n";

        contenu+= this.addParameters(h);

        return contenu += "</v:line>\n";

    }
}
