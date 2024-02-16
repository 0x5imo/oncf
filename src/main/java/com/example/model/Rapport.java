// Déclaration du package pour organiser les classes
package com.example.model;

// Définition de la classe Rapport
public class Rapport {
    private String periode; // Période pour laquelle le rapport est généré
    private int ventes; // Nombre de ventes pour la période
    private int revenu; // Revenu généré pour la période

    // Constructeur de la classe Rapport
    public Rapport(String periode, int ventes, int revenu) {
        this.periode = periode;
        this.ventes = ventes;
        this.revenu = revenu;
    }

    // Méthode pour obtenir la période du rapport
    public String getPeriode() {
        return periode;
    }

    // Méthode pour définir la période du rapport
    public void setPeriode(String periode) {
        this.periode = periode;
    }

    // Méthode pour obtenir le nombre de ventes
    public int getVentes() {
        return ventes;
    }

    // Méthode pour définir le nombre de ventes
    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    // Méthode pour obtenir le revenu
    public int getRevenu() {
        return revenu;
    }

    // Méthode pour définir le revenu
    public void setRevenu(int revenu) {
        this.revenu = revenu;
    }

    // Méthode pour afficher les détails du rapport
    @Override
    public String toString() {
        return "Rapport [periode=" + periode + ", ventes=" + ventes + ", revenu=" + revenu + "]";
    }

}
