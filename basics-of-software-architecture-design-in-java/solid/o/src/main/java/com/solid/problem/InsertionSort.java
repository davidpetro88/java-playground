package com.solid.problem;

/**
 * Created by david on 08/04/17.
 */
public class InsertionSort extends Sorter {

    public InsertionSort() {
        super.type = SortType.INSERTIONSORT;
    }

    @Override
    protected void sort() {
        System.out.println("Sorting with InsertionSort...");
    }
}
