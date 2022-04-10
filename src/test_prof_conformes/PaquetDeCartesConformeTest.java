package test_prof_conformes;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.List;

import org.junit.Test;

import cartes.Carte;
import cartes.PaquetDeCartes;
//import structures.liste.ListeSymetrique;

/**
 * Tests de conformité pour la classe Rectangle Tp2 420-202-LI Hiver 2015
 *
 * @author Jocelyn.Goulet
 */
public class PaquetDeCartesConformeTest
{

    @Test
    public void testPaquetDeCartesConforme() throws ClassNotFoundException, Exception
    {
        // Package et nom de la classe
        Class c = Class.forName("cartes.PaquetDeCartes");

        // Constructeurs
        assertTrue(c.getConstructor(new Class[]{}).getName() == "cartes.PaquetDeCartes");
        assertTrue(c.getConstructor(new Class[]{List.class}).getName() == "cartes.PaquetDeCartes");

        // Interface
        PaquetDeCartes paquet = new PaquetDeCartes();
        assertTrue(paquet instanceof Serializable);

        // Attributs
        assertTrue((c.getField("NBR_ECHANGE").getType() == int.class) && (PaquetDeCartes.NBR_ECHANGE == 1000));
        assertTrue(c.getDeclaredField("paquet").getType() == List.class);

        // Méthodes
        assertTrue(c.getMethod("brasser", new Class[]{}).getReturnType() == void.class);
        assertTrue(c.getDeclaredMethod("permuterCarte", new Class[]{int.class, int.class})
                .getReturnType() == void.class);
        assertTrue(c.getMethod("prendreCarte", new Class[]{int.class}).getReturnType() == Carte.class);
        assertTrue(c.getMethod("consulterCarte", new Class[]{int.class}).getReturnType() == Carte.class);
        assertTrue(
                c.getMethod("retournerToutesLesCartes", new Class[]{boolean.class}).getReturnType() == void.class);
        assertTrue(c.getMethod("size", new Class[]{}).getReturnType() == int.class);
        assertTrue(c.getMethod("isEmpty", new Class[]{}).getReturnType() == boolean.class);
        assertTrue(c.getDeclaredMethod("validerPosition", new Class[]{int.class}).getReturnType() == boolean.class);
    }
}
