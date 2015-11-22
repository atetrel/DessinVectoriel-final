package visitor.vml.specific;

import figure.Figure;
import figure.ouverte.Etiquette;
import outils.Crayon;

/**
 * Created by Vic on 22/11/2015.
 */
public class VMLEtiquette extends VMLSpecifc {

    @Override
    public void specificVisit(Figure f) {
        Etiquette e = (Etiquette) f;
        this.ecrireDansFichier(this.visit(e));
    }

    public String visit(Etiquette e){
        return this.VMLQuickOpen("textbox")+ e.getText() + this.VMLQuickClose("textbox");
    }
}
