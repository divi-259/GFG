/*
Author : Divyanshi Dixit
Date : Oct 29, 2023
Problem : Check whether kth bit is set or not
Difficulty : Easy

Problem Link: https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1 

Problem Statement: Given a number N and a bit number K, check if Kth index bit of N is set or not. 
A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
Note: Index is starting from 0. 
You just need to return true or false, driver code will take care of printing "Yes" and "No".

Solution Approach: Left shift 1 for k digits and find the logical AND with n, if it is a number greater than 0, means kth
bit was set.

*/

/* ------------CODE---------------- */

class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        return (n & (1 << k) ) > 0 ? true : false;
    }
    
}
/*
Time Complexity: O(1)
Space Complexity: O(1)
*/
