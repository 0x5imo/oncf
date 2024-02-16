package com.example.dao;

import java.sql.*;

import com.example.model.CarteReduction;

public class CarteReductionUtil {
    Connection con;

    // Constructeur qui établit la connexion à la base de données
    public CarteReductionUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    // Méthode pour ajouter une nouvelle carte de réduction dans la base de données
    public boolean ajouterCarteReduction(CarteReduction c) throws SQLException {
        Statement st = con.createStatement();
        // Requête SQL pour insérer une nouvelle carte de réduction
        String query = "INSERT INTO CartesReduction (type, tauxReduction) VALUES ('"+c.getType()+"','"+c.getTauxReduction()+"');";
        int rs = st.executeUpdate(query);
        // Retourne vrai si l'opération d'insertion a réussi, sinon faux
        return rs>0;
    }

    // Méthode pour modifier le taux de réduction d'une carte existante
    public boolean modifierTauxReduction(String type,int tx) throws SQLException {
        Statement st = con.createStatement();
        // Requête SQL pour mettre à jour le taux de réduction d'une carte
        String query = "UPDATE Cartesreduction SET tauxReduction = '" + tx + "' WHERE type = '" + type + "';";
        int rs = st.executeUpdate(query);
        // Retourne vrai si l'opération de mise à jour a réussi, sinon faux
        return rs>0;
    }

    // Méthode pour supprimer une carte de réduction de la base de données
    public boolean supprimerCarteReduction(int id) throws SQLException {
        Statement st = con.createStatement();
        // Requête SQL pour supprimer une carte de réduction par son identifiant
        String query = "DELETE FROM CartesReduction WHERE id ="+id+";";
        int rs = st.executeUpdate(query);
        // Retourne vrai si l'opération de suppression a réussi, sinon faux
        return rs>0;
    }

    // Méthode pour associer une carte de réduction à un voyageur dans la base de données
    public boolean associerCarteReduction(int idV,int idC) throws SQLException {
        Statement st = con.createStatement();
        // Requête SQL pour mettre à jour l'identifiant de la carte de réduction associée à un voyageur
        String query = "UPDATE Voyageurs SET carteReductionId = "+idC+"WHERE id ="+idV+";";
        int rs = st.executeUpdate(query);
        // Retourne vrai si l'opération d'association a réussi, sinon faux
        return rs>0;
    }
}
