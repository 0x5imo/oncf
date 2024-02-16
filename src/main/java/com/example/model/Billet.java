// Déclaration du package auquel appartient la classe
package com.example.model;

// Définition de la classe Billet
public class Billet {
    // Attributs de la classe
    private int id; // Identifiant du billet
    private String stDepart; // Ville de départ
    private String stArrivee; // Ville d'arrivée
    private String heureDepart; // Heure de départ
    private String heureArrivee; // Heure d'arrivée
    private int Classe; // Classe du billet
    private int prix; // Prix du billet

    // Constructeur de la classe Billet
    public Billet(String stDepart, String stArrivee, String heureDepart, String heureArrivee, int classe, int prix) {
        this.stDepart = stDepart;
        this.stArrivee = stArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        Classe = classe;
        this.prix = prix;
    }

    // Méthode pour obtenir la ville de départ
    public String getStDepart() {
        return stDepart;
    }

    // Méthode pour définir la ville de départ
    public void setStDepart(String stDepart) {
        this.stDepart = stDepart;
    }

    // Méthode pour obtenir la ville d'arrivée
    public String getStArrivee() {
        return stArrivee;
    }

    // Méthode pour définir la ville d'arrivée
    public void setStArrivee(String stArrivee) {
        this.stArrivee = stArrivee;
    }

    // Méthode pour obtenir l'heure de départ
    public String getHeureDepart() {
        return heureDepart;
    }

    // Méthode pour définir l'heure de départ
    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    // Méthode pour obtenir l'heure d'arrivée
    public String getHeureArrivee() {
        return heureArrivee;
    }

    // Méthode pour définir l'heure d'arrivée
    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    // Méthode pour obtenir la classe du billet
    public int getClasse() {
        return Classe;
    }

    // Méthode pour définir la classe du billet
    public void setClasse(int classe) {
        Classe = classe;
    }

    // Méthode pour obtenir le prix du billet
    public int getPrix() {
        return prix;
    }

    // Méthode pour définir le prix du billet
    public void setPrix(int prix) {
        this.prix = prix;
    }

}
