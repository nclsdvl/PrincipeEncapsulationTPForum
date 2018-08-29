package Nico.Message;
import Nico.Message.MessageUtilisateur;
import Nico.Message.Message;
import Nico.Utilisateur.Utilisateur;

public class Forum{
    private static int  NBR_MESSAGES;

    int nbrMessagesPostes;
    MessageUtilisateur messages[] = new MessageUtilisateur[NBR_MESSAGES];

    public Forum(int nbrMessagesPostes, MessageUtilisateur[] messages) {
        this.nbrMessagesPostes = nbrMessagesPostes;
        this.messages = messages;
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

    public MessageUtilisateur[] getMessages() {
        return messages;
    }

    public void setMessages(MessageUtilisateur[] messages) {
        this.messages = messages;
    }

   /* public boolean ajouterUtilisateurMessages (Utilisateur utilisateur, Message message){
        setMessages("heee", "sdfgsfdg", "fdsgdfg", "dfgdfg", 45,);

    }*/
}

