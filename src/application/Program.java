package application;
import java.util.Locale;

import model.entities.AbstratcShape;
import model.entities.Circle;
import model.entities.Retangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AbstratcShape s1 = new Circle(Color.BLACK, 4.0);
		AbstratcShape s2 = new Retangle(Color.WHITE, 3.0, 2.0);
		
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle Area: "+ String.format("%.3f", s1.area()));
		
		System.out.println("Retangle Color: " + s2.getColor());
		System.out.println("Retangle Area: " + String.format("%.3f", s2.area()));
		
		
		
	
	}

}
