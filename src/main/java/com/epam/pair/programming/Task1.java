package com.epam.pair.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int multiplication() {
        int firstMultiPlie;
        int secondMultiPlie;
        int multiplierResult = 0;

        System.out.println("Input first multiplicating number.");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            firstMultiPlie = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Input second multiplicating number.");
            secondMultiPlie = Integer.parseInt(bufferedReader.readLine());
            multiplierResult = firstMultiPlie * secondMultiPlie;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return multiplierResult;
    }

    public int division(int a, int b) {
        return a/b;
    }
}
