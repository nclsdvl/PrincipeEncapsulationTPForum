package Nico.Message;

import Nico.Utilisateur.Utilisateur;

import java.util.Date;

public class Message {
    String titre;
    String texte;
    Date dateCreation;
    Utilisateur utilisateur;

    public Message(String titre, String texte, Utilisateur utilisateur) {
        this.titre = titre;
        this.texte = texte;
        dateCreation = new Date();
        this.utilisateur = utilisateur;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    @Override
    public String toString(){
        return titre + "--" + texte + "\nDate de création : " + getDateCreation() + "\n" + utilisateur;
    }
}
