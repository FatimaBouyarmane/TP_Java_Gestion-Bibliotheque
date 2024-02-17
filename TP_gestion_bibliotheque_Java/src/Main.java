
public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();
        
        // creation de 3 objets de class Livre
        Livre livre1 = new Livre("aaaaa", "bbbbb", 2000);
        Livre livre2 = new Livre("ccccc", "ddddd", 1997);
        Livre livre3 = new Livre("eeeee", "fffff", 1949);
        
        //Appelons la methode ajouterLivre pour ajouter les livres au tableu listeLivres de class Bibliotheque 
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        bibliotheque.ajouterLivre(livre3);
        
        // Affichage de tous les livres
        System.out.println("Détails de tous les livres dans la bibliothèque:");
        bibliotheque.afficherLivres();
        
        

        bibliotheque.gestionErreur(livre1);
        bibliotheque.gestionErreur(livre2);
        bibliotheque.gestionErreur(livre3);

                

        System.out.println("\nRecherche des livres par l'auteur 'ddddd':");
        bibliotheque.rechercherLivreParAuteur("ddddd");
	
	    System.out.println("\nRecherche des livres par l'auteur 'ggggg':");
	    bibliotheque.rechercherLivreParAuteur("ggggg");
       

    }
}
