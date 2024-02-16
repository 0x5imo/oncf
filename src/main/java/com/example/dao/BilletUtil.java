package com.example.dao;

import java.sql.*;

import com.example.model.Billet;

public class BilletUtil {
    Connection con;

    // Constructeur qui établit une connexion à la base de données MySQL
    public BilletUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    // Vérifie si un billet avec les mêmes détails de trajet existe déjà dans la base de données
    public boolean existeTicket(String stDp, String stArr, String heureDp, String heureDa) throws SQLException {
        Statement st = con.createStatement();
        String query = "select * from trajets";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            if (rs.getString("stDepart").equals(stDp) && rs.getString("stArrivee").equals(stArr)
                    && rs.getString("heureDepart").equals(heureDp) && rs.getString("heureArrivee").equals(heureDa)) {
                System.out.println("yes");
                return true;
            }
        }
        return false;
    }

    // Récupère un billet correspondant aux détails du trajet fournis
    public Billet getTicket(String stDp, String stArr, String heureDp, String heureDa, int classe) throws SQLException {
        Statement st = con.createStatement();
        String query = "select * from trajets";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            if (rs.getString("stDepart").equals(stDp) && rs.getString("stArrivee").equals(stArr)
                    && rs.getString("heureDepart").equals(heureDp) && rs.getString("heureArrivee").equals(heureDa)) {
                System.out.println("yes");
                // Crée un objet Billet à partir des données récupérées de la base de données
                Billet b = new Billet(rs.getString("stDepart"), rs.getString("stArrivee"), rs.getString("heureDepart"),
                        rs.getString("heureArrivee"), classe, rs.getInt("tarif"));
                return b;
            }
        }
        return null;
    }

    // Ajoute un billet à la base de données
    public boolean addTicket(Billet t) throws SQLException {
        Statement st = con.createStatement();
        // Requête SQL pour l'insertion d'un nouveau billet dans la table Billets
        String query = "INSERT INTO Billets (stDepart, stArrivee, heureDepart, heureArrivee, Classe, prix) VALUES ('"
                + t.getStDepart() + "','" + t.getStArrivee() + "','" + t.getHeureDepart() + "','" + t.getHeureArrivee()
                + "'," + t.getClasse() + "," + t.getPrix() + ");";
        // Exécute la requête et retourne true si l'insertion a réussi
        int rs = st.executeUpdate(query);
        return rs > 0;
    }
}
