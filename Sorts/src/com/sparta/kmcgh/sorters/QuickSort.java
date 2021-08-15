package com.sparta.kmcgh.sorters;

public class QuickSort implements Sorter{

    public int[] sortArray(int[] arrayToSort) {

        for(int i = 1; i < arrayToSort.length; i++){

            int pivot = arrayToSort[0];
            int lessThanPivot, greaterThanPivot;
            lessThanPivot = greaterThanPivot = 0;
            int startArray = 1;
            int endArray = arrayToSort.length - 1;

            while(startArray != endArray){

                if(startArray > endArray){
                    break;
                }

                if(lessThanPivot == 0 && arrayToSort[startArray] > pivot){
                    lessThanPivot = startArray;
                }

                if(greaterThanPivot == 0 && arrayToSort[endArray] < pivot){
                    greaterThanPivot = endArray;
                }

                if(lessThanPivot != 0 && greaterThanPivot != 0){
                    int tempNum = arrayToSort[lessThanPivot];
                    arrayToSort[lessThanPivot] = arrayToSort[greaterThanPivot];
                    arrayToSort[greaterThanPivot] = tempNum;

                    lessThanPivot = greaterThanPivot = 0;
                }

                startArray++;
                endArray--;
            }
            int tempNum = arrayToSort[0];
            arrayToSort[0] = arrayToSort[startArray];
            arrayToSort[startArray] = tempNum;

        }

        return arrayToSort;
    }
}
