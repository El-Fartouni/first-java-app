/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.app;

/**
 *
 * @author Administrateur
 */
public class TestVoiture {

    public static void main(String[] args) {
        //Création d'une nouvele voiture basée sur la classe Voiture
        //instanciation
        Voiture maVoiture = new Voiture("Skoda", "Fabia");

        Voiture teufteuf = new Voiture("Peugeot", "104");

        System.out.println(maVoiture.getMarque() + " " + maVoiture.getModele());
        Short Short;

        teufteuf.setPuissanceMoteur((short) 80);
        System.out.println(teufteuf.getInfos());

        Personne joe = new Personne("Driver", "Joe", (byte) 45, 'M');
        Personne marie = new Personne("Driver", "Marie", (byte) 17, 'F');
        
        System.out.println(marie);
        
        teufteuf.setConducteur(marie);
    }

}
