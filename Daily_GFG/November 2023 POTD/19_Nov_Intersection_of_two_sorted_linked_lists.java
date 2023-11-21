/*
Author : Divyanshi Dixit
Date : Nov 19, 2023
Problem : Intersection of two sorted Linked lists
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1

Problem Statement: Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

Solution Approach: Keep traversing both lists together and add the common nodes into a new linked list

*/

/* ------------CODE---------------- */
class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
          Node dummy=new Node(0);
        Node curr=dummy;
        
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                curr.next=new Node(head1.data);
                curr=curr.next;
                head1=head1.next;
                head2=head2.next;
            }else if(head1.data<head2.data){
                head1=head1.next;
            }else{
                 head2=head2.next;
            }
        }
        return dummy.next;
    }
}

/*
Time Complexity: O(m+n)
Space Complexity: O(Min(m,n)) - only common nodes
*/
