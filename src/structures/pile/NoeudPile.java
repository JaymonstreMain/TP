package structures.pile;

import java.io.Serializable;

public class NoeudPile implements Serializable {
    private static final long serialVersionUID = 0;

    private Object element;

    private NoeudPile precedent;

    public NoeudPile(Object element) {
        this(element, null);
    }

    public NoeudPile(Object element, NoeudPile noeudPile) {
        setElement(element);
        setPrecedent(noeudPile);
    }

    public Object getElement() {
        return this.element;
    }

    public NoeudPile getPrecedent() {
        return this.precedent;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setPrecedent(NoeudPile noeudPile) {
        this.precedent = noeudPile;
    }
}