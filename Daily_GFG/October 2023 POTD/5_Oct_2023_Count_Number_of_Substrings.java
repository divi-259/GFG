/*
Problem Link: https://practice.geeksforgeeks.org/problems/count-number-of-substrings4528/1 

Problem Statement: Given a string of lowercase alphabets, 
count all possible substrings (not necessarily distinct) that have exactly k distinct characters. 

Solution Approach: 
It is easier to count the substrings with at most k chars, then at most k-1 chars (with the help of same funtion),
and then subtracting to get the exact answer. It will be difficult and complicated to write logic for exact k chars substring count.
The logic for counting distinct characters and substrings is separated, making each part of the code more straightforward and less error-prone.
In practice, code readability and maintainability are often more important than micro-optimizations.


*/

/* ------------CODE---------------- */
class Solution {
    long substrCount(String s, int k) {
        // Initialize the answer variable.
        long ans = helper(s, k) - helper(s, k - 1);
        return ans;
    }

    long helper(String s, int k) {
        // Create an array to store character frequency.
        char freq[] = new char[26];

        int i = 0;          // Left pointer of the sliding window.
        int j = 0;          // Right pointer of the sliding window.
        long count = 0;     // Count of valid substrings.
        int n = s.length(); // Length of the input string.
        int distinct = 0;   // Count of distinct characters in the current window.

        while (j < n) {
            char ch = s.charAt(j);
            freq[ch - 'a']++; // Increment the frequency of the current character.

            if (freq[ch - 'a'] == 1) {
                distinct++; // If the frequency is 1, it's a new distinct character.
            }

            while (distinct > k) {
                // If there are more distinct characters than 'k' in the window,
                // move the left pointer to remove characters from the start.
                freq[s.charAt(i) - 'a']--; // Decrement the frequency.
                
                if (freq[s.charAt(i) - 'a'] == 0) {
                    distinct--; // If the frequency becomes 0, it's no longer distinct.
                }

                i++; // Move the left pointer to the right.
            }

            // Count the substrings that meet the criteria and update 'count'.
            count += j - i + 1;

            j++; // Move the right pointer to the right to expand the window.
        }

        return count;
    }
}


/*
Time Complexity: O(n) - where n is the string length
Space Complexity: O(26) - we are not using any extra space
*/
