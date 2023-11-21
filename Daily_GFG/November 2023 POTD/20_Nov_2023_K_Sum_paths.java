/*
Author : Divyanshi Dixit
Date : Nov 21, 2023
Problem : K sum paths
Difficulty : Medium

Problem Link: https://www.geeksforgeeks.org/problems/k-sum-paths/1

Problem Statement: Given a binary tree and an integer K. Find the number of paths in the tree which have their sum equal to K.
A path may start from any node and end at any node in the downward direction.
Since the answer may be very large, compute it modulo 109+7.

Solution Approach: 
Simple case of backtracking and keeping a counter variable to get the sum of all the possible cases

*/

/* ------------CODE---------------- */

class Solution
{
    int count;
    public int sumK(Node root,int k)
    {
        count = 0;
        ArrayList<Integer> path = new ArrayList<>();
        helper(root , k, path);
        return count;
    }
    
    private void helper(Node root, int k, ArrayList<Integer> path) {
        if(root==null) {
            return;
        }
        
        // Process
        path.add(root.data);
        
        int size = path.size();
        int sum = 0;
        for(int i=size-1; i>=0; i--) {
            sum += path.get(i);
            if(sum==k)
                count++;
        }
        helper(root.left, k, path);
        helper(root.right, k, path);
        // unprocess
        path.remove(path.size()-1);
    }
    
}
/*
Time Complexity: O(n) - n is the number of nodes in the binary tree, as each node is visited once
Space Complexity: O(h) - h is the height of the tree (stack space)
*/
