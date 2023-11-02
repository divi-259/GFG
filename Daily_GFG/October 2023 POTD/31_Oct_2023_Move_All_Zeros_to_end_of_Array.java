/*
Author : Divyanshi Dixit
Date : Oct 31, 2023
Problem : Move all zeros to end of array
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

Problem Statement: Given an array arr[] of n positive integers. 
Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. 
Do the mentioned change in the array in-place.

Solution Approach: 

*/

/* ------------CODE---------------- */

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int index = 0;
	    for(int i=0; i<n; i++) {
	        if(arr[i]!=0)
	        arr[index++] = arr[i];
	    }
	    for(int i=index; i<n; i++) {
	        arr[i]=0;
	    }
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
