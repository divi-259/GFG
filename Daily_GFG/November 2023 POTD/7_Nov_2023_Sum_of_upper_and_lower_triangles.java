/*
Author : Divyanshi Dixit
Date : Nov 7, 2023
Problem : Sum of upper and lower triangles
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1

Problem Statement: Given a square matrix of size N*N, 
print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. 
The lower triangle consists of elements on the diagonal and below it. 

Solution Approach: 
The code defines a sumTriangles function that takes a square matrix and its size (n) as input. 
It initializes variables sumUp and sumDown to store the sums of the upper and lower triangles of the matrix,
respectively. 
The function then iterates through the rows and columns of the matrix, 
identifying elements belonging to the upper and lower triangles based on their positions. 
Diagonal elements are counted in both triangles. Finally, it stores the sum values in an ArrayList and returns it.

The approach involves separately calculating the sum of the upper and lower triangles by traversing the matrix and considering the position of each element in relation to the main diagonal.
*/

/* ------------CODE---------------- */

class Solution {
    // Function to return the sum of the upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        // Initialize variables to store the sum of upper and lower triangles.
        int sumUp = 0;  // Sum of upper triangle elements
        int sumDown = 0;  // Sum of lower triangle elements
        
        // Loop through the rows and columns of the matrix.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Diagonal elements belong to both upper and lower triangles.
                if (i == j) {
                    sumUp += matrix[i][j];  // Add diagonal element to the upper triangle sum
                    sumDown += matrix[i][j];  // Add diagonal element to the lower triangle sum
                }
                // Elements above the diagonal belong to the upper triangle.
                if (i < j) {
                    sumUp += matrix[i][j];  // Add element to the upper triangle sum
                }
                // Elements below the diagonal belong to the lower triangle.
                if (i > j) {
                    sumDown += matrix[i][j];  // Add element to the lower triangle sum
                }
            }
        }
        
        // Create an ArrayList to store the sum values.
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(sumUp);  // Add the sum of the upper triangle to the list.
        ans.add(sumDown);  // Add the sum of the lower triangle to the list.
        
        // Return the ArrayList containing sums of upper and lower triangles.
        return ans;
    }
}

/*
Time Complexity: O(m*n)
Space Complexity: O(1)
*/
