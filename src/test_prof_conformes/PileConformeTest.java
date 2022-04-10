package test_prof_conformes;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.Arrays;

import org.junit.Test;

import cartes.Carte;
import cartes.PaquetDeCartes;
//import structures.liste.ListeSymetrique;
import structures.pile.NoeudPile;
import structures.pile.Pile;

/**
 * Tests de conformité pour la classe Rectangle Tp2 420-202-LI Hiver 2015
 *
 * @author Jocelyn.Goulet
 */
public class PileConformeTest
{

    @Test
    public void testPileConforme() throws ClassNotFoundException, Exception
    {
        // Package et nom de la classe
        Class c = Class.forName("structures.pile.Pile");

        // Constructeurs
        assertTrue(c.getConstructor(new Class[]{}).getName() == "structures.pile.Pile");

        // Interface
        Pile pile = new Pile();
        assertTrue(pile instanceof Serializable);

        // Attributs
        assertTrue(c.getDeclaredField("sommet").getType() == NoeudPile.class);
        assertTrue(c.getDeclaredField("taille").getType() == int.class);

        // Méthodes
        assertTrue(c.getMethod("isEmpty", new Class[]{}).getReturnType() == boolean.class);
        assertTrue(c.getMethod("vider", new Class[]{}).getReturnType() == void.class);
        assertTrue(c.getMethod("empiler", new Class[]{Object.class}).getReturnType() == void.class);
        assertTrue(
                c.getMethod("depiler", new Class[]{}).getReturnType() == Object.class);
        assertTrue(c.getMethod("getPremier", new Class[]{}).getReturnType() == Object.class);
        assertTrue(c.getMethod("size", new Class[]{}).getReturnType() == int.class);
        assertTrue(c.getMethod("toString", new Class[]{}).getReturnType() == String.class);
    }
}
