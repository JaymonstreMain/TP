package cartes;

import structures.pile.Pile;

import java.io.Serializable;

public class Pioche implements Serializable {
    private Pile pioche;

    public Pioche(PaquetDeCartes paquetDeCartes) {
        if (paquetDeCartes != null) {
            pioche = new Pile();

            while (!paquetDeCartes.isEmpty()) {
                pioche.empiler(paquetDeCartes.prendreCarte(0)); //prof : prendre size ?
            }
        }
    }

    public String consulterDessus() {
        return "";
    }

    public boolean isEmpty() {
        return pioche.isEmpty();
    }

    public Carte piger() {
        return (Carte) pioche.depiler();
    }

    public int size() {
        return pioche.size();
    }
}
