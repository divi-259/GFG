/*
Problem Link: https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1

Problem Statement: Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST. 
If K is already present in the BST, don't modify the BST.

Solution Approach: Traverse the tree in a fashion to find out where K should be, if K found in tree - do nothing and
return and if K not found in the tree, add it to its relevant position.
Imp point is you need to check in the parent node only if it has a left or right possibility to add the Kth node
possibility means its left or right child is null where k is supposed to be.

*/

/* ------------CODE---------------- */
class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here
        if(root==null)
        {
            root = new Node(key);
            return root;
        }
        
        add(root, key);
        
        return root;
    }
    
    void add(Node root, int key) {
        if(root.data==key)
            return;
        
        else if(root.data < key) {
            if(root.right!=null)
                add(root.right, key);
            else {
                root.right = new Node(key);
                return;
            }
        }
        else if(root.data > key)
            {
                if(root.left!=null)
                add(root.left, key);
            else {
                root.left = new Node(key);
                return;
            }
        }
        return;
    }
}

/*
Time Complexity: O(h)
Space Complexity: O(1)
*/
