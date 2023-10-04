/*
Problem Link: https://practice.geeksforgeeks.org/problems/leaf-under-budget/1

Problem Statement: Given a binary tree and a budget. Assume you are at the root of the tree(level 1), 
you need to maximise the count of leaf nodes you can visit in your budget 
if the cost of visiting a leaf node is equal to the level of that leaf node.

Solution Approach: 
Use BFS approach using queue data structure, and add the cost of a leaf node which will be equal to the level at which the node is. 
*/

/* ------------CODE---------------- */
class Solution{
    public int getCount(Node node, int bud)
    {
        //code here  
        
        int level = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        int cost = 0;
        int count = 0;
        
        while(!q.isEmpty()) {
            int levelsize = q.size();
            level++;
            for(int i=0; i<levelsize; i++) {
                Node temp = q.remove();
                if(temp.left==null && temp.right==null) {
                    cost += level;
                    count++;
                    if(cost > bud)
                    return count-1;
                    if(cost==bud)
                    return count;
                }
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
        }
        return count;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
