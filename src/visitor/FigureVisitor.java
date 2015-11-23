package visitor;

import figure.Figure;
import main.Dessin;
import outils.FileHandler;

import java.util.HashMap;

/**
 * Created by tetrel on 17/11/15.
 * Correspond a un visiteur, et donc dans notre cas à un langage.
 * Pour chaque figure visitee appelle le visiteur specifique qui correspond
 * en le trouvant grace aux conventions de noms de classe : les visiteur specifique
 * d'un carre en SVG doit se nommer SVGCarre et se trouver dans visitor.svg.specific.
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
            System.out.println("Le visiteur spécifique n'a pas été créé : "+languageName+figureName);
            e.printStackTrace();
        }
    }

    /**
     * Appele a la creation d'un fichier.
     * @param d le dessin a representer, dont certains parametres seront utiles a la creation du fichier
     * selon le langage(ex : la taille)
     */
    public abstract void initierEcriture(Dessin d);

    /**
     * Appele a la fermeture du fichier
     * @param d le dessin a representer, dont certains parametres seront utiles a la creation du fichier
     * selon le langage(ex : la taille)
     */
    public abstract void finirEcriture(Dessin d);

    /**
     * Pour faciliter l'écriture dans le fichier de sortie.
     * Ainsi il est plus facile d'implementer un autre langage ou un nouveau visiteur specifique.
     * @param content
     */
    public void ecrireDansFichier(String content){
        FileHandler.STATIC_ACCESS.ecrireDansFichier(content);
    }


}
