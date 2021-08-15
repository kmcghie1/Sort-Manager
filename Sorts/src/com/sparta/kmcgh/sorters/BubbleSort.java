package com.sparta.kmcgh.sorters;

public class BubbleSort implements Sorter {

    public int[] sortArray(int[]arrayToSort){
        double start = System.nanoTime();

        for(int i = 0; i < arrayToSort.length - 1; i++){
            if(arrayToSort[i] < arrayToSort[i+1]){

                if(i == arrayToSort.length - 1){
                    System.out.println("This array was already sorted!");
                    return arrayToSort;
                }

                continue;
            }
            else{
                break;
            }
        }

        for(int i = 0; i < arrayToSort.length; i++){
            for(int j = 0; j < arrayToSort.length - i - 1; j++){

                if(arrayToSort[j] < arrayToSort[j+1]){
                    continue;
                }

                else {
                    int tempNum = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = tempNum;
                }
            }
        }

        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Sorting Randomly Generated Array...");
        System.out.println("Total Time Taken (in nanoseconds): " + totalTime);

        return arrayToSort;
    }
}
