package com.homework1;
//1.8 Write a Java program that reads a number in inches, converts it to meters.
//Note: One inch is 0.0254 meter.
//Test Data
//Input a value for inch: 1000
//Expected Output :
//1000.0 inch is 25.4 meters
import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();
        System.out.println(inch + " inch is " + 0.0254 * inch + " meters.");
    }
}
