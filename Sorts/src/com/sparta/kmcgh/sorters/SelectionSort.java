package com.sparta.kmcgh.sorters;

public class SelectionSort implements Sorter {

    public int[] sortArray(int[] arrayToSort) {
        double start = System.nanoTime();

        for (int i = 0; i < arrayToSort.length; i++) {

            int tempIndex = i;
            int smallestIndex = i;

            for (int j = i+1; j < arrayToSort.length; j++) {

                if (arrayToSort[smallestIndex] > arrayToSort[j]) {

                    if(arrayToSort[tempIndex] > arrayToSort[j] || tempIndex == 0){
                        tempIndex = j;
                    }
                }
            }

            int tempNum = arrayToSort[tempIndex];
            arrayToSort[tempIndex] = arrayToSort[i];
            arrayToSort[i] = tempNum;
        }

        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Sorting Randomly Generated Array...");
        System.out.println("Total Time Taken (in nanoseconds): " + totalTime);

        return arrayToSort;
    }
}
