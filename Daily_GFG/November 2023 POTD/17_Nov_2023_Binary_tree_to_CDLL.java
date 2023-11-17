/*
Author : Divyanshi Dixit
Date : Nov 17, 2023
Problem : Binary Tree to CDLL
Difficulty : Medium

Problem Link: https://www.geeksforgeeks.org/problems/binary-tree-to-cdll/1

Problem Statement: Given a Binary Tree of N edges. The task is to convert this to a Circular Doubly Linked List (CDLL) in-place. The left and right pointers in nodes are to be used as previous and next pointers respectively in CDLL. The order of nodes in CDLL must be same as Inorder of the given Binary Tree. 
The first node of Inorder traversal (left most node in BT) must be head node of the CDLL.

Solution Approach: TBD

*/

/* ------------CODE---------------- */
class Solution
{ 
    // Pointer to the previously processed node in inorder traversal
    Node prev = null;
    
    // Pointer to the head of the circular doubly linked list
    Node head = null;

    // Recursive function to convert a Binary Search Tree to a Circular Doubly Linked List
    Node bTreeToClist(Node root)
    {
        // Base case: If the current node is null, return null
        if(root==null)
            return null;
        
        // Process the left subtree
        bTreeToClist(root.left);

        // If prev is null, the current node is the leftmost node in the traversal
        if(prev==null)
            head = root; // Set the head to the leftmost node
        else {
            // Connect the current node to the previous node in the inorder traversal
            root.left = prev;
            prev.right = root;
        }

        // Update the prev pointer to the current node
        prev = root;

        // Process the right subtree
        bTreeToClist(root.right);

        // Connect the rightmost node to the leftmost node to form a circular list
        prev.right = head;
        head.left = prev;

        // Return the head of the circular doubly linked list
        return head;
    }
}


/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
