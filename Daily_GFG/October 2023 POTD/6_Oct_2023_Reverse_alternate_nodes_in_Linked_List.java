/*
Author : Divyanshi Dixit
Date : Oct 6, 2023
Problem : Reverse alternate nodes in Link List
Difficulty : Medium

Problem Link: https://practice.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/1 

Problem Statement: Given a linked list, you have to perform the following task:
1. Extract the alternative nodes starting from second node.
2. Reverse the extracted list.
3. Append the extracted list at the end of the original list.
Note: Try to solve the problem without using any extra memory.

Solution Approach: 
Do as said in the problem. Separate alternate lists with the help of two node pointers, and then add then after 
reversing the second list, add at the end of first one.

*/

/* ------------CODE---------------- */
class Solution{
    public static void rearrange(Node head) {
        // Check if there are enough nodes to perform the rearrangement.
        if (head == null || head.next == null) {
            return; // Not enough nodes to extract.
        }

        // Initialize pointers to rearrange the linked list.
        Node curr = head;        // Current pointer for the original list.
        Node temp = head.next;   // Temporary pointer for the extracted list.
        Node store = temp;       // Store the start of the extracted list.

        // Extract alternative nodes and rearrange the pointers.
        while (curr.next != null && temp.next != null) {
            curr.next = curr.next.next; // Skip the next node in the original list.
            curr = curr.next;           // Move the current pointer in the original list.
            temp.next = temp.next.next; // Skip the next node in the extracted list.
            temp = temp.next;           // Move the temporary pointer in the extracted list.
        }

        // Reverse the extracted list.
        Node ans = reverseList(store);

        // Append the reversed extracted list at the end of the original list.
        curr.next = ans;
    }
    private static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list.
        Node reversedHead = reverseList(head.next);

        // Reverse the current node's pointer to the next node.
        head.next.next = head;
        head.next = null;

        // Return the new head of the reversed list.
        return reversedHead;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
