package Nico.Message;

import Nico.Utilisateur.Utilisateur;

public class MessageUtilisateur {
    Utilisateur utilisateur;
    Message message;

    public MessageUtilisateur(Utilisateur utilisateur, Message message) {
        this.utilisateur = utilisateur;
        this.message = message;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Message getMessage() {
        return message;
    }
}
