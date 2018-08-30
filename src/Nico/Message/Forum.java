package Nico.Message;
import Nico.Message.MessageUtilisateur;
import Nico.Message.Message;
import Nico.Message.Forum;
import Nico.Utilisateur.Utilisateur;

import java.util.ArrayList;

public class Forum{
    private static int  NBR_MESSAGES = 10;

    private int nbrMessagesPostes = 0;
    private MessageUtilisateur messages[] = new MessageUtilisateur[NBR_MESSAGES];

    public Forum( ) {



    }


    public static int getNbrMessages() {
        return NBR_MESSAGES;
    }

    public static void setNbrMessages(int nbrMessages) {
        NBR_MESSAGES = nbrMessages;
    }

    public int getNbrMessagesPostes() {
        return nbrMessagesPostes;
    }

    public void setNbrMessagesPostes(int nbrMessagesPostes) {
        this.nbrMessagesPostes = nbrMessagesPostes;
    }

    public  MessageUtilisateur[] getMessages() {
        return messages;
    }

    public void setMessages(MessageUtilisateur[] messages) {
        this.messages = messages;
    }

    public boolean ajouterUtilisateurMessages (Utilisateur utilisateur, Message message){
        if (nbrMessagesPostes < NBR_MESSAGES){
        messages[nbrMessagesPostes] = new MessageUtilisateur(utilisateur, message);
        nbrMessagesPostes ++;
        return true;}
        return false;

    }
    public String getListeMessagesAuteur(){
        String chaineToReturn = "";
        for ( int i = 0; i<nbrMessagesPostes ; i++){
            chaineToReturn = chaineToReturn.concat("Titre : " +messages[i].getMessage().getTitre()+" -- Texte : " + messages[i].getMessage().getTexte() +
                    " Auteur : " + messages[i].getMessage().getAuteur()+ "\n");

        }
        return chaineToReturn;
    }

}

