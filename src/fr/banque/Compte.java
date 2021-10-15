package fr.banque;

public class Compte {
	private int numero; 
	private double solde;
	
	
	Compte () {		
	}

	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	
	private void ajouter(double unMontant) {
		this.solde += unMontant;
	}
	
	
	private void retirer(double unMontant) {
		this.solde -= unMontant;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

	
	
	
	
}
