/*
Problem Link: https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

Problem Statement: Given a Binary Search Tree. 
Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.

Solution Approach: keep a counter variable, and traverse the tree in inorder fashion(reverse inorder - right, data, and left),
 as the count becomes equal to k, save that number and return, in original method return this num.

*/

/* ------------CODE---------------- */

class Solution
{
   int count;
    int num;
    public int kthLargest(Node root,int k)
    {
        count = 0;
        helper(root, k);
        return num;
    }
    
    private void helper(Node root, int k) {
        if(root==null)
        return;
        
        helper(root.right, k);
        count++;
        if(count==k)
            {
                num = root.data;
                return;
            }
        helper(root.left, k);
        
    }
}
/*
Time Complexity: O(k)
Space Complexity: O(1)
*/
