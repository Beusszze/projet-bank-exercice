package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere{
	
	// Attributs
	private double taux;
	
	// Constructeurs
	public CompteRemunere() {
		super();
	}


	public CompteRemunere(int numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.taux = taux;
	}


	
	
	// Méthodes
	
	/**
	 * Méthode permettant de calculer l'intérêt avec le taux définit 
	 *
	 * @return l'intérêt 
	 */
	
	
	public double calculerInterets () {
		return (this.getSolde() * this.getTaux());
		
	}
	
	
	
	/**
	 *  Méthode permettant de verser l'intérêt sur le compte
	 *  Ajoute au solde existant l'intérêt généré 
	 */
	
	public void verserInterets () {
		this.setSolde(getSolde() + calculerInterets());
	}
	
	
	
	
	
	// Getters et setters
	public double getTaux() {
		return taux;
	}


	public void setTaux(double taux) {
		this.taux = taux;
	}


	
	
	
	
	
	// toString ()
	
	@Override
	public String toString() {
		return "CompteRemunere [taux=" + getTaux() + ", getNumeroCompte()=" + getNumeroCompte() + ", getSolde()="
				+ getSolde() + "]";
	}
	
	
	

}
