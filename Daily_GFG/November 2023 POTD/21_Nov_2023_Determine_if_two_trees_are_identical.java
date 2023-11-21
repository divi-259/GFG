/*
Author : Divyanshi Dixit
Date : Nov 21, 2023
Problem : Determine if two trees are identical
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1

Problem Statement: Given two binary trees, the task is to find if both of them are identical or not.
Note: You need to return true or false, the printing is done by the driver code.

Solution Approach: Recursively check for both trees.

*/

/* ------------CODE---------------- */
class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1==null && root2==null)
	        return true;
	    if(root1==null || root2==null)
	        return false;
	   if(root1.data==root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right))
	    return true;
	    return false;
	}
	
}

/*
Time Complexity: O(n)
Space Complexity: O(h)
*/
