package intership;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forme forme;
		double surface;
		//Triangle
		forme=new Triangle(2,3);
		surface = forme.surface();
		System.out.println(surface);
		//Cercle
		forme=new Cercle(12);
		surface = forme.surface();
		System.out.println(surface);
		//Triangle
		forme=new Rectangle(6,3);
		surface = forme.surface();
		System.out.println(surface);
		
		
	}

}
