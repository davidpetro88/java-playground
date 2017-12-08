package com.template;

/**
 * Created by david on 10/04/17.
 */
public class BubbleSort extends Algorithm {

    private int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    void initialize() {

        System.out.println("\nInitializing bubble sort...");
    }

    @Override
    void sorting() {
        int n = this.numbers.length;
        int temp;

        while (n != 0) {

            temp = 0;

            for (int i = 1; i < n; i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int swap = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = swap;
                    temp = i;
                }
            }

            n = temp;

        }
    }

    @Override
    void printResult() {
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
}
