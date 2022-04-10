package structures.pile;

import exceptions.PileException;

import java.io.Serializable;

public class Pile implements Serializable {
    private NoeudPile sommet;

    private int taille;

    public Pile() {
        vider();
    }

    public Object depiler() {
        Object retour = null;

        if (!isEmpty()) {
            retour = sommet.getElement();
            this.sommet = this.sommet.getPrecedent();
            this.taille--;
        } else {
            throw new PileException("Pile vide");
        }

        return retour;
    }

    public void empiler(Object element) {
        sommet = new NoeudPile(element, this.sommet);
        this.taille++;
    }

    public Object getPremier() {
        Object retour = null;

        if (!isEmpty()) {
            retour = sommet.getElement();
        } else {
            throw new PileException("La pile est vide");
        }

        return retour;
    }

    public boolean isEmpty() {
        return sommet == null;
    }

    public int size() {
        return this.taille;
    }

    @Override
    public String toString() {
        NoeudPile temp = this.sommet;
        // if raccourci
        String s = isEmpty() ? "vide!\n" : "";

        while (temp != null) {
            s += temp.getElement() + "\n";
            temp = temp.getPrecedent();
        }

        return s;
    }

    public void vider() {
        this.sommet = null;
        this.taille = 0;
        System.gc();
    }
}
