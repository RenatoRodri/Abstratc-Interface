package model.entities;

import model.enums.Color;

public class Circle extends AbstratcShape {
	
	private Double Radius;

	
	public Circle(Color color, Double radius) {
		super(color);
		Radius = radius;
	}

	public Double getRadius() {
		return Radius;
	}

	public void setRadius(Double radius) {
		Radius = radius;
	}

	public double area() {
		return Radius * Radius;
	}
	

}
