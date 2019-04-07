package com.company;

import java.util.Comparator;

public class CompareShapesByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        String color1 = ((Shape)o1).getColor();
        String color2 = ((Shape)o2).getColor();
        return color1.compareTo(color2);
    }
}
