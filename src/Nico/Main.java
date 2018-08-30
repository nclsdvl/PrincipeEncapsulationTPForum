package Nico;
import Nico.CategorieUtilisateur.CategorieUtilisateur;
import Nico.Message.MessageUtilisateur;
import Nico.Message.Message;
import Nico.Utilisateur.Utilisateur;
import Nico.utils.utilitaire;
import Nico.Message.Forum;
import static Nico.utils.utilitaire.afficherBoiteDeDialogue;


public class Main {

    public static void main(String[] args) {
	Utilisateur jean = new Utilisateur("Dupont","Jean", CategorieUtilisateur.STANDARD);
	Utilisateur bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateur.STANDARD);
	Utilisateur nathalie = new Utilisateur("Morin", "Nathalie", CategorieUtilisateur.MODERATEUR);

    afficherBoiteDeDialogue("Utilisateur : " + jean.getPrenom() +" "+jean.getNom()+", "+ jean.getStatut()+ "\n"+
                                     "Utilisateur : " + bernard.getPrenom() +" "+bernard.getNom()+", "+ bernard.getStatut()+ "\n"+
                                     "Utilisateur : " + nathalie.getPrenom() +" "+nathalie.getNom()+", "+ nathalie.getStatut()+ "\n" ,
                                jean.getPrenom() +" , "+bernard.getPrenom() +" , "+ nathalie.getPrenom());

        Message message1 = new Message("Java SE", "L'encapsulation est une propriété fondamentale", jean);
        Message message2 = new Message("Java SE", "blablalblalalallalalaaalal", bernard);
         message2 = new Message("dfhdfh", "grgrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", nathalie);

        afficherBoiteDeDialogue(message1.toString(),"message 1");



        afficherBoiteDeDialogue(Message.getForum().getListeMessagesAuteur(),"messages");


    }

}
