package com.example.dao;

import java.sql.*;

import com.example.model.Trajet;

public class TrajetUtil {
    // Déclaration de la connexion à la base de données
    Connection con;

    // Constructeur qui établit la connexion à la base de données MySQL
    public TrajetUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    // Méthode pour ajouter un trajet à la base de données
    public boolean ajouterTrajet(Trajet t) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour l'ajout d'un trajet
        String query = "INSERT INTO Trajets (stDepart, stArrivee, heureDepart, heureArrivee, tarif) VALUES ('"
                + t.getStDepart() + "','" + t.getStArrivee() + "','" + t.getHeureDepart() + "','" + t.getHeureArrivee()
                + "','" + t.getTarif() + "');";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode pour supprimer un trajet de la base de données par son ID
    public boolean supprimerTrajet(int id) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour la suppression d'un trajet par ID
        String query = "DELETE FROM Trajets WHERE id = " + id + ";";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode pour modifier la station de départ d'un trajet par son ID
    public boolean modifierStDepart(int id, String d) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour la modification de la station de départ
        String query = "UPDATE Trajets SET stDepart = '" + d + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode pour modifier la station d'arrivée d'un trajet par son ID
    public boolean modifierStArrivee(int id, String a) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour la modification de la station d'arrivée
        String query = "UPDATE Trajets SET stArrivee = '" + a + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode pour modifier l'heure de départ d'un trajet par son ID
    public boolean modifierHeureDepart(int id, String h) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour la modification de l'heure de départ
        String query = "UPDATE Trajets SET heureDepart = '" + h + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode pour modifier l'heure d'arrivée d'un trajet par son ID
    public boolean modifierHeureArrivee(int id, String h) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour la modification de l'heure d'arrivée
        String query = "UPDATE Trajets SET heureArrivee = '" + h + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode pour modifier le tarif d'un trajet par son ID
    public boolean modifierTarif(int id, String t) throws SQLException {
        Statement st = con.createStatement();

        // Construction de la requête SQL pour la modification du tarif
        String query = "UPDATE Trajets SET tarif = '" + t + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    // Méthode main pour tester la suppression d'un trajet (à des fins de démonstration)
    public static void main(String[] args) throws SQLException {
        TrajetUtil tu = new TrajetUtil();
        tu.supprimerTrajet(1);
    }
}
