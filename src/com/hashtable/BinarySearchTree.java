package com.hashtable;
public class BinarySearchTree {
    static Node root;
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    // Uc1 = Ability to create a BST by adding 56 and then adding 30 & 70 - Use INode to create My Binary.
    public static void insertNode(int value) {
        root = insertNode(root,value);
    }

    public static Node insertNode(Node root, int value){ // Adding Nodes in Binary Search Tree
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {                        // If value is less than root then it will go to left.
            root.left = insertNode(root.left, value);
        }
        else {
            root.right = insertNode(root.right, value); // If value is greater than root then it will go to right.
        }
        return root;
    }
    // UC2 = Check if all are added with using size method in Binary Tree.
    public static void inOrder(Node root) { // Checking our nodes are in right position or not by inorder method.
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Uc3 = Search if 63 is present or not in the tree.
    public static boolean searchNode(Node root, int key){
        if(root == null) {
            return false;
        }

        if (root.data > key){
            return searchNode(root.left, key);
        }
        else if (root.data == key){
            return true;
        } else {
            return searchNode(root.right, key);
        }
    }

    public static void main(String[] args) {
        insertNode(56);
        insertNode(30);
        insertNode(70);
        inOrder(root);

        if(searchNode(root,63)){
            System.out.println("63 is present");
        }else
            System.out.println("63 is not found");
    }

}


