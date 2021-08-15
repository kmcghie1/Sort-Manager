package com.sparta.kmcgh.sorters;

public class InsertionSort implements Sorter {

    public int[] sortArray(int[] arrayToSort) {
        double start = System.nanoTime();

        for (int i = 1; i < arrayToSort.length; ++i) {

            int key = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = key;
        }

        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Sorting Randomly Generated Array...");
        System.out.println("Total Time Taken (in nanoseconds): " + totalTime);

        return arrayToSort;
    }
}