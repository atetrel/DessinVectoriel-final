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

        contenu += "<v:arc \n";

//        for (Map.Entry<String, String> entry : c.getOptions().entrySet())
//        {
//            if (entry.getKey()!="name") {
//                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
//            }
//        }

        contenu += "\nstartangle=\"0\" endangle=\"360\"";

        contenu+= this.addParameters(c.getParameters());


        contenu += ">\n</v:arc>\n";

        return contenu;
    }


}
