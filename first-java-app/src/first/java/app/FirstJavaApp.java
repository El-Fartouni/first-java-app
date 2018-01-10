/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.app;

import java.util.Scanner; // Nouvelle classe créer

/**
 *
 * @author Administrateur
 */
public class FirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guessNumber();
        //addition();
        /*
        String name;
        name = "Seb";
        Short age = 47;10
        
        System.out.println("Entrez votre nom");

        // Créer une instance de Scanner. Le Scanner
        // permet de saisir une phrase dans le out put
        Scanner sc = new Scanner(System.in); 
        
       // Lecture de la saisie et affectation de la saisie
        name = sc.next();
        
        System.out.println("Hello " + name + " vous avez " + age + " ans");

        if (18 >= age) {
            System.out.println("mineur");
        } else {
            System.out.println("majeur");
        }
         */
    }

    /**
     * @author Addition interactive d'une liste saisi par l'utilisateur
     */
    public static void addition() {
        //Le nombre saisi par l'utilisateur
        Short inputNumber;

        //Le nombre des nombres saisis
        Integer total = 0;

        //Instanciation (A partir d'une classe, on crée un objet. Dès qu'on a 
        //quelque chose qui commence par new c'est une instanciation) du Scanner
        Scanner sc = new Scanner(System.in);

        //Demander la saisie d'un nombre tant que la saisie corespond
        //à un nombre valide
        while (sc.hasNextShort()) {
            System.out.println("Veuillez saisir un nombre");
            //Stockage de la saisie dans la variable inputNumber
            inputNumber = sc.nextShort();
            //Toalisation
            total += inputNumber;
        }
        // Affichage du résultat
        System.out.println("La somme est " + total);

    }

    /*
    *Je devine un nombre aléatoire
     */
    public static void guessNumber() {
        //Nombre aléatoire à deviner
        byte secret = (byte) (Math.random() * 100);
        //Nombre saisi par le joueur
        byte inputNumber;
        // Booléen qui indique si le joueur à ganger
        boolean bingo = false;

        //Instanciation du Scanner
        Scanner sc = new Scanner(System.in);
        while (bingo == false) {
            //Demander la saisie
            System.out.println("Entrez un nombre entre 0 et 100");
            inputNumber = sc.nextByte();

            //comparaison de la saisie avec le nombre secret
            if (inputNumber == secret) {
                System.out.println("Vous avez gagné");
                bingo = true;
            } else if (inputNumber < secret) {
                System.out.println("trop petit");
            } else {
                System.out.println("trop grand");
            }
        }
    }
}
