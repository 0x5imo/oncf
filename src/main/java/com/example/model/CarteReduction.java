// Définition du package où se trouve la classe CarteReduction
package com.example.model;

// Déclaration de la classe CarteReduction
public class CarteReduction {
    // Déclaration des variables membres de la classe
    private int id;
    private String type;
    private int tauxReduction;

    // Constructeur de la classe, initialisant les attributs type
    // et tauxReduction lors de la création d'une instance

    public CarteReduction(String type, int tauxReduction) {
        this.type = type;
        this.tauxReduction = tauxReduction;
    }

    // Méthode pour récupérer la valeur de l'attribut id
    public int getId() {
        return id;
    }

    // Méthode pour définir la valeur de l'attribut id
    public void setId(int id) {
        this.id = id;
    }

    // Méthode pour récupérer la valeur de l'attribut type
    public String getType() {
        return type;
    }

    // Méthode pour définir la valeur de l'attribut type
    public void setType(String type) {
        this.type = type;
    }

    // Méthode pour récupérer la valeur de l'attribut tauxReduction
    public int getTauxReduction() {
        return tauxReduction;
    }

    // Méthode pour définir la valeur de l'attribut tauxReduction
    public void setTauxReduction(int tauxReduction) {
        this.tauxReduction = tauxReduction;
    }

    // Méthode toString générée pour afficher les informations de l'objet sous forme
    // de chaîne de caractères
    @Override
    public String toString() {
        return "CarteReduction [id=" + id + ", type=" + type + ", tauxReduction=" + tauxReduction + "]";
    }

}
