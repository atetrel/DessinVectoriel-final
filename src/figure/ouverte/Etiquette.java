package figure.ouverte;

import visitor.FigureVisitor;

/**
 * Created by Vic on 22/11/2015.
 */
public class Etiquette extends FigureOuverte {

    private String text;
    private int fontSize;
    private Point anchor;

    public Etiquette(String text, int fontSize, Point anchor) {
        this.text = text;
        this.fontSize = fontSize;
        this.anchor = anchor;
    }

    public String getText() {
        return text;
    }

    public int getFontSize() {
        return fontSize;
    }

    public Point getAnchor() {
        return anchor;
    }

    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }

    @Override
    public void changeSize(double percentage) {
        anchor.changeSize(percentage);
        fontSize = (int)(((double)fontSize)*percentage/100);
    }

    @Override
    public void translate(double abs, double ord) {
        anchor.translate(abs, ord);
    }
}
