package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil{
	
	// Attributs 
	private double seuil;  // Montant en dessous duquel le solde ne peut pas descendre
	
	
	// Constructeurs
	
	public CompteASeuil() {
		super();
	}


	public CompteASeuil(int numeroCompte, double solde, double unSeuil) {
		super(numeroCompte, solde);
		this.seuil = unSeuil;
	}
	
	
	// Méthodes 
	
	public void retirer (double uneValeur) {
		if ((getSolde() - uneValeur) > getSeuil ()) {
			setSolde(getSolde() - uneValeur);
			
		} else {
			System.out.println("Impossible de retirer au delà de la limite seuil fixée à " + getSeuil() + ".");
		}
		
	}



	
	// Getters et setters 
	
	
	public double getSeuil() {
		return seuil;
	}


	public void setSeuil(double unSeuil) {
		this.seuil = unSeuil;
	}
	
	

	
}
