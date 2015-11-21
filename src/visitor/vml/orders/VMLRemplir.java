package visitor.vml.orders;

import visitor.SpecificOrder;

/**
 * Created by Vic on 21/11/2015.
 */
public class VMLRemplir extends SpecificOrder {
    @Override
    public String execute(String param) {

        return "Je remplis en "+param;
    }
}
