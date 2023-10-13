/*
Author : Divyanshi Dixit
Date : Oct 12, 2023
Problem : Nodes at given distance in binary tree

Difficulty : Hard

Problem Link: https://practice.geeksforgeeks.org/problems/nodes-at-given-distance-in-binary-tree/1 

Problem Statement: Given a binary tree, a target node in the binary tree, and an integer value k, find all the nodes that are at distance k from the given target node. No parent pointers are available.
Note:
You have to return the list in sorted order.
The tree will not contain duplicate values.

Solution Approach: 
The only thing to remember here is we can go from parent to child of a target node, but not in the reverse from node to parent,
so just create a hashmap of child to parent relationship while doing a level order traversal of the tree,
and then use it to find all the nodes at distance k from the target node.
*/

/* ------------CODE---------------- */

class Solution {
    static Node tar; // Variable to store the target node.

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        // Return the sorted list of all nodes at a distance k from the target node.
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Node> q1 = new LinkedList<>(); // Queue for level-order traversal.
        Queue<Node> q2 = new LinkedList<>(); // Queue for traversing nodes at distance k.
        HashMap<Node, Node> hs_Parent = new HashMap<>(); // Map to store parent-child relationships.
        HashMap<Node, Boolean> isVisited = new HashMap<>(); // Map to track visited nodes.
        int dist = 0;

        // Initialize the level-order traversal queue with the root node.
        q1.add(root);
        hs_Parent.put(root, root);

        // Perform level-order traversal and populate the parent-child map.
        while (!q1.isEmpty()) {
            Node curr = q1.poll();

            if (curr.left != null) {
                q1.add(curr.left);
                hs_Parent.put(curr.left, curr);
            }
            if (curr.right != null) {
                q1.add(curr.right);
                hs_Parent.put(curr.right, curr);
            }
        }

        // Find the target node in the tree.
        getTarget(root, target);

        // Initialize the queue with the target node and mark it as visited.
        q2.offer(tar);
        isVisited.put(tar, true);

        // Traverse nodes at a distance k from the target node.
        while (!q2.isEmpty()) {
            if (dist == k)
                break;
            dist++;

            int size = q2.size();

            for (int i = 0; i < size; i++) {
                Node curr = q2.poll();
                if (curr.left != null && isVisited.get(curr.left) == null) {
                    isVisited.put(curr.left, true);
                    q2.offer(curr.left);
                }
                if (curr.right != null && isVisited.get(curr.right) == null) {
                    isVisited.put(curr.right, true);
                    q2.offer(curr.right);
                }

                if (isVisited.get(hs_Parent.get(curr)) == null) {
                    q2.offer(hs_Parent.get(curr));
                    isVisited.put(hs_Parent.get(curr), true);
                }
            }
        }

        // Populate the answer list with nodes at distance k.
        while (!q2.isEmpty()) {
            Node curr = q2.poll();
            ans.add(curr.data);
        }
        
        // Sort the answer list.
        Collections.sort(ans);
        return ans;
    }

    public static void getTarget(Node root, int target) {
        if (root == null) {
            return;
        }
        if (root.data == target) {
            tar = root; // Set the target node.
            return;
        }
        // Recursively search for the target node in the left and right subtrees.
        getTarget(root.left, target);
        getTarget(root.right, target);
    }
}

/*
Time Complexity: O(n) again at worst case
Space Complexity: O(n) for hashmaps
*/
