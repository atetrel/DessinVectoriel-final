package visitor;

import figure.Cercle;
import figure.Figure;
import figure.Segment;
import figure.Point;

import java.awt.*;

/**
 * Created by tetrel on 17/11/15.
 */
public abstract class FigureVisitor {

    public void visit(Figure f){
        String languageName = this.getClass().getSimpleName();
        String figureName = f.getClass().getSimpleName();
        String specificVisitor = "visitor."+languageName.toLowerCase()+".specific."+languageName+figureName;

        Object myInstance = null;
        try {
            myInstance = (Class.forName(specificVisitor).newInstance());
            ((SpecificVisitor)(myInstance)).specificVisit(f);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
