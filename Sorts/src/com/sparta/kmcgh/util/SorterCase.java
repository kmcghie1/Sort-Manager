package com.sparta.kmcgh.util;

import com.sparta.kmcgh.sorters.*;

public class SorterCase {
    public Sorter caseLoader(int index){

        switch(index){
            case 1:

                BubbleSort b = new BubbleSort();
                return b;

            case 2:
                RecursiveMergeSort rM = new RecursiveMergeSort();
                return rM;

            case 3:
                InsertionSort i = new InsertionSort();
                return i;

            case 4:
                RecursiveQuickSort rQ = new RecursiveQuickSort();
                return rQ;

            case 5:
                SelectionSort ss = new SelectionSort();
                return ss;

            case 6:
                BinaryTreeSort bts = new BinaryTreeSort();
                return bts;
        }

        return null;
    }
}
