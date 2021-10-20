package fr.banque;

public class Compte {
	
	//Attributs
	
	private int numeroCompte; 
	private double solde;
	
	
	// Constructeurs
	
	Compte () {	
		super ();
	}

	public Compte(int numeroCompte, double solde) {
		super ();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	
	// Méthodes
	
	/**
	 * Méthode permettant d'ajouter un montant au solde
	 * @param unMontant, montant à ajouter au solde
	 */
	
	public void ajouter(double unMontant) {
		this.setSolde (this.getSolde()+ unMontant);
	}
	
	/**
	 * Méthode permettant de retirer un montant au solde
	 * @param unMontant, montant à retirer au solde
	 */
	
	public void retirer(double unMontant) {
		this.setSolde (this.getSolde()- unMontant);
	}
	

	
	
	// Getters et setters
	
	public int getNumeroCompte() {
		return numeroCompte;
	}


	public double getSolde() {
		return solde;
	}

	public double setSolde(double solde) {
		return this.solde = solde;
	}

	
	// Affichage
	
	@Override
	public String toString() {
		return "Compte [numero=" + getNumeroCompte() + ", solde=" + getSolde() + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return numeroCompte == other.numeroCompte
				&& Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}

	

	
	
	
	
	
	
	
}
