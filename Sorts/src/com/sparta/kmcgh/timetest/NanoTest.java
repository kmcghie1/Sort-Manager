package com.sparta.kmcgh.timetest;

import com.sparta.kmcgh.sorters.Sorter;

public class NanoTest {

    public int nanotimeCheck(Sorter sort, int[] arrayToSort){
        double start = System.nanoTime();
        //sort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        double totalTime = (finish - start);

        return (int)totalTime;
    }
}
