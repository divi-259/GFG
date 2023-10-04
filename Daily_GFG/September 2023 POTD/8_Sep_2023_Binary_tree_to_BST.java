/*
Problem Link: https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1

Problem Statement: Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.

Solution Approach: Create the list from the given binary tree, and sort this, now traverse it and keep updating the
values in the original Binary tree to make it a BST.

*/

/* ------------CODE---------------- */
class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    List<Integer> list;
    int index = 0;
    Node binaryTreeToBST(Node root)
    {      
       list = new ArrayList<>();
       traverse(root, false); // to fill the list with all the values
       // now sort this list
       Collections.sort(list);
       
       // now again do inorder traversal but this time update the node's value with the one in the list
       traverse(root, true);
       return root;
    }
    
    private void traverse(Node root, boolean isUpdate) {        
        if(root==null)
            return;
        traverse(root.left, isUpdate);
        if(isUpdate) {
            root.data = list.get(index++);
        }
        else {
             list.add(root.data);
        }       
        traverse(root.right, isUpdate);        
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
