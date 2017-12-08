package com.solid.problem;

/**
 * Created by david on 08/04/17.
 */
public class MergeSort extends Sorter {

    public MergeSort() {
        super.type = SortType.MERGERSORT;
    }

    @Override
    protected void sort() {
        System.out.println("Sorting with mergesort...");
    }
}
