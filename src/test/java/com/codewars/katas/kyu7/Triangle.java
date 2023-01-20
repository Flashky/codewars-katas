package com.codewars.katas.kyu7;

public class Triangle {
	  public int height = 1;
	  public int base = 1;
	  private double area;
	  
	  public Triangle(int height, int base) {
		  this.height = height;
		  this.base = base;
	  }
	  
	  public void setArea(double a) {
	    area = a;
	  }
	  public double getArea() {
	    return area;
	  }
	}