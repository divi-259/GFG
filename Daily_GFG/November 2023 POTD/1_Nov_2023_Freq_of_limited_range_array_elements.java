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
Using a hashmap to count the frequency and then traversing the array again to save the freq of i at arr[i].
Alternate approach -  The modulo operation helps identify the original value of each element, and (n+1) is added to the corresponding index to update the count. Finally, 
the array elements are divided by (n+1) to get the frequency count.
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

    // Another solution with O(1) time complexity 
    public static void frequencyCount(int arr[], int n, int P)
{
    // In this function, we're modifying the input array 'arr' to count the frequency of numbers.

    // First, we iterate through the array to handle values greater than 'n'.
    for (int i = 0; i < n; i++) {
        if (arr[i] > n)
            arr[i] = 0; // Values greater than 'n' don't have an index.
    }

    // Next, we iterate through the array to update the count of each element.
    for (int i = 0; i < n; i++) {
        if (arr[i] % (n + 1) > 0) {
            // We use modulo to find the original value of the element
            // and add (n+1) to the corresponding index to increment its count.
            arr[(arr[i] % (n + 1)) - 1] += (n + 1);
        }
    }

    // Finally, we divide each element by (n+1) to get the frequency count.
    for (int i = 0; i < n; i++) {
        arr[i] = arr[i] / (n + 1);
    }
}

}
/*
Time Complexity: O(n)
Space Complexity: O(n) - for hashmap
*/
