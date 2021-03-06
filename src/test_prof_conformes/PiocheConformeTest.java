package test_prof_conformes;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import cartes.Carte;
import cartes.PaquetDeCartes;
import cartes.Pioche;
import cartes.SorteCartes;
import cartes.ValeurCartes;
import structures.pile.Pile;

/**
 * Tests de conformité pour la classe Rectangle Tp2 420-202-LI Hiver 2015
 *
 * @author Jocelyn.Goulet
 */
public class PiocheConformeTest
{

    @Test
    public void testPiocheConforme() throws ClassNotFoundException, Exception
    {
        // Package et nom de la classe
        Class c = Class.forName("cartes.Pioche");

        // Constructeurs
        assertTrue(c.getConstructor(new Class[]{PaquetDeCartes.class}).getName() == "cartes.Pioche");

        // Interface
        Pioche pioche = new Pioche(null);
        assertTrue(pioche instanceof Serializable);

        // Attributs
        assertTrue(c.getDeclaredField("pioche").getType() == Pile.class);

        // Méthodes
        assertTrue(c.getMethod("piger", new Class[]{}).getReturnType() == Carte.class);
        assertTrue(c.getMethod("consulterDessus", new Class[]{}).getReturnType() == String.class);
        assertTrue(c.getMethod("isEmpty", new Class[]{}).getReturnType() == boolean.class);
        assertTrue(c.getMethod("size", new Class[]{}).getReturnType() == int.class);
    }
}
