package visitor.svg.orders;

import visitor.SpecificOrder;
import visitor.svg.SVG;

/**
 * Created by Vic on 22/11/2015.
 */
public class SVGColoriser extends SVGOrder {

    @Override
    public String execute(String param) {
        return "stroke="+ SVG.GUILL+param+SVG.GUILL;
    }
}
