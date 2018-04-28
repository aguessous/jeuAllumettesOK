import java.util.Random;

public class IA extends Player{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7620251140696995619L;

	
	public IA(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}


	@Override
	public byte JouerTour(int max, int nbAllumettes) {
		Random rn = new Random();
		byte temp;
		if (nbAllumettes == 2) temp = 1;
		else if (nbAllumettes == 3) temp = 2;
		else if (nbAllumettes == 4) temp = 3;
		else if (nbAllumettes == 6) temp = 1;
		else if (nbAllumettes == 7) temp = 2;
		else if (nbAllumettes == 8) temp = 3;
		else if (nbAllumettes == 10) temp = 1;
		else if (nbAllumettes == 11) temp = 2;
		else if (nbAllumettes == 12) temp = 3;
		else if (nbAllumettes == 14) temp = 1;
		else if (nbAllumettes == 15) temp = 2;
		else temp = (byte) (1 + rn.nextInt ((max-1)+1));
		return temp;
		// TODO Auto-generated method stub
		
	}


	@Override
	public void JouerTour() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public byte JouerTour(int max) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void AjouterVictoire() {
		// TODO Auto-generated method stub
		
	}

}