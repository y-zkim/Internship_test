package intership;

public class Cercle implements Forme {
	static final double Pi=3.14;
	private double rayon;
	
	//Constructor
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return this.rayon*this.rayon*Pi;
	}

	
	

}
