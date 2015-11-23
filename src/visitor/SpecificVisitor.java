package visitor;

import figure.Figure;
import outils.FileHandler;

import java.util.HashMap;

/**
 * Created by Vic on 21/11/2015.
 *Correspond a un langage et une figure seulement.
 * Doit respecter les conventions de noms specifies dans le readme.
 */
public abstract class SpecificVisitor {



    public abstract String getLanguage();
    public abstract void specificVisit(Figure f);
    public void ecrireDansFichier(String content){
        FileHandler.STATIC_ACCESS.ecrireDansFichier(content);
    }

    public String addParameters(HashMap<String,String> h){
        String contenu="";
        if(h.size()>0) contenu+=this.visitParameters(h);
        return contenu;
    }

    /**
     * Appelle les visiteurs d'ordres specifiques aux ordres a traiter
     * @param h
     * @return
     */
    public String visitParameters(HashMap<String,String> h){
        String ret = "";
        String languageName = getLanguage();
        for(String key : h.keySet()) {
            String specificOrder = "visitor." + languageName.toLowerCase() + ".orders." + languageName + key;
            Object myInstance = null;
            try {

                myInstance = (Class.forName(specificOrder).newInstance());
                ret+=  ((SpecificOrder)(myInstance)).execute(h.get(key));


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println();
                e.printStackTrace();
            }


        }

        return ret;
    }


}
