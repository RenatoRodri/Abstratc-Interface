package model.entities;

import model.enums.Color;

public abstract class AbstratcShape implements Shape {

	private Color color;

	public AbstratcShape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	
	
}
