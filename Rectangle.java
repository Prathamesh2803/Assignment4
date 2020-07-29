package com.shape;

public class Rectangle implements Polygon {
       float length;
       float breadth;
       
       public void Rectangle(float a,float b) {
    	   this.length=a;
    	   this.breadth=b;
    	  
       }
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	@Override
	public void calcArea(float side) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calcPeri(float a, float b) {
		// TODO Auto-generated method stub
		 System.out.println("Area of Rectangle:"+2*(a+b));
	}
       
}
