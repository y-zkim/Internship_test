package intership;

public class Rectangle implements Forme{
	private double longeur;
	private double largeur;
	
	//Constructor
	public Rectangle(double longeur, double largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return this.largeur*this.longeur;
	}
	
	
	
	

}
