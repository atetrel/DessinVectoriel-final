package visitor.svg.specific;

import figure.fermee.Cercle;
import figure.Figure;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public class SVGCercle extends SVGSpecific {



    @Override
    public void specificVisit(Figure f) {
        Cercle c = (Cercle) f;
        this.ecrireDansFichier(this.visit(c));
    }

    public String visit(Cercle c){
        String s=this.addSVGParameter("cx",""+c.getCentre().getAbscisse());
        s+=this.addSVGParameter("cy",""+c.getCentre().getOrdonnee());
        s+=this.addSVGParameter("r",""+c.getRayon());
        s+=this.addParameters(c.getParameters());
        return this.SVGStringAutomation("circle",s);
    }


}
