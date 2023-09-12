/*
Problem Link: https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1

Problem Statement: Given a Binary Tree of size N, Print the corner nodes ie- the node at the leftmost and rightmost of each level.

Note: Don't print a new line after printing all the corner nodes.

Solution Approach: Use BFS approach to track first and last nodes at any level, and print them.

*/

/* ------------CODE---------------- */
class Tree
{
    public static void printCorner(Node node)
    {
        
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()) {
            int levelsize = q.size();
            for(int i=0; i<levelsize; i++) {
                Node temp = q.remove();
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                if(i==0 || i==levelsize-1) {
                    System.out.print(temp.data + " ");
                }
            }
        }
        
        // add your code here    
    }
    
}

/*
Time Complexity: O(n)
Space Complexity: O(n) - last level might have n/2 nodes
*/
