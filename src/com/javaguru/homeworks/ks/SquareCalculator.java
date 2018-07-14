package com.javaguru.homeworks.ks;

import java.util.Scanner;

public class SquareCalculator {
    public void calculateSquare() {
        System.out.println("Please enter number: ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        int square = (int) Math.pow(firstNumber, 2);

        System.out.println(square);
    }
}
