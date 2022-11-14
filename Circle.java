package com.demo;

public class Circle {

	 public double radius=3;
	 public double area;
	 public double circumference;
	 
   //constructor
	public Circle() {
		System.out.println("Constructor invoked...");
	}

	public Circle(double radius) {
		
		this.radius = radius;
	}
    
	//getter setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		area=3.14 * radius * radius;
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getCircumference() {
		circumference=2 * 3.14 *radius;
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", circumference=" + circumference + "]";
	}
	 
	 
}
