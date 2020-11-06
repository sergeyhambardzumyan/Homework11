package com.homework1;
//1.7 Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//Test Data
//Input a degree in Fahrenheit: 212
//Expected Output:
//212.0 degree Fahrenheit is equal to 100.0 in Celsius
import java.util.Scanner;
public class Homework17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Input a degree in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }
}
