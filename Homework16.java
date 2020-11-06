package com.homework1;
//1.6 print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is -47.12388980384689
//Area is -176.71458676442586
public class Homework16 {
    public static void main(String[] args) {
        double radius = 7.5;
        System.out.println("Area of the circle is " + Math.PI * radius * radius);
        System.out.println("Parimeter of the circle is " + 2 * Math.PI *radius);
    }
}
