package fr.banque;

import java.util.Arrays;

public class Client {
	
	// Attributs 
	
	private String nom;
	private String prenom;
	private int age; 
	private int numeroClient;
	private  Compte[] tableauComptes;
	
	
	// Constructeurs
	
	public Client () {
		super ();
	}
	
	public Client(String nom, String prenom, int age, int numeroClient) { // Constructeur avec attributs qui ne dépendent que de lui
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numeroClient = numeroClient;

		
	}

	

	public Client(String nom, String prenom, int age, int numeroClient, Compte[] comptes) { // Constructeur avec tous les attributs
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numeroClient = numeroClient;
		this.tableauComptes = comptes;
		
	}

	// Méthodes
	
	
	/** 
	 * Méthode permettant l'ajout d'un compte dans le tableau des comptes
	 * Si le numéro de compte est similaire à un compte existant dans le tableau, la méthode affiche une erreur
	 * Si le numéro de compte ne correspondant pas à un compte existant dans le tableau, ajout de ce compte dans le tableau 
	 * Si le tableau est plein (5 comptes), affichage d'un message d'erreur
	 * @param unCompte, compte à ajouter au tableau
	 */
	
	public void ajouterUnCompte (Compte unCompte) {
		int nbComptes = 0;

		for (int i = 0; i < this.tableauComptes.length; i++) {
			if (this.tableauComptes[i] != null) {
				if (this.tableauComptes[i].getNumeroCompte() == unCompte.getNumeroCompte()) {
					System.out.println("Ce compte existe déjà !");
					break;
				}
				nbComptes +=1;
				continue;				
			} else {
				this.tableauComptes [i] = unCompte;
				System.out.println("Le compte a été ajouté !");
				nbComptes +=1;
				break;
			}
			
		}
		if (nbComptes >= 5) {
			System.out.println("Il n'y a plus de places pour un nouveau compte ! e");
		}
	}
	

/**
 * Méthode permettant de récupérer un compte dans la liste des comptes à partir de son numéro
 * @param numeroCompte : int correspondant au numéro de compte recherché
 * @return compte correspondant à celui testé
 */
	
public Compte getCompteParNumero (int numeroCompte) {
		
		Compte findCompte = new Compte () ;
		for (int i = 0; i < this.tableauComptes.length; i++) {
			if (this.tableauComptes[i].getNumeroCompte() == numeroCompte);
				findCompte = this.tableauComptes[i];
				break;
			} 
		if (findCompte.equals(null)) {
			System.out.println("Le compte n'a pas été trouvé");
	}
		return findCompte;
}	

	
	
	// Getters et setters
	
	
	
		


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}

	public Compte[] getTableauComptes() {
		return tableauComptes;
	}

	public void setTableauCompte(Compte[] tableauComptes) {
		if (tableauComptes.length != 5) {
			System.out.println("Le tableau doit contenir 5 comptes !");
		} else {
		this.tableauComptes = tableauComptes;
	}
}
	
	
	
	// Affichage


	@Override
	public String toString() {
		return "Client [nom=" + getNom() + ", prenom=" + getPrenom() + ", age=" + getAge () + ", numeroClient=" + getNumeroClient ()
				+ ", tableauComptes=" + Arrays.toString(getTableauComptes()) + "]";
	}
	

	

	
	
	
	
	
	
	
	
	
	
	

}
