package com.sparta.kmcgh.sorters;

public class RecursiveMergeSort implements Sorter{

    double start = System.nanoTime();
    public int[] sortArray(int[] arrayToSort) {


        if(arrayToSort.length <= 1){
            return arrayToSort;
        }

        int midpoint = arrayToSort.length / 2;
        int[] leftSide = new int[midpoint];
        int[] rightSide = new int[arrayToSort.length - midpoint];

        for(int i = 0; i < arrayToSort.length; i++){
            if(i < midpoint){
                leftSide[i] = arrayToSort[i];
            }
            else{ // [1, 3, 4, 6, 2, 7, 5, 10, 8, 9]
                rightSide[i - midpoint] = arrayToSort[i];
            }
        }

        leftSide = sortArray(leftSide);
        rightSide = sortArray(rightSide);

        int[] sortedArray = mergeSides(leftSide, rightSide);
        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Sorting Randomly Generated Array...");
        System.out.println("Total Time Taken (in milliseconds): " + totalTime/1000000);

        return sortedArray;
    }

    private int[] mergeSides(int[] leftSide, int[] rightSide){

        int[] finalArray = new int[leftSide.length + rightSide.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while(leftPointer < leftSide.length || rightPointer < rightSide.length){

            if(leftPointer < leftSide.length && rightPointer < rightSide.length){

                if(leftSide[leftPointer] < rightSide[rightPointer]){

                    finalArray[resultPointer++] = leftSide[leftPointer++];
                }
                else {

                    finalArray[resultPointer++] = rightSide[rightPointer++];
                }

            }

            else if(leftPointer < leftSide.length){

                finalArray[resultPointer++] = leftSide[leftPointer++];
            }

            else if(rightPointer < rightSide.length){
                finalArray[resultPointer++] = rightSide[rightPointer++];
            }
        }

        return finalArray;
    }

}
