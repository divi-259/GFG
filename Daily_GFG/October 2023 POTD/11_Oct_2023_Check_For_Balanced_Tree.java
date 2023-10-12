/*
Author : Divyanshi Dixit
Date : Oct 12, 2023
Problem : Check for Balanced Tree
Difficulty : Easy

Problem Link: https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1

Problem Statement: Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

Solution Approach: 
Create a helper method of height to get the height of the left and right subtree, check if the difference is height is less
than or equal to 1, recursively do it for the entire tree. Read the code below with given comments to better understand
the solution.

*/

/* ------------CODE---------------- */

class Tree {
    
    // Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root) {
        // Base case: If the root is null, it's a balanced tree.
        if (root == null)
            return true;
        
        // Base case: If the root is a leaf node, it's a balanced tree.
        if (root.left == null && root.right == null)
            return true;

        // Calculate the height of the left and right subtrees.
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Check if the absolute difference in heights is less than or equal to 1,
        // and both left and right subtrees are balanced.
        if (Math.abs(leftHeight - rightHeight) <= 1 &&
            isBalanced(root.left) &&
            isBalanced(root.right)) {
            return true; // The tree is balanced.
        } else {
            return false; // The tree is not balanced.
        }
    }
    
    // Function to calculate the height of a binary tree.
    int height(Node root) {
        // Base case: If the root is null, its height is 0.
        if (root == null)
            return 0;

        // Base case: If the root is a leaf node, its height is 1.
        if (root.left == null && root.right == null)
            return 1;

        // Calculate the height by recursively finding the maximum height
        // of the left and right subtrees and adding 1.
        return 1 + Math.max(height(root.left), height(root.right));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
