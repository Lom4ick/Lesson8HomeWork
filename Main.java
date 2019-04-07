package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] figures = createFigures();

        System.out.println("Your compared figures: ");

        compareShapesByArea(figures);
        compareShapesByColor(figures);

        System.out.printf("\nGlobal S: %.2f", calcGlobalS(figures));
        double[] fig = calcSofEveryFigure(figures);
        System.out.printf("\nRectangle S: %.2f, circle S: %.2f, triangle S: %.2f",
                fig[0], fig[1], fig[2]);



    }
    private static Shape[] createFigures(){
        return new Shape[]{
                                 new Rectangle("yellow", 14 , 25),
                                 new Rectangle("red",30 , 18),
                                 new Rectangle("green", 16 , 27),
                                 new Rectangle("blue", 19 , 31),
                new Circle("black" , 8),
                new Circle("red" , 15),
                new Circle("white" , 25),
                        new Triangle("gray", 5,6,7),
                        new Triangle("yellow", 8,9,10)};
    }

    private static double[] calcSofEveryFigure(Shape[] figures) {

        double[] sumFigures = new double[3];
        double sumRect = 0; double sumCircle = 0; double sumTriangle = 0;

        for(Shape fig : figures) {
            if (fig != null) {
                if (fig instanceof Rectangle) sumRect += fig.calcArea();
                else if (fig instanceof Circle) sumCircle += fig.calcArea();
                else sumTriangle += fig.calcArea();
            }
        }

        sumFigures[0] = sumRect; sumFigures[1] = sumCircle; sumFigures[2] = sumTriangle;

        return sumFigures;
    }

    private static double calcGlobalS (Shape[] figures){
        double globalSum = 0;
        for (Shape fig: figures) {
            if (fig != null)
                globalSum += fig.calcArea();
        }
        return globalSum;
    }

    private void printFigures(Shape[] figures) {

            for(Shape fig : figures) {
                fig.draw();
            }
    }

    private static void compareShapesByColor(Shape[] figures) {
        Arrays.sort(figures, new CompareShapesByColor());
    }

    private static void compareShapesByArea(Shape[] figures) {
        Arrays.sort(figures, new CompareShapeByArea());
    }
}
