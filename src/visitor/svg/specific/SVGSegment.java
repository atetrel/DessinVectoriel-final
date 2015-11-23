package visitor.svg.specific;

import figure.Figure;
import figure.ouverte.Segment;

/**
 * Created by Vic on 23/11/2015.
 */
public class SVGSegment extends SVGSpecific {
    @Override
    public void specificVisit(Figure f) {
        Segment s = (Segment) f;
        this.ecrireDansFichier(this.visit(s));
    }

    private String visit(Segment s) {
        String string = this.addSVGParameter("x1",""+s.getDepart().getAbscisse());
        string += this.addSVGParameter("x2",""+s.getDepart().getOrdonnee());
        string += this.addSVGParameter("y1",""+s.getArrivee().getAbscisse());
        string += this.addSVGParameter("y2",""+s.getArrivee().getOrdonnee());
        string += this.addParameters(s.getParameters());
        return this.SVGStringAutomation("line",string);
    }
}
