package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {
	
	
	/**
	 * Classe héritant de la classe CompteRemunere et donc de ses constructeurs
	 * Implémente l'interface ICompteASeuil dont les méthodes sont retirer, getSeuil et setSeuil
	 * Le but est d'avoir une classe permettant à un compte d'à la fois recevoir des intérêts (compte rémunéré) 
	 * Et de définir un seuil au delà duquel l'utilisateur ne pourra pas retirer (interface compte à seuil)
	 */
	
	// Attributs
	
	private double seuil;
	
	// Constructeurs
	
	
	public CompteASeuilRemunere() {
		super();
	}


	public CompteASeuilRemunere(int numeroCompte, double solde, double taux, double unSeuil) {
		super(numeroCompte, solde, taux);
		this.seuil = unSeuil;
	}
	
	

	// Méthodes
	
	
	/**
	 * Méthode qui permet de retirer un montant définit au solde du compte
	 * Vérifie d'abord que le solde permet le retrait en fonction du seuil
	 * Si le solde moins le montant à retirer est au dessus du seuil définit
	 * Retrait effectué, sinon message d'erreur
	 */
	
	
//	public void retirer (double uneValeur) throws BanqueException{
//		if ((getSolde() - uneValeur) > getSeuil ()) {
//			setSolde(getSolde() - uneValeur);
//	
//		}
//			else ((getSolde() - uneValeur) < getSeuil ()) {
//			throw new BanqueException("Somme retirée trop importante, dépassement du seuil impossible.");
//		}
//		
//
//	}
	
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


	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	
	


	@Override
	public String toString() {
		return "CompteASeuilRemunere [seuil=" + getSeuil() + ", getTaux()=" + getTaux() + ", getNumeroCompte()="
				+ getNumeroCompte() + ", getSolde()=" + getSolde() + "]";
	}



	
	
	
	
	
}
