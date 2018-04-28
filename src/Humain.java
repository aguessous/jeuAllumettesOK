import java.util.Scanner;
public class Humain extends Player {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3833678821114114409L;
	private static Scanner clavier = new Scanner(System.in);
	

	public Humain(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	
	public byte JouerTour(int max) {
		
		byte choix = 0;
		try {
		choix = clavier.nextByte();
		while(choix<1 || choix>max) {
		if(max==1) System.out.println("Erreur : Vous devez prendre 1 allumette"); 
		else System.out.println("Erreur : Vous devez prendre entre 1 et "+max+" allumettes");
		System.out.println("Joueur #"+GetNom()+" : Combien d’allumettes prenez-vous?");
		choix = clavier.nextByte();
		
		}
		
		}
		catch (Exception e) {
			System.out.println("Erreur : merci de saisir un nombre");
			clavier.next();
			System.out.println("Joueur #"+GetNom()+" : Combien d’allumettes prenez-vous?");
			JouerTour(max);
			}
		return choix;
	}

	
	
	@Override
	public void JouerTour() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public byte JouerTour(int max, int nbAllumettes) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void AjouterVictoire() {
		// TODO Auto-generated method stub
		
	}


	

}