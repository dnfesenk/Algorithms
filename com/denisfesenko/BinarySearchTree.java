package com.denisfesenko;

/**
 * Write java function to find some element in binary search tree
 * <p>
 * In Java, a binary search tree (BST) is a binary tree data structure with the property that the value of each node
 * is greater than or equal to the values in its left subtree and less than or equal to the values in its right subtree.
 * To find an element in a BST, you can use a recursive function that traverses the tree based on the value you're searching for.
 * This code defines a TreeNode class for the nodes of the BST and a BinarySearchTree class with the findElement function.
 * The function takes the root of the BST and the target value as its arguments and returns a boolean indicating whether
 * the target value is present in the BST or not.
 **/
public class BinarySearchTree {

    // Function to find the element in the BST
    public static boolean findElement(TreeNode root, int target) {
        // If the root is null, the element is not present
        if (root == null) {
            return false;
        }

        // If the target value is equal to the root value, the element is found
        if (target == root.value) {
            return true;
        }

        // If the target value is less than the root value, search in the left subtree
        if (target < root.value) {
            return findElement(root.left, target);
        }

        // If the target value is greater than the root value, search in the right subtree
        return findElement(root.right, target);
    }

    public static void main(String[] args) {
        // Create a simple BST for testing
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        int target = 60;

        if (findElement(root, target)) {
            System.out.println("Element " + target + " is present in the BST.");
        } else {
            System.out.println("Element " + target + " is not present in the BST.");
        }
    }
}

// Define the structure for the binary search tree nodes
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}