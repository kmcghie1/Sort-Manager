package com.sparta.kmcgh.binarytree;

public interface BinaryTreeInterface {
    int getRootElement();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

}
