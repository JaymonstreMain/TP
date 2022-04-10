package cartes;

import java.io.Serializable;

/**
 * Cette classe permet de gérer la carte
 */
public class Carte implements Comparable<Carte>, Serializable {
    /**
     * C'est le nombre d'images dans le dossiers
     */
    public static final long IMAGE_DOS = 'c';

    /**
     * Valeur de la carte
     */
    private ValeurCartes valeur;

    /**
     * Sorte de la carte
     */
    private SorteCartes sorte;

    /**
     * Visibilité de la carte
     */
    private boolean visible;

    /**
     * Constructeur de la classe Carte
     * @param valeur
     * @param sorte
     */
    public Carte(ValeurCartes valeur, SorteCartes sorte){
       // if(estVisible() == true){
        this.valeur = valeur;
        this.sorte = sorte;
       // }
    }

    /**
     * Cette méthode sert à comparer les cartes
     * @param o
     * @return resultat de la comparaison
     */
    @Override
    public int compareTo(Carte o) {
        return 0;
    }

    /**
     * Cette méthode permet de comparer les cartes
     * @param objet
     * @return résultat de la comparaison
     */
    @Override
    public boolean equals(Object objet) {
        return false;
    }

    /**
     * Cette méthode permet de vérifier si la carte est visible
     * @return la vérification de visibilité
     */
    public boolean estVisible() {
        return this.visible;
    }

    /**
     * Cette méthode permet d'obtenir la valeur de la carte
     * @return
     */
    public ValeurCartes getValeur() {
        return this.valeur;
    }

    /**
     * Cette méthode permet d'obtenir le symbole de la valeur de la carte
     * @return le symbole de la valeur de la carte
     */
    public String getValeurSymbole(){
        return this.valeur.getSymbole();
    }

    /**
     * Cette méthode permet d'obtenir la sorte de la carte
     * @return la sorte de la carte
     */
    public SorteCartes getSorte() {
        return this.sorte;
    }

    /**
     * Cette méthode permet d'obtenir le symbole de la sorte de la carte
     * @return le symbole de la sorte de la carte
     */
    public char getSorteSymbole(){
        return this.sorte.getSymbole();
    }

    /**
     * Cette méthode permet d'assigner la valeur de la carte
     * @param valeur
     */
    public void setValeur(ValeurCartes valeur) {
        this.valeur = valeur;
    }

    /**
     * Cette méthode permet d'assigner la sorte de la carte
     * @param sorte
     */
    public void setSorte(SorteCartes sorte) {
        this.sorte = sorte;
    }

    /**
     * Cette méthode permet d'assigner le facteur de véracité  de la carte
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * Permet de personnaliser l'affichage de la carte
     * @return l'affichage de la carte personnalisé
     */
    @Override
    public String toString() {
        return this.valeur.getSymbole() + this.sorte.getSymbole();
    }

    /**
     * Permet de personnaliser l'affichage de la carte
     * @return l'affichage personnalisé de la carte
     */
    public String toStringCarte() {
        return "";
    }
}
