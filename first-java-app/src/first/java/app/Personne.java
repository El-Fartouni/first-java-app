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
public class Personne {

    private String nom;

    private String prenom;

    private byte age;

    private char sexe;

    /**
     * Méthode Constructeur de l'objet
     */
    public Personne(String arg_nom, String arg_prenom, byte arg_age, char arg_sexe) {
        this.nom = arg_nom;
        this.prenom = arg_prenom;
        this.age = arg_age;
        this.sexe = arg_sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public byte getAge() {
        return age;
    }

    public char getSexe() {
        return sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(byte age) {
        if (age <= 0 || age > 120) {
            this.age = age;
        } else {
            System.out.println("L'age est inncohérent");
        }
    }

    public void setSexe(char sexe) {

        if (sexe == 'F' || sexe == 'H') {
            this.sexe = sexe;
        } else {
            System.out.println("Le sexe doit etre M ou F");
        }
    }

    public String toString() {
        String infos;
        infos = this.prenom + " " + this.nom.toUpperCase();
        return infos;
    }

    public boolean peutConduire() {
        return this.age > 17 && this.age < 90;
    }
}
