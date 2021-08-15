package com.sparta.kmcgh.sorters;

public class RecursiveQuickSort implements Sorter{

    public int[] sortArray(int[] arrayToSort) {
        double start = System.nanoTime();

        int low = 0;
        int high = arrayToSort.length - 1;

        quickHelp(arrayToSort, low, high);

        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Sorting Randomly Generated Array...");
        System.out.println("Total Time Taken (in nanoseconds): " + totalTime);

        return arrayToSort;
    }

    private void quickHelp(int[] arrayToSort, int low, int high){

        if (low < high){
            int pi = partition(arrayToSort, low, high);

            quickHelp(arrayToSort, low, pi - 1);
            quickHelp(arrayToSort, pi + 1, high);
        }
    }

    private int partition(int[] arrayToSort, int low, int high) {

        int pivot = arrayToSort[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){

            if (arrayToSort[j] < pivot){

                i++;
                int tempNum = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = tempNum;
            }
        }
        int tempNum = arrayToSort[high];
        arrayToSort[high] = arrayToSort[i+1];
        arrayToSort[i+1] = tempNum;

        return (i + 1);
    }
}
