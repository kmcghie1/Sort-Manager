package com.sparta.kmcgh.binarytree;

public class BinaryTree implements BinaryTreeInterface{

    public int getRootElement(){
        return rootNode.getValue();
    }

    public int getLeftChild(int element) throws ChildNotFoundException{
        if(findNode(element).isLeftChildEmpty() == false){
            return findNode(element).getLeftChild().getValue();
        }
        else{
            throw new ChildNotFoundException("No left child for this node.");
        }
    }

    public int getRightChild(int element) throws ChildNotFoundException {
        if(findNode(element).isRightChildEmpty() == false){
            return findNode(element).getRightChild().getValue();
        }
        else{
            throw new ChildNotFoundException("No left child for this node.");
        }
    }

    private final Node rootNode;

    public BinaryTree(final int element){
        rootNode = new Node(element);
    }

    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    public void addElements(final int[] elements){
        for(int i = 0; i < elements.length; i++){
            addNodeToTree(rootNode, elements[i]);
        }
    }

    public boolean findElement(final int value){
        Node node = findNode(value);
        if (node != null){
            return true;
        }
        return false;
    }

    public Node findNode(int element){
        Node node = rootNode;

        while(node != null){
            if(element == node.getValue()){
                return node;
            }
            else if(element < node.getValue()){
                node = node.getLeftChild();
            }
            else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void addNodeToTree(Node node, int element){
        if(element == node.getValue()){
            return;
        }

        else if(element < node.getValue()){
            if(node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            }
            else {
                addNodeToTree(node.getLeftChild(), element);
            }
        }

        else if(element > node.getValue()){
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            }
            else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    public void getSortedTreeAsc(Node node){

        if(node == null){
            return;
        }

        getSortedTreeAsc(node.getLeftChild());
        System.out.print(node.getValue() + ", ");
        getSortedTreeAsc(node.getRightChild());

    }


    public void getSortedTreeDesc(Node node){

        if(node == null){
            return;
        }

        getSortedTreeAsc(node.getRightChild());
        System.out.print(node.getValue() + ", ");
        getSortedTreeAsc(node.getLeftChild());
    }

    @Override
    public String toString(){
        return "Binary Tree";
    }
}
