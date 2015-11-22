package visitor.svg.specific;

import figure.Figure;
import figure.ouverte.Etiquette;
import outils.Crayon;

/**
 * Created by Vic on 22/11/2015.
 */
public class SVGEtiquette extends SVGSpecific {

    @Override
    public void specificVisit(Figure f) {
        Etiquette e = (Etiquette) f;
        this.ecrireDansFichier(this.visit(e));
    }

    public String visit(Etiquette e){
        String s = this.addSVGParameter("x",""+e.getAnchor().getAbscisse());
        s+= this.addSVGParameter("y",""+e.getAnchor().getOrdonnee());
        s+=this.addSVGParameter("fill",""+ Crayon.getDefaultCrayon().getCouleur());

        return this.SVGQuickOpen("text")+ s + ">"+e.getText()+this.SVGQuickOpen("/text")+">";
    }
}
