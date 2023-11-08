/*
Author : Divyanshi Dixit
Date : Nov 8, 2023
Problem : Print Matrix in snake Pattern
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1

Problem Statement: Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern.

Solution Approach: 
The code defines a snakePattern function that takes a matrix as input. It initializes an empty ArrayList to store elements in snake pattern and a boolean variable (dir) to track the direction. It then iterates through the rows of the matrix, adding elements to the ArrayList in the specified direction. The direction alternates between left to right and right to left for each row. Finally, it returns the ArrayList with elements in snake pattern.

The approach is to loop through the matrix row by row, adding elements in a zigzag pattern (snake pattern) by changing the direction after processing each row.

*/

/* ------------CODE---------------- */

class Solution {
    // Function to return a list of integers visited in snake pattern in a matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // Initialize an ArrayList to store the elements in snake pattern.
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Initialize a boolean variable to track the direction (left to right or right to left).
        boolean dir = true;
        
        // Get the size of the matrix (assuming it's a square matrix).
        int n = matrix.length;
        
        // Loop through the rows of the matrix.
        for (int i = 0; i < n; i++) {
            // Check the direction flag.
            if (dir) {
                // If the direction is left to right, add elements from the current row.
                for (int j = 0; j < n; j++) {
                    ans.add(matrix[i][j]);
                }
                // Change the direction to right to left for the next row.
                dir = false;
            } else {
                // If the direction is right to left, add elements from the current row in reverse order.
                for (int j = n - 1; j >= 0; j--) {
                    ans.add(matrix[i][j]);
                }
                // Change the direction to left to right for the next row.
                dir = true;
            }
        }
        
        // Return the ArrayList containing elements in snake pattern.
        return ans;
    }
}

/*
Time Complexity: O(n*n)
Space Complexity: O(n*n) - for returned arraylist
*/
