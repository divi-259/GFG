/*
Author : Divyanshi Dixit
Date : Oct 12, 2023
Problem : Duplicate subtree in Binary Tree
Difficulty : Medium

Problem Link: https://practice.geeksforgeeks.org/problems/duplicate-subtree-in-binary-tree/1

Problem Statement: Given a binary tree, find out whether it contains a duplicate sub-tree of size two or more, or not.
Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one. 

Solution Approach: We are using map to store all subtrees and the frequency of them.
Check comments for better understanding of step by step solution.

*/

/* ------------CODE---------------- */
class Solution {
    HashMap<String, Integer> hmap; // HashMap to store the subtrees as strings and their occurrence counts

    int dupSub(Node root) {
        // Initialize the HashMap
        hmap = new HashMap<>();

        // Start the recursion to find and count duplicate subtrees
        helper(root);

        // Iterate through the HashMap entries and check for duplicates
        for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() >= 2) {
                return 1; // If a duplicate subtree is found, return 1
            }
        }

        // If no duplicate subtree is found, return 0
        return 0;
    }

    String helper(Node root) {
        // Base case: If the current node is null, return "$" as a marker
        if (root == null) {
            return "$";
        }

        // Convert the current node's data to a string
        String s = Integer.toString(root.data);

        // If the current node is a leaf (no left or right children), return its data as a string
        if (root.right == null && root.left == null) {
            return s;
        }

        // Append "/" to separate child nodes in the string representation
        s += "/";
        s += helper(root.left); // Recursively build the left subtree string
        s += "/"; // Add an extra "/" to handle edge cases like (1, 11) & (11, 1)
        s += helper(root.right); // Recursively build the right subtree string

        // Update the HashMap with the subtree string and its occurrence count
        hmap.put(s, hmap.getOrDefault(s, 0) + 1);

        // Return the subtree string
        return s;
    }
}


/*
Time Complexity: O(n) - as each node is visited once in this recursive approach
Space Complexity: O(n) - at worst case as each node in the binary tree can have a unique subtree string.
*/
