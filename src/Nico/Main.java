package Nico;
import Nico.CategorieUtilisateur.CategorieUtilisateur;
import Nico.Utilisateur.Utilisateur;
import Nico.utils.utilitaire;

public class Main {

    public static void main(String[] args) {
	Utilisateur jean = new Utilisateur("Dupont","Jean", CategorieUtilisateur.STANDARD);
	Utilisateur bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateur.STANDARD);
	Utilisateur nathalie = new Utilisateur("Morin", "Nathalie", CategorieUtilisateur.MODERATEUR);
    }
}
