/*
Author : Divyanshi Dixit
Date : Nov 22, 2023
Problem : Symmetric Tree
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/symmetric-tree/1

Problem Statement: Given a Binary Tree. Check whether it is Symmetric or not, 
i.e. whether the binary tree is a Mirror image of itself or not.

Solution Approach: Using a helper method recursively check for left and right node of the tree

*/

/* ------------CODE---------------- */
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null)
            return true;
        return helper(root.left, root.right);
    }
    private static boolean helper(Node t1, Node t2) {
        if(t1==null && t2==null)
            return true;
        if(t1==null || t2==null)
            return false;
        return (t1.data==t2.data && helper(t1.left, t2.right) && helper(t1.right, t2.left));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(h)
*/
