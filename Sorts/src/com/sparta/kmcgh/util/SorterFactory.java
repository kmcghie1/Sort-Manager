package com.sparta.kmcgh.util;

import com.sparta.kmcgh.sorters.*;

public class SorterFactory {

    public int[] sorterLoader(int index, int[] generatedArray){

        switch(index){
            case 1:

                BubbleSort b = new BubbleSort();
                return b.sortArray(generatedArray);

            case 2:
                RecursiveMergeSort rM = new RecursiveMergeSort();
                return rM.sortArray(generatedArray);

            case 3:
                InsertionSort i = new InsertionSort();
                return i.sortArray(generatedArray);

            case 4:
                RecursiveQuickSort rQ = new RecursiveQuickSort();
                return rQ.sortArray(generatedArray);

            case 5:
                SelectionSort ss = new SelectionSort();
                return ss.sortArray(generatedArray);

            case 6:
                BinaryTreeSort bts = new BinaryTreeSort();
                return bts.sortArray(generatedArray);
        }

        return null;
    }
}
