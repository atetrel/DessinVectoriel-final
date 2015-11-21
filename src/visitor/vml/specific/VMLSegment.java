package visitor.vml.specific;

import figure.Cercle;
import figure.Figure;
import figure.Point;
import figure.Segment;
import visitor.SpecificVisitor;

import java.util.Map;

/**
 * Created by tetrel on 21/11/15.
 */
public class VMLSegment extends SpecificVisitor {


    @Override
    public void specificVisit(Figure f) {
        Segment segment  = (Segment) f;
        String s = this.visit(segment);
        System.out.println(s);
    }


    public String visit (Segment s) {

        String contenu = "";

        contenu += "<v:line \n";

        for (Map.Entry<String, String> entry : s.getOptions().entrySet())
        {
            if (entry.getKey()!="name") {
                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
           }
        }
        Point p1 = s.getDepart();
        Point p2 = s.getArrivee();

        contenu += "from=\""+p1.getAbscisse()+","+p1.getOrdonnee()+"\n to=\""+p2.getAbscisse()+","+p2.getOrdonnee()+"\">\n";

        return contenu += "</v:line>\n";

    }
}
