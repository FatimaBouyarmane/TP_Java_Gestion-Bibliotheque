
public class Livre {
	
    protected String titre;
    protected String auteur;
    protected int anneePublication;
    
    //Constructeur doit avoir meme nom que la classe
	public Livre(String titre, String auteur, int ansPub ) {
		
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = ansPub;
	}
	
	//geters :
	public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }
    
    // methode pour afficher les details de livre
	public void AfficheDetails() {
		
		System.out.println("Le titre du livre est: " + titre + "\nde L'auteur  " + auteur + "\npublié en  " + anneePublication);
		
	}
}

