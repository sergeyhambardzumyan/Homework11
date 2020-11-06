package com.homework1;
//1.5 Write a Java program that takes a number as input and prints its multiplication table up to 10.
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
import java.util.Scanner;
public class Homework15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
