package com.example.dao;

import java.sql.*;
import java.util.LinkedList;

import com.example.model.Voyageur;

public class VoyageurUtil {
    // Déclaration de la connexion à la base de données
    Connection con;

    // Constructeur qui établit la connexion à la base de données MySQL
    public VoyageurUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    // Méthode pour rechercher un voyageur par son ID
    public LinkedList<Voyageur> rechercherParID(int id) throws SQLException {
        LinkedList<Voyageur> voyageurs = new LinkedList<>();
        Statement st = con.createStatement();

        // Construction de la requête SQL pour rechercher un voyageur par ID
        String query = "SELECT * FROM voyageurs WHERE id = " + id + "";
        ResultSet rs = st.executeQuery(query);

        // Parcours du résultat de la requête et création d'objets Voyageur
        while (rs.next()) {
            Voyageur v = new Voyageur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),
                    rs.getString("email"), rs.getInt("carteReductionId"));
            voyageurs.add(v);
        }
        return voyageurs;
    }

    // Méthode pour afficher tous les voyageurs
    public LinkedList<Voyageur> showAll() throws SQLException {
        LinkedList<Voyageur> voyageurs = new LinkedList<>();
        Statement st = con.createStatement();

        // Construction de la requête SQL pour afficher tous les voyageurs
        String query = "select * from voyageurs";
        ResultSet rs = st.executeQuery(query);

        // Parcours du résultat de la requête et création d'objets Voyageur
        while (rs.next()) {
            Voyageur v = new Voyageur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),
                    rs.getString("email"), rs.getInt("carteReductionId"));
            voyageurs.add(v);
        }
        return voyageurs;
    }
}
