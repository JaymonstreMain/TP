package test_prof_conformes;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import cartes.Carte;
import cartes.SorteCartes;
import cartes.ValeurCartes;

/**
 * Tests de conformité pour la classe Rectangle Tp2 420-202-LI Hiver 2015
 *
 * @author Jocelyn.Goulet
 */
public class CarteConformeTest
{

    @Test
    public void testCarteConforme() throws ClassNotFoundException, Exception
    {
        // Package et nom de la classe
        Class c = Class.forName("cartes.Carte");

        // Constructeurs
        assertTrue(c.getConstructor(new Class[]{ValeurCartes.class, SorteCartes.class}).getName() ==
				"cartes.Carte");

        // Interface
        Carte carte = new Carte(ValeurCartes.V_10, SorteCartes.CARREAU);
        assertTrue(carte instanceof Serializable);
        assertTrue(carte instanceof Comparable);

        // Attributs
        //assertTrue((c.getField("IMAGE_DOS").getType() == Character.class) && (Carte.IMAGE_DOS == '\u263A'));
        assertTrue(c.getDeclaredField("valeur").getType() == ValeurCartes.class);
        assertTrue(c.getDeclaredField("sorte").getType() == SorteCartes.class);
        assertTrue(c.getDeclaredField("visible").getType() == boolean.class);

        // Méthodes
        assertTrue(c.getMethod("getValeur", new Class[]{}).getReturnType() == ValeurCartes.class);
        assertTrue(c.getMethod("getValeurSymbole", new Class[]{}).getReturnType() == String.class);
        assertTrue(c.getMethod("getSorte", new Class[]{}).getReturnType() == SorteCartes.class);
        assertTrue(c.getMethod("getSorteSymbole", new Class[]{}).getReturnType() == char.class);
        assertTrue(c.getMethod("estVisible", new Class[]{}).getReturnType() == boolean.class);
        assertTrue(c.getMethod("setVisible", new Class[]{boolean.class}).getReturnType() == void.class);
        assertTrue(c.getMethod("toStringCarte", new Class[]{}).getReturnType() == String.class);
        assertTrue(c.getMethod("equals", new Class[]{Object.class}).getReturnType() == boolean.class);
        assertTrue(c.getMethod("compareTo", new Class[]{Carte.class}).getReturnType() == int.class);
        assertTrue(c.getMethod("toString", new Class[]{}).getReturnType() == String.class);
        assertTrue(c.getDeclaredMethod("setValeur", new Class[]{ValeurCartes.class}).getReturnType() == void.class);
        assertTrue(c.getDeclaredMethod("setSorte", new Class[]{SorteCartes.class}).getReturnType() == void.class);
    }
}
