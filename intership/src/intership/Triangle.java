package intership;

public class Triangle implements Forme{
	private double hauteur;
	private double base;
	
	//Constructor
	public Triangle(double hauteur, double base) {
		super();
		this.hauteur = hauteur;
		this.base = base;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return (this.base*this.hauteur)/2;
	}
	
	
	

}
