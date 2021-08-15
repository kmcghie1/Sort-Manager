package com.sparta.kmcgh.sorters;

import com.sparta.kmcgh.binarytree.BinaryTree;

public class BinaryTreeSort implements Sorter{

    public int[] sortArray(int[] arrayToSort) {
        double start = System.nanoTime();

        BinaryTree binaryTree = new BinaryTree(arrayToSort[0]);
        for(int i = 1; i < arrayToSort.length; i++){
            binaryTree.addElement(arrayToSort[i]);
        }
        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Sorting Randomly Generated Array...");
        System.out.println("Total Time Taken (in nanoseconds): " + totalTime);
        System.out.println("Total Time Taken (in milliseconds): " + totalTime/1000000);
        System.out.print("Sorted Array: [");
        binaryTree.getSortedTreeAsc(binaryTree.findNode(arrayToSort[0]));
        System.out.println("]");

        return null;
    }
}
