package visitor.svg.specific;

import figure.Figure;
import visitor.SpecificVisitor;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 */
public abstract class SVGSpecific  extends SpecificVisitor {


    @Override
    public String getLanguage() {
        return null;
    }

}
