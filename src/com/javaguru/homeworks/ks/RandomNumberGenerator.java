package com.javaguru.homeworks.ks;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int from, int to) {
        int random_number = from + (int) (Math.random() * to); // Генерация 1-го числа
        System.out.println("generateRandomNumber generated: " + random_number);

        return random_number;
    }
}
