/*
Author : Divyanshi Dixit
Date : Nov 2, 2023
Problem : Minimum distance between two numbers
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1

Problem Statement: You are given an array a, of n elements.
 Find the minimum index based distance between two distinct elements of the array, x and y. 
Return -1, if either x or y does not exist in the array.

Solution Approach: 
Take two numbers a and b which will track the inices of x and y respectively. Also take the min as MAX INT value.
while traversing the array, whenever you  encounter x, store its index in a, and when encountering y, store its index in b.
keep updating min as well.


*/

/* ------------CODE---------------- */

class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // Initialize variables to keep track of the indices of elements x and y.
        int a = -1; // Index of x
        int b = -1; // Index of y
        int min = Integer.MAX_VALUE; // Initialize the minimum distance to a large value.

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                a = i; // Update the index of x.
            }
            if (arr[i] == y) {
                b = i; // Update the index of y.
            }
            if (a != -1 && b != -1) {
                // Both x and y have been found.
                min = Math.min(Math.abs(a - b), min); // Calculate the minimum distance.
            }
        }

        if (min == Integer.MAX_VALUE || min == 0) {
            // If the minimum distance remains unchanged, x or y is not found, or they are at the same index.
            return -1;
        }

        return min; // Return the minimum distance between x and y.
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
