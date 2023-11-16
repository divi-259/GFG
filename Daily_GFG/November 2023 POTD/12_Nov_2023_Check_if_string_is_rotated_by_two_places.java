/*
Author : Divyanshi Dixit
Date : Nov 12, 2023
Problem : Check if string is rotated by two places
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1

Problem Statement: Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

Solution Approach: 
The code checks if one string can be obtained from another by rotating it by exactly 2 places. 
It iterates through the characters of both strings, 
toggling flags to track rotation in both right and left directions. 
If either flag remains intact after the loop, it implies successful rotation, 
and the function returns true; otherwise, it returns false.
*/

/* ------------CODE---------------- */

class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2) {
        // Convert both strings to char arrays for easy manipulation
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int size = a.length;
        
        // Flags to track rotation in both right and left directions
        boolean flagRight = true;
        boolean flagLeft = true;

        // In the same loop, check in both directions and toggle flags accordingly
        for (int i = 0; i < size; i++) {
            // Check for rotation in the right direction
            if (flagRight && a[(i + 2) % size] != b[i]) {
                flagRight = false;
            }

            // Check for rotation in the left direction
            if (flagLeft && a[(size + i - 2) % size] != b[i]) {
                flagLeft = false;
            }
        }

        // If any of the flags is still intact, it means rotation was successful.
        return flagLeft || flagRight;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
