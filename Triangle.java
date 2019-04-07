package com.company;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c){
        super(color);
        if (a < 0 )
            System.out.println("Not valid A");
        else if (b < 0)
            System.out.println("Not valid B");
        else if (c < 0)
            System.out.println("Not valid C");
        else if (a + b <= c || a + c <= c || a + c <= b)
            System.err.println("Not valid triangle sides");

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA(){
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getC(){
        return c;
    }
    @Override
    public double calcArea (){
        double i = (a + b + c) / 2;
        return Math.sqrt(i * (i - a) * (a - b) * (i - c));
    }
    @Override
    public String toString(){
        return String.format("S = ", super.toString(), calcArea());
    }
}
