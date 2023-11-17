/*
Author : Divyanshi Dixit
Date : Nov 17, 2023
Problem : Reverse a doubly linked list
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1

Problem Statement: Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Solution Approach: 
Similar to reversing a singly linked list, just keep the prev pointer also updated.

*/

/* ------------CODE---------------- */

//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution
{ 
    Node prev = null;
    Node head = null;
    Node bTreeToClist(Node root)
    {
        if(root==null)
            return null;
        bTreeToClist(root.left); // processing left
        if(prev==null)
            head = root; // extreme left node in traversal has now become Linkedlist head
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        bTreeToClist(root.right); // right side of the inorder traversal
        prev.right = head;
        head.left = prev;
        return head;
    }    
}
/*
Time Complexity: O(n)
Space Complexity: O(1) - in place
*/
