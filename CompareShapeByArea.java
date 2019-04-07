package com.company;

import java.util.Comparator;

public class CompareShapeByArea implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (int)(((Shape)o1).calcArea() - (((Shape) o2).calcArea()));
    }
}

