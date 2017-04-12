package com.solid.problem;

/**
 * Created by david on 08/04/17.
 */
public class SorterManager {

    public void sort (Sorter sorter){
        if (sorter.type == SortType.INSERTIONSORT) doInsertionSort(sorter);
        else if (sorter.type == SortType.MERGERSORT) doMergerSort(sorter);
    }

    private void doInsertionSort(Sorter sorter) {
        sorter.sort();
    }

    private void doMergerSort(Sorter sorter) {
        sorter.sort();
    }
}
