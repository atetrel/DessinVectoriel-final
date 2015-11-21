package visitor.vml.specific;

import figure.Cercle;
import figure.Figure;
import visitor.SpecificVisitor;
import visitor.vml.VML;

import java.util.Map;

/**
 * Created by Vic on 21/11/2015.
 */
public class VMLCercle extends SpecificVisitor {

    @Override
    public void specificVisit(Figure f) {
        Cercle c = (Cercle) f;
        String s = this.visit(c);

    }



    public String visit(Cercle c) {

        System.out.println("Je trace un cercle en VML");
        this.ecrireDansFichier("Je trace un cercle en VML");

        String contenu = "";

        contenu += "<v:arc \n";


        for (Map.Entry<String, String> entry : c.getOptions().entrySet())
        {
            if (entry.getKey()!="name") {
                contenu += entry.getKey() + "=\"" + entry.getValue() + "\" ";
            }
        }

        contenu += "\nstartangle=\"0\" endangle=\"360\"";

        contenu += ">\n</v:arc>\n";

        return contenu;
    }


}
