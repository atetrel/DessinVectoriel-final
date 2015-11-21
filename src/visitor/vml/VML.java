package visitor.vml;


import figure.Figure;
import visitor.FigureVisitor;

/**
 * Created by tetrel on 17/11/15.
 */
public class VML extends FigureVisitor {
    private String entete;
    private String contenu;
    private String pied;

    public VML() {
        this.entete = "<style>v\\: * { behavior:url(#default#VML); display:inline-block }</style>\n<xml:namespace ns=\"urn:schemas-microsoft-com:vml\" prefix=\"v\" />";
        this.contenu = "";
        this.pied = "";
    }

    public String getEntete() {
        return entete;
    }


    public String getContenu() {
        return contenu;
    }


    public String getPied() {
        return pied;
    }
}
