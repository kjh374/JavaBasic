package oop.abs.quiz;

public class Circle extends Shape{

	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	
}
