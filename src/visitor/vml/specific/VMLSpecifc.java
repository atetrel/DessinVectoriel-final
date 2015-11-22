package visitor.vml.specific;

import outils.Crayon;
import visitor.SpecificVisitor;
import visitor.svg.SVG;
import visitor.vml.VML;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public abstract class VMLSpecifc extends SpecificVisitor {
    public static final String LANGUAGE = "VML";

    @Override
    public String getLanguage() {
        return LANGUAGE;
    }

    public String addVMLParameter(String key, String value){
        return key+"="+ "\""+value+ "\" ";
    }

    public String VMLQuickOpen(String type){
        return "<v:"+type+">\n";
    }

    public String VMLQuickClose(String type){
        return"\n</v:"+type+">";
    }

    public String handleCrayon(){
        return this.handleCrayonColor()+" stroke-width=\""+ Crayon.getDefaultCrayon().getLargeur()+"\" ";
    }

    public String handleCrayonColor(){
        return "strokecolor=\""+ Crayon.getDefaultCrayon().getCouleur()+"\"";
    }


}
