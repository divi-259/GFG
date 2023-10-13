/*
Author : Divyanshi Dixit
Date : Oct 14, 2023
Problem : 
Difficulty : Easy

Problem Link: https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1

Problem Statement: Given two Binary Search Trees. Find the nodes that are common in both of them, ie- find the intersection of the two BSTs.
Note: Return the common nodes in sorted order.

Solution Approach: The code aims to find common nodes in two Binary Search Trees (BSTs). 
It does this by performing an in-order traversal of each BST and keeping track of values using a HashSet. 
When traversing the second BST, it checks if the value exists in the HashSet from the first BST. 
If it does, the value is added to the list of common nodes. 
The result is a list of nodes common to both BSTs.

*/

/* ------------CODE---------------- */

class Solution {
    // Function to find the nodes that are common in both BST.

    private static HashSet<Integer> hset; // HashSet to store values from one BST.
    private static ArrayList<Integer> list; // ArrayList to store common values.
    private static boolean traverse;

    // Function to find common nodes in two BSTs.
    public static ArrayList<Integer> findCommon(Node root1, Node root2) {
        hset = new HashSet<>(); // Initialize the HashSet.
        list = new ArrayList<>(); // Initialize the ArrayList.
        traverse = false;
        inorder(root1); // Traverse the first BST.
        traverse = true;
        inorder(root2); // Traverse the second BST.
        return list; // Return the list of common values.
    }

    // Helper function to perform an in-order traversal of a BST.
    private static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (!traverse) {
            hset.add(root.data); // Add values to the HashSet from the first BST.
        } else {
            if (hset.contains(root.data)) {
                list.add(root.data); // If the value is in the HashSet, it's a common value, so add it to the list.
            }
        }

        inorder(root.right);
        return;
    }
}

/*
Time Complexity: O(n+m) - to traverse both the trees
Space Complexity: O(h) - where h is the height of the larger tree
*/
