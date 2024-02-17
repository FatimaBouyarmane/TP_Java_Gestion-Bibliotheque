import java.util.ArrayList;

// la classe Bibliotheque herite de la classe Livre
public class Bibliotheque extends Livre {
	
    private ArrayList<Livre> listeLivres;

    public Bibliotheque() {
        super("", "", 0); // Appel de constructeur de la classe Livre avec des valeurs par d�faut
        listeLivres = new ArrayList<>(); 
    }

    public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
    }
    
    // M�thode pour rechercher un livre par auteur
    public void rechercherLivreParAuteur(String nomAuteur) {
        boolean trouv� = false;
        for (Livre livre : listeLivres) {
            if (livre.getAuteur().equalsIgnoreCase(nomAuteur)) {
                livre.AfficheDetails();
                trouv� = true;
            }
        }
        if (!trouv�) {
            System.out.println("Aucun livre trouv� pour l'auteur " + nomAuteur);
        }
    }

    public void afficherLivres() {
        for (Livre livre : listeLivres) {
            livre.AfficheDetails();
            System.out.println();
        }
    }
    
    
 // Gestion basique des erreurs � l'aide des exceptions
    public void gestionErreur(Livre livre) {
        try {
            if (livre.getTitre().isEmpty() || livre.getAuteur().isEmpty() || livre.getAnneePublication() <= 0) {
                System.out.println("Informations de livre invalides");
            }
            ajouterLivre(livre); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : Les informations du livre sont invalides.");
        }
    }

    
}
