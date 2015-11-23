package visitor;

import figure.Figure;
import main.Dessin;
import outils.FileHandler;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public abstract class FigureVisitor {


    public abstract String getEntete();

    public abstract String getContenu();

    public abstract String getPied();

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

    public abstract void initierEcriture(Dessin d);
    public abstract void finirEcriture(Dessin d);

    public void ecrireDansFichier(String content){
        FileHandler.STATIC_ACCESS.ecrireDansFichier(content);
    }


}
