package Nico.Message;

import Nico.Utilisateur.Utilisateur;

import java.text.DateFormat;
import java.util.Date;

public class Message {

    //-----------Variables----------------------------------------------------

    String titre;
    String texte;
    Date dateCreation;
    Utilisateur utilisateur;

    //-----------------constructeur--------------------------------------------------------------------------------

    public Message(String titre, String texte, Utilisateur utilisateur) {
        this.titre = titre;
        this.texte = texte;
        dateCreation = new Date();
        this.utilisateur = utilisateur;

        //ajouterUtilisateurMessages()
    }

    //----------------setters - geters----------------------------

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

    public String getDateCreation() {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        return df.format(dateCreation);
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }


    //---------------------Methode----------------------------

    @Override
    public String toString(){
        return titre + "--" + texte + "\nDate de création : " + getDateCreation() + "\n" + utilisateur;
    }
    public String getAuteur(){
        return utilisateur.getPrenom()+" "+ utilisateur.getNom()+","+ utilisateur.getStatut();
    }
}
