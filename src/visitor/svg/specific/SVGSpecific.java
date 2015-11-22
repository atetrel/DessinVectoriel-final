package visitor.svg.specific;

import outils.Crayon;
import visitor.SpecificVisitor;
import visitor.svg.SVG;

/**
 * Created by Vic on 21/11/2015.
 */
public abstract class SVGSpecific  extends SpecificVisitor {

    public static final String LANGUAGE = "SVG";

    @Override
    public String getLanguage() {
        return LANGUAGE;
    }

    public String addSVGParameter(String key, String value){
        return key+"="+ SVG.GUILL +value+ SVG.GUILL +" ";
    }

    public String SVGQuickOpen(String type){
        return "<"+type+" ";
    }

    public String SVGQuickClose(){
        return" />";
    }

    public String handleCrayon(){
        return "stroke=\""+ Crayon.getDefaultCrayon().getCouleur()+"\" stroke-width=\""+Crayon.getDefaultCrayon().getLargeur()+"\" ";
    }

    public String SVGStringAutomation(String type,String specific){
        return SVGQuickOpen(type)+specific+handleCrayon()+SVGQuickClose()+System.lineSeparator();
    }

}
