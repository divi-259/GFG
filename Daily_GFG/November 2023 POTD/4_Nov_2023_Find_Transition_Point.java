/*
Author : Divyanshi Dixit
Date : Nov 4, 2023
Problem : Find Transition Point
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1

Problem Statement: Given a sorted array containing only 0s and 1s, find the transition point, i.e., 
the first index where 1 was observed, and before that, only 0 was observed.

Solution Approach: Traverse the array and find the point where 1 appear for the first time, Binary search can also
be applied to get the transition point.

*/

/* ------------CODE---------------- */
class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        
        int point = -1;
        
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid]==1) {
                if(mid==0 || arr[mid-1]==0)
                return mid;
                else high=mid-1;
            }
            else if(arr[mid]==0) {
                low = mid+1;
            }
        }
        
        return point;
    }
}

/*
Time Complexity: O(logn)
Space Complexity: O(1)
*/
