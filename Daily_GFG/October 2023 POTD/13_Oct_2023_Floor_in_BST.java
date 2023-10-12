/*
Author : Divyanshi Dixit
Date : Oct 12, 2023
Problem : Floor in BST
Difficulty : Medium

Problem Link: https://practice.geeksforgeeks.org/problems/floor-in-bst/1 

Problem Statement: You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value node of the BST which is smaller than or equal to x.
Note: when x is smaller than the smallest node of BST then returns -1.

Solution Approach: 
Simply take a helper method and traverse the tree in a fashion that checks the current node data, and keep saving in a global ans variable.
Below is the properly commented code in java.

*/

/* ------------CODE---------------- */

class Solution {
    static int ans; // Static variable to store the answer

    public static int floor(Node root, int x) {
        // Initialize the answer as -1
        ans = -1;

        // Start the traversal from the root
        traverse(root, x);

        // Return the calculated floor value
        return ans;
    }

    private static void traverse(Node root, int x) {
        // Base case: If the current node is null, return
        if (root == null)
            return;

        // If the current node's data matches x, update the answer and return
        if (root.data == x) {
            ans = root.data;
            return;
        }

        // If the current node's data is less than x, update the answer and traverse the right subtree
        if (root.data < x) {
            ans = root.data;
            traverse(root.right, x);
        }
        // If the current node's data is greater than x, traverse the left subtree
        else if (root.data > x) {
            traverse(root.left, x);
        }
    }
}

/*
Time Complexity: O(h) - where h is the height of the BST
Space Complexity: O(h) - for stack space otherwise O(1) 
*/
