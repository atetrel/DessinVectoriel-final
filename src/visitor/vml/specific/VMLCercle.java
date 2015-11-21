package visitor.vml.specific;

import figure.Cercle;
import figure.Figure;
import visitor.SpecificVisitor;
import visitor.vml.VML;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vic on 21/11/2015.
 */
public class VMLCercle extends VMLSpecifc {

    @Override
    public void specificVisit(Figure f, HashMap<String,String> h) {
        Cercle c = (Cercle) f;
        String s = this.visit(c,h);
        this.ecrireDansFichier(s);


    }



    public String visit(Cercle c,HashMap<String,String> h) {

        String contenu = "";

        contenu += "<v:arc \n";

        for (Map.Entry<String, String> entry : c.getOptions().entrySet())
        {
            if (entry.getKey()!="name") {
                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
            }
        }

        contenu += "\nstartangle=\"0\" endangle=\"360\"";

        contenu+= this.addParameters(h);


        contenu += ">\n</v:arc>\n";

        return contenu;
    }


}
