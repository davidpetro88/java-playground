package com.algorithm.basics;

/**
 * Created by david on 19/02/17.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {12,22,23,34,56,67,76,89,95,97}; //array sorted
        System.out.println("Index of the item we arelooking for is: "+ binarySearch(nums, 22)); // 22 is the number to find key.
        System.out.println("Index of the item we arelooking for is: "+  binarySearch(nums, 11)); // return -1 number doesn't exist.
    }

    public static int binarySearch(int[] numsArray, int key) {
        int start = 0;
        int end = numsArray.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; // get the number od the midle example ( 1, 2, 3) get 2
            int numberOfMiddle = numsArray[mid];
            if (key == numberOfMiddle) return mid;
            if (key < numberOfMiddle) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
