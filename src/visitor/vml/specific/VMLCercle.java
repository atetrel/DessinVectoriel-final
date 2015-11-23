package visitor.vml.specific;

import figure.fermee.Cercle;
import figure.Figure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vic on 21/11/2015.
 */
public class VMLCercle extends VMLSpecifc {

    @Override
    public void specificVisit(Figure f) {
        Cercle c = (Cercle) f;
        String s = this.visit(c);
        this.ecrireDansFichier(s);


    }



    public String visit(Cercle c) {

        String contenu = "";
        contenu += "startangle=\"0\" endangle=\"360\" ";

        contenu+= this.addParameters(c.getParameters());

        return this.VMLStringAutomation("arc",contenu);
    }


}
