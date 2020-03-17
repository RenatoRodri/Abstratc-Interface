package model.entities;

public class Retangle extends AbstratcShape {

	private Double Height;
	private Double Whidth;
	
	
	
	public Retangle(model.enums.Color color, Double height, Double whidth) {
		super(color);
		Height = height;
		Whidth = whidth;
	}

	public Double getHeight() {
		return Height;
	}

	public void setHeight(Double height) {
		Height = height;
	}

	public Double getWhidth() {
		return Whidth;
	}

	public void setWhidth(Double whidth) {
		Whidth = whidth;
	}

	public double area() {
		return Height * Whidth;
	}
	
}
