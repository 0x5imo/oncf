// Déclaration du package pour organiser les classes
package com.example.model;

// Classe représentant un voyageur
public class Voyageur {
    private int id; // Identifiant du voyageur
    private String nom; // Nom du voyageur
    private String prenom; // Prénom du voyageur
    private String email; // Adresse email du voyageur
    private int idReduction; // Identifiant de la réduction du voyageur

    // Constructeur de la classe Voyageur
    public Voyageur(int id, String nom, String prenom, String email, int idReduction) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.idReduction = idReduction;
    }

    // Méthode pour récupérer l'identifiant du voyageur
    public int getId() {
        return id;
    }

    // Méthode pour définir l'identifiant du voyageur
    public void setId(int id) {
        this.id = id;
    }

    // Méthode pour récupérer le nom du voyageur
    public String getNom() {
        return nom;
    }

    // Méthode pour définir le nom du voyageur
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour récupérer le prénom du voyageur
    public String getPrenom() {
        return prenom;
    }

    // Méthode pour définir le prénom du voyageur
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode pour récupérer l'adresse email du voyageur
    public String getEmail() {
        return email;
    }

    // Méthode pour définir l'adresse email du voyageur
    public void setEmail(String email) {
        this.email = email;
    }

    // Méthode pour récupérer l'identifiant de la réduction du voyageur
    public int getIdReduction() {
        return idReduction;
    }

    // Méthode pour définir l'identifiant de la réduction du voyageur
    public void setIdReduction(int idReduction) {
        this.idReduction = idReduction;
    }

    // Méthode pour obtenir une représentation textuelle de l'objet Voyageur
    @Override
    public String toString() {
        return "Voyageur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", carteReduction="
                + idReduction + "]";
    }

}
