package visitor.vml.orders;

import visitor.SpecificOrder;

/**
 * Created by Vic on 22/11/2015.
 */
public class VMLColoriser extends SpecificOrder {
    @Override
    public String execute(String param) {
        return "Je colorise en "+param;
    }
}
