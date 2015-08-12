package org.dimigo.inheritance;

public class Circle extends Figure{
	
	private int radius;
	
	public Circle(int radius){
		super(0,0);
		this.radius = radius;
	}	
	
	public Circle(int centerX, int centerY, int radius){
		this(radius);
	}
	
	protected double calcArea(){
		
		return Math.PI * (this.radius) * (this.radius);
	}
	
}
