package com.sparta.kmcgh.util;

import com.sparta.kmcgh.sorters.RecursiveMergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Loader {

    public String loader(){

        RandomArrayGenerator rag = new RandomArrayGenerator();
        SorterFactory sf = new SorterFactory();
        SorterCase sc = new SorterCase();
        RecursiveMergeSort rM = new RecursiveMergeSort();

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------- \n" +
                "Choose how many numbers you'd like your array to have: \n" +
                "-------------------------------------------------------- ");
        int arrayAmount = scanner.nextInt();

        System.out.println(" \n" +
                "-------------------------------------------------------- \n " +
                "Choose which sorting algorithm you want to use: \n" +
                "1. Bubble Sort \n" +
                "2. Merge Sort \n" +
                "3. Insertion Sort \n" +
                "4. Selection Sort \n" +
                "5. Quick Sort \n" +
                "6. Binary Tree Sort \n" +
                "--------------------------------------------------------");

        int chosenAlgorithm = scanner.nextInt();

        System.out.println("--------------------------------------------------------");
        return "Sorted Array: " + Arrays.toString(sf.sorterLoader(chosenAlgorithm, rag.generateArray(arrayAmount))) + "\n" +
                "--------------------------------------------------------";
    }
}
