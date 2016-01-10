public class Carte {

	private static String[] tabCouleur = new String [] {"Coeur", "Carreau", "Tréfle", "Pique"};
	private static String[] tabValeur = new String[] {"AS","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private int couleur;
	private int valeur;
	
	public Carte (int couleur, int valeur)
	{
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public int getCouleur() {return couleur;}
	
	public int getValeur() {return valeur;}
	
	public boolean plusGrandQue(Carte maCarte)
	{
		if (this.valeur > maCarte.valeur)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String ToString()
	{
		return tabValeur[this.valeur] + " De " + tabCouleur[this.couleur];
	}
}
