package com.homework1;
//*1.4 Write a Java program that takes two numbers as input from the console and display the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum;
        System.out.print("Input first number: ");
        firstNum = sc.nextInt();
        System.out.print("Input second number: ");
        secondNum = sc.nextInt();
        System.out.println("The product is " + (firstNum * secondNum));

    }
}
