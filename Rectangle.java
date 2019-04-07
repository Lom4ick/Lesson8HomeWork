package com.company;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        if (width <= 0)
            System.out.println("Invalid width!");
        else if (height <= 0)
            System.out.println("Invalid height!");
        else
            this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth(double width) {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return String.format("S = ", super.toString(), calcArea());
    }
}