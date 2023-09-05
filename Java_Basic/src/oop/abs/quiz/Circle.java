package oop.abs.quiz;

public class Circle extends Shape{

	private int radius;
	
	Circle(String name, int radius){
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
}
