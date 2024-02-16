// Déclaration du package pour organiser les classes
package com.example.model;

// Définition de la classe Trajet
public class Trajet {
    // Attributs privés de la classe Trajet
    private int id; // Identifiant du trajet
    private String stDepart; // Station de départ
    private String stArrivee; // Station d'arrivée
    private String heureDepart; // Heure de départ
    private String heureArrivee; // Heure d'arrivée
    private int tarif; // Tarif du trajet

    // Constructeur de la classe Trajet
    public Trajet(String stDepart, String stArrivee, String heureDepart, String heureArrivee, int tarif) {
        this.stDepart = stDepart;
        this.stArrivee = stArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.tarif = tarif;
    }

    // Méthode pour obtenir l'identifiant du trajet
    public int getId() {
        return id;
    }

    // Méthode pour définir l'identifiant du trajet
    public void setId(int id) {
        this.id = id;
    }

    // Méthode pour obtenir la ville de départ du trajet
    public String getStDepart() {
        return stDepart;
    }

    // Méthode pour définir la ville de départ du trajet
    public void setStDepart(String stDepart) {
        this.stDepart = stDepart;
    }

    // Méthode pour obtenir la ville d'arrivée du trajet
    public String getStArrivee() {
        return stArrivee;
    }

    // Méthode pour définir la ville d'arrivée du trajet
    public void setStArrivee(String stArrivee) {
        this.stArrivee = stArrivee;
    }

    // Méthode pour obtenir l'heure de départ du trajet
    public String getHeureDepart() {
        return heureDepart;
    }

    // Méthode pour définir l'heure de départ du trajet
    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    // Méthode pour obtenir l'heure de départ du trajet
    public String getHeureArrivee() {
        return heureArrivee;
    }

    // Méthode pour définir l'heure d'arrivée du trajet
    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    // Méthode pour obtenir le tarif du trajet
    public int getTarif() {
        return tarif;
    }

    // Méthode pour définir le tarif du trajet
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    // Méthode toString pour afficher les informations du trajet
    @Override
    public String toString() {
        return "Trajet [id=" + id + ", stDepart=" + stDepart + ", stArrivee=" + stArrivee + ", heureDepart="
                + heureDepart + ", heureArrivee=" + heureArrivee + ", tarif=" + tarif + "]";
    }

}
