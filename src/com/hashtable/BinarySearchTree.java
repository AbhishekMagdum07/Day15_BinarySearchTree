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

    public static void main(String[] args) {
        insertNode(56);
        insertNode(30);
        insertNode(70);
    }

}


