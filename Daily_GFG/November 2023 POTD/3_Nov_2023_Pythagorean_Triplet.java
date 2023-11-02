/*
Author : Divyanshi Dixit
Date : Nov 3, 2023
Problem : Pythagorean Triplet
Difficulty : Medium

Problem Link: https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1

Problem Statement: Given an array arr of n integers, 
write a function that returns true if there is a triplet (a, b, c) 
from the array (where a, b, and c are on different indexes) that satisfies a2 + b2 = c2, otherwise return false.

Solution Approach: Suppose there is such a Pythagorean triple, with sides a, b, c, 
where c is the hypotenuse, and a, b, c are integers. Then a = b because the two legs are equal.
Then we get a^2 + a^2 = c^2, which itself is the same as 2a^2 = c^2, 
and taking the square root of both sides gives a√2 = c. However, because an integer multiplied by an irrational number is itself irrational, c is irrational. 
Therefore, c cannot be in a Pythagorean triple because it isn't a positive integer.

This is why we are freely using hashmap key value system without worrying.

*/

/* ------------CODE---------------- */

class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // Create a HashMap to store the squares of the array elements as keys
        // and the corresponding array element as the value.
        HashMap<Long, Integer> hmap = new HashMap<>();
        
        // Iterate through the input array.
        for(int i = 0; i < n; i++) {
            // Calculate the square of the array element and store it as a long.
            long sq = (long)arr[i] * arr[i];
            
            // Put the square as the key and the array element as the value in the HashMap.
            hmap.put(sq, arr[i]);
        }
        
        // Iterate through the keys in the HashMap.
        for(long key1 : hmap.keySet()) {
            // Iterate through the keys again for a second element.
            for(long key2 : hmap.keySet()) {
                // Calculate the sum of the two keys.
                long sum = key1 + key2;
                
                // Check if the HashMap contains the sum as a key.
                if(hmap.containsKey(sum)) {
                    // If the sum exists as a key, it means a Pythagorean triplet exists.
                    return true;
                }
            }
        }
        
        // If no Pythagorean triplet is found, return false.
        return false;
    }
}

/*
Time Complexity: O(n^2) at most
Space Complexity:O(n) - for hashmap 
*/
