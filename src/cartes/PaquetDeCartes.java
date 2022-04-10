package cartes;

import exceptions.ConstructeurException;

import java.io.Serializable;
import java.util.*;

/**
 * Cette classe permet de gérer le paquet de carte
 */
public class PaquetDeCartes implements Serializable {

    /**
     * Nombre d'échange
     */
    public static final int NBR_ECHANGE = 1000;

    /**
     * Paquet de cartes
     */
    private List<Carte> paquet;

    /**
     * Constructeur de la classe PaquetDeCartes
     */
    public PaquetDeCartes() {
        paquet = new ArrayList<>();

        for (SorteCartes sorteCarte : SorteCartes.values()) {
            for (ValeurCartes valeurCarte : ValeurCartes.values()) {
                Carte carte = new Carte(valeurCarte, sorteCarte);
                this.paquet.add(carte);
            }
        }
    }

    /**
     * Constructeur de la classe PaquetDeCartes
     *
     * @param newPaquet
     * @throws exceptions.ConstructeurException
     */
    public PaquetDeCartes(List<Carte> newPaquet) {
        this.paquet = paquet;
    }

    /**
     * Cette méthode permet de brasser le paquet de cartes
     */
    public void brasser() {
        Random rdm = new Random();

        for (int i = 0; i < paquet.size(); i++) {
            permuterCarte(i, rdm.nextInt(paquet.size() - 1));
        }
    }

    /**
     * Cette méthode permet de permuter les valeurs des cartes dans le paquet
     *
     * @param indiceA
     * @param indiceB
     */
    private void permuterCarte(int indiceA, int indiceB) {
        ArrayList<Carte> vecteurTemp = new ArrayList<>();

        vecteurTemp.add(paquet.get(indiceA));
        vecteurTemp.add(paquet.get(indiceB));

        paquet.set(indiceA, vecteurTemp.get(1));
        paquet.set(indiceB, vecteurTemp.get(0));
    }

    /**
     * Cette méthode permet de consulter une carte grâce à sa position
     *
     * @param position
     * @return le contenu de la carte
     */
    public Carte consulterCarte(int position) {
        if(validerPosition(position) == true && !isEmpty()){
            return paquet.get(position);
        }
        else
            return null;
    }

    /**
     * Cette méthode permet de prendre une carte dans la lisxzte grâce à ça position
     *
     * @param position
     * @return
     */
    public Carte prendreCarte(int position) {
        if(validerPosition(position) == true && !isEmpty()){
            return paquet.remove(position);
        }
        else
            return null;
    }

    /**
     * Cette méthode permet de retourner toutes les cartes
     *
     * @param visible
     */
    public void retournerToutesLesCartes(boolean visible) {
        // while (!paquet.isEmpty()) {
        for (int i = 0; i < paquet.size(); i++) {
            if (visible == true) {
                consulterCarte(i);
            }
        }
    }
    //}

    /**
     * Cette méthode permet d'obtenir la taille du paquet
     *
     * @return la taille du paquet de carte
     */
    public int size() {
        int retour = 0;

        if (paquet != null) {
            retour = paquet.size();
        }

        return retour;
    }

    /**
     * Cette méthode permet de vérifier si le paquet est vide
     *
     * @return
     */
    public boolean isEmpty() {
        return paquet.isEmpty();
    }

    /**
     * Cette méthode permet de valider la position d'une carte dans le paquet
     *
     * @param position
     * @return le résultat de la vérification de la validité de la position de la carte
     */
    private boolean validerPosition(int position) {
        return position < 0 || position < paquet.size();
    }

}











































/*package cartes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PaquetDeCartes {
    //public static final int NBR_ECHANGE;

    List<Carte> liste;


    public PaquetDeCartes(){
        brasser();
    }

    public PaquetDeCartes(List<Carte> liste){
        liste.add(new Carte(ValeurCartes.V_2, SorteCartes.CARREAU));
        brasser();
    }

    public void brasser(){

        System.out.println(size);
        Random rdm = new Random();
        for (int x = 0; x <= 52; x++) {
            permuter(x, rdm.nextInt(this.liste.size() - 1));
        }
    }

    private void permuter(int indiceA, int indiceB) {
        List<Carte> listeTemp = new ArrayList<>();

        listeTemp.add(this.liste.get(indiceA));
        listeTemp.add(this.liste.get(indiceB));

        this.liste.set(indiceA, listeTemp.get(1));
        this.liste.set(indiceB, listeTemp.get(0));

    }
    public void retournerToutesLesCartes(boolean boo){

    }

    public static void main(String[] args) {
        new PaquetDeCartes();
    }
}

*/




