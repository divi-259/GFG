/*
Problem Link: https://practice.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1

Problem Statement: Given two Binary Trees. Check whether they are Isomorphic or not.
Note: 
Two trees are called isomorphic if one can be obtained from another by a series of flips, 
i.e. by swapping left and right children of several nodes. 
Any number of nodes at any level can have their children swapped. Two empty trees are isomorphic.

Solution Approach: Recursion is your friend here, call the function recursively and check for left and right children of the 
node1 with right and left children of node2 if they are isomorphic or not.

*/

/* ------------CODE---------------- */

//User function Template for Java

class Solution  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         if(root1==null && root2==null)
            return true;       
        if (root1 != null && root2 != null && root1.data == root2.data) {
        return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) ||
               (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
        }
        
        return false;
    }
    
    
    
}  
/*
Time Complexity: 
Space Complexity: 
*/
