/*
Author : Divyanshi Dixit
Date : Nov 1, 2023
Problem : Frequencies of Limited Range Array Elements
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1 

Problem Statement: Given an array arr[] of N positive integers which can contain integers from 1 to P 
where elements can be repeated or can be absent from the array. 
Your task is to count the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place. 

Solution Approach: 
Using a hashmap to count the frequency and then traversing the array again to save the freq of i at arr[i]
*/

/* ------------CODE---------------- */

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int P)
    {
        // code here
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0; i<n; i++) {
            if(hmap.containsKey(i+1))
            arr[i] = hmap.get(i+1);
            else arr[i] = 0;
        }
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(n) - for hashmap
*/
