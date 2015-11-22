package visitor;

import figure.Figure;
import outils.FileHandler;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 */
public abstract class FigureVisitor {

    public abstract String getEntete();

    public abstract String getContenu();

    public abstract String getPied();

    public void visit(Figure f, HashMap<String,String> h){
        String languageName = this.getClass().getSimpleName();
        String figureName = f.getClass().getSimpleName();
        String specificVisitor = "visitor."+languageName.toLowerCase()+".specific."+languageName+figureName;

        Object myInstance = null;
        try {
            myInstance = (Class.forName(specificVisitor).newInstance());
            ((SpecificVisitor)(myInstance)).specificVisit(f,h);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public abstract void initierEcriture();
    public abstract void finirEcriture();

    public void ecrireDansFichier(String content){
        FileHandler.STATIC_ACCESS.ecrireDansFichier(content);
    }


}
