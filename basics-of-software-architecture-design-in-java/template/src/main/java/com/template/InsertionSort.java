package com.template;

/**
 * Created by david on 10/04/17.
 */
public class InsertionSort extends Algorithm {

    private int[] numbers;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    void initialize() {
        System.out.println("\nInsertion sort initializing...");
    }

    @Override
    void sorting() {
        int temp;
        int j;

        for(int i=1;i<this.numbers.length;i++){

            temp = this.numbers[i];
            j=i;

            while(j>0 && numbers[j-1]> temp){
                numbers[j] = numbers[j-1];
                j=j-1;
            }

            numbers[j] = temp;

        }
    }

    @Override
    void printResult() {
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
