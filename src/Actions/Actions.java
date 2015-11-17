package Actions;

import figure.Figure;
import outils.Crayon;
import visitor.ActionVisitor;

import java.awt.*;

/**
 * Created by tetrel on 17/11/15.
 */
public interface Actions {

    void apply(Figure f);

}
