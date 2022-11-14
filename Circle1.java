package com.demo;

public class Circle1 {

	public double radius=1.0;
	public String color="Red";
	public double area;
	
	
	public Circle1() {
		
	}

	public Circle1(double radius) {
		
		this.radius = radius;
		
	}

	public Circle1(double radius, String color) {
		
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		area=3.14 * radius * radius;
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Circle1 [radius=" + radius + ", color=" + color + "]";
	}

	
}
	
	
	
	
	
