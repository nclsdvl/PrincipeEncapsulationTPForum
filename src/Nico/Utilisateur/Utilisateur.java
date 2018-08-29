package Nico.Utilisateur;

import Nico.CategorieUtilisateur.CategorieUtilisateur;

public class Utilisateur {
    String nom;
    String prenom;
    CategorieUtilisateur statut;

    public Utilisateur(String nom, String prenom, CategorieUtilisateur statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CategorieUtilisateur getStatut() {
        return statut;
    }

    public void setStatut(CategorieUtilisateur statut) {
        this.statut = statut;
    }

    @Override
    public String toString(){
        return "Utilisateur: " + prenom + " " + nom + " " + statut;
    }
}
