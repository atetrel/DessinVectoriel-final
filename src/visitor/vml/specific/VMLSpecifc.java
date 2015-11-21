package visitor.vml.specific;

import visitor.SpecificVisitor;

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


}
