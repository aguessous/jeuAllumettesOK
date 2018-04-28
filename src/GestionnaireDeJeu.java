public class GestionnaireDeJeu implements Iplayer{

	protected int nbAllumettes=16;

	
	@Override
	public String GetNom() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public type GetType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GetNbVictoires() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void AjouterVictoire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void JouerTour() {
		// TODO Auto-generated method stub
		
	}

	public String JouerPartie(Humain joueur1,IA joueur2) {	
		
		String winner = null;
		System.out.println("Jeu des allumettes");
		boolean finPartie = false;
		while(!finPartie) {
		System.out.println("Il reste "+nbAllumettes+" allumettes");
		System.out.println("["+joueur1.GetNom()+"]"+"["+joueur1.GetType()+"] : Combien d’allumettes prenez-vous?");
		nbAllumettes -=joueur1.JouerTour(choixMax());
		if(nbAllumettes==0) {winner=joueur2.GetNom();}
		if(nbAllumettes>0) {
		System.out.println("Il reste "+nbAllumettes+" allumettes");
		System.out.println("["+joueur2.GetNom()+"]"+"["+joueur2.GetType()+"] : Combien d’allumettes prenez-vous?");
		int nb = nbAllumettes;
		nbAllumettes -=joueur2.JouerTour(choixMax(),nbAllumettes);
		if(nbAllumettes==0) {winner=joueur1.GetNom();}
		System.out.println(nb-nbAllumettes);}
		if(nbAllumettes==0) {finPartie=true;}
		}
		return winner;
		
	}
//	protected String changerJoueur(String joueur) {
//		if (joueur =="joueur1") joueur = "joueur2";
//		else joueur ="joueur1";
//		return joueur;
//	}
	
	protected int choixMax () {
		int max = 0;
		if (nbAllumettes>=3) max = 3;
		else if (nbAllumettes==2) max = 2;
		else if (nbAllumettes==1) max = 1;
		return max;	
	}

	protected void afficherGagnant(Humain joueur1, IA joueur2, String winner) {
		
		if (winner == joueur1.GetNom()) System.out.println("Le gagnant : ["+winner+"]["+joueur1.GetType()+"]");
		else System.out.println("Le gagnant : ["+winner+"]["+joueur2.GetType()+"]");
		
	}

	public void afficherScore(Humain joueur1, IA joueur2) {
		System.out.println("Score total :");
		System.out.println("["+joueur1.GetNom()+"]"+"["+joueur1.GetType()+"] => ["+joueur1.GetNbVictoires()+"]");
		System.out.println("["+joueur2.GetNom()+"]"+"["+joueur2.GetType()+"] => ["+joueur2.GetNbVictoires()+"]");
		
	}

	public void AjouterVictoire(Humain joueur1, IA joueur2, String winner) {
		if (joueur1.GetNom() == winner) joueur1.AjouterVictoire(1);
		else joueur2.AjouterVictoire(1);
	}
	
	

	
}