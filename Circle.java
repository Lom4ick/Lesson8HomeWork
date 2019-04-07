package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle(String color , double radius){
        super (color);
        if (radius <= 0)
            System.out.println("Set the valid radius");
        else
            this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString(){
        return String.format("S = ", super.toString(), calcArea());
    }

}
