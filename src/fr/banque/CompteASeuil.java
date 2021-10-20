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
	
	public void retirer (double uneValeur) throws BanqueException {
		if	((getSolde() - uneValeur) < getSeuil ()) { 
			throw new BanqueException("Somme retirée trop importante, dépassement du seuil impossible.");
			
		}
			else {
				setSolde(getSolde() - uneValeur);
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
