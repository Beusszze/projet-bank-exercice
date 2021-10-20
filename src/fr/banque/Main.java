package fr.banque;

public class Main {

	public static void main(String[] args) {
		
		
		Compte [] comptes = new Compte [5];
		
		
		
		Client client1 = new Client ();
		client1.setAge(18);
		client1.setNom("Johnson");
		client1.setPrenom("Bob");
		client1.setNumeroClient(175555);
		client1.setTableauCompte(comptes);
		CompteASeuilRemunere livretA = new CompteASeuilRemunere(225225, 3500.00, 0.05, 500.00);
		client1.ajouterUnCompte(livretA);
		System.out.println(livretA);
		livretA.verserInterets();
		System.out.println(livretA);
		System.out.println(client1);
		
		try {
			livretA.retirer (400.00);
			
		} catch (BanqueException e){
			System.out.println("Impossible d'atteindre un solde inférieur au seuil.");
		}
		
		
		
		}
	
}
