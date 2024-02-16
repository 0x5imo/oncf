package com.example.dao;

import java.sql.*;
import java.util.LinkedList;

import com.example.model.Trajet;

public class RapportUtil {
    // Déclaration de la connexion à la base de données
    Connection con;

    // Constructeur qui établit la connexion à la base de données MySQL
    public RapportUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    // Méthode pour rechercher un trajet par son ID
    public LinkedList<Trajet> rechercherParID(int id) throws SQLException {
        LinkedList<Trajet> trajets = new LinkedList<>();
        Statement st = con.createStatement();
        
        // Construction de la requête SQL pour rechercher un trajet par ID
        String query = "SELECT * FROM trajets WHERE id = " + id + "";
        ResultSet rs = st.executeQuery(query);

        // Parcours du résultat de la requête et création d'objets Trajet
        while (rs.next()) {
            Trajet t = new Trajet(rs.getString("stDepart"), rs.getString("stArrivee"), rs.getString("heureDepart"),
                    rs.getString("heureArrivee"), rs.getInt("tarif"));
            trajets.add(t);
        }
        return trajets;
    }

    // Méthode pour afficher tous les trajets disponibles
    public LinkedList<Trajet> showAll() throws SQLException {
        LinkedList<Trajet> trajets = new LinkedList<>();
        Statement st = con.createStatement();

        // Construction de la requête SQL pour afficher tous les trajets
        String query = "select * from trajets";
        ResultSet rs = st.executeQuery(query);

        // Parcours du résultat de la requête et création d'objets Trajet
        while (rs.next()) {
            Trajet t = new Trajet(rs.getString("stDepart"), rs.getString("stArrivee"), rs.getString("heureDepart"),
                    rs.getString("heureArrivee"), rs.getInt("tarif"));
            trajets.add(t);
        }
        return trajets;
    }
}
