/*
Author : Divyanshi Dixit
Date : Nov 14, 2023
Problem : Check if strings are rotations of each other or not

Difficulty : Basic

Problem Link: https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1

Problem Statement: You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.

Note: The characters in the strings are in lowercase.

Solution Approach: Create a new string from s1 by appending it two times, and check if the s2 is a substring of this new string or not.

*/

/* ------------CODE---------------- */
class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        String common = s1+s1;
        
        if(common.contains(s2))
            return true;
        
        else
            return false;
    }
    
}

/*
Time Complexity: O(m) - m could be length of any string
Space Complexity: O(m)
*/
