package com.javaguru.homeworks.ks;

import java.util.Scanner;

class Calculator {

    public void sum() {
        System.out.println("Please enter number: ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("Please enter number: ");
        int secondNumber = sc.nextInt();

        int sumResult = firstNumber + secondNumber;
        System.out.println(sumResult);
    }

    public void sumThreeNumbers() {
        System.out.println("Please enter number: ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("Please enter number: ");
        int secondNumber = sc.nextInt();

//        System.out.println("Please enter number: ");
//        int thirdNumber = sc.nextInt();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int thirdNumber = randomNumberGenerator.generateRandomNumber(1, 10);

        int sumResult = firstNumber + secondNumber + thirdNumber;
        System.out.println("Calculator::sumThreeNumbers result:" + sumResult);
    }
}
