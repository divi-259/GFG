/*
Author : Divyanshi Dixit
Date : Nov 10, 2023
Problem : Number Following Pattern
Difficulty : Medium

Problem Link: https://www.geeksforgeeks.org/problems/number-following-a-pattern3126/1?

Problem Statement: Given a pattern containing only I's and D's. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. 
Digits from 1-9 and digits can't repeat.

Solution Approach: 
Maintain a boolean array to track digits from 1 to 9.
Use a StringBuilder to build the result.
Iterate through the given pattern.
For each consecutive occurrence of 'I', start with the minimum available number.
For each consecutive occurrence of 'D', start with the maximum available number.
Append the generated numbers to the StringBuilder.
Return the final result as a String.
*/

/* ------------CODE---------------- */

class Solution {
    // Function to generate the minimum number based on the given pattern.
    static String printMinNumberForPattern(String S) {
        // boolean array to track digits from 1 to 9
        boolean arr[] = new boolean[10];

        // StringBuilder to build the result
        StringBuilder sb = new StringBuilder();

        // flag to track the current state, true if the last pattern was 'D'
        boolean dvalue = false;

        // start generating numbers from 1
        int num = 1;

        // iterate through the given pattern
        for (int i = 0; i < S.length();) {
            int count = 0;
            char ch = S.charAt(i);

            // count the consecutive occurrences of the current pattern
            while (i < S.length() && ch == S.charAt(i)) {
                count++;
                i++;
            }

            if (ch == 'I') {
                // if the pattern is 'I', start with the minimum available number
                // (num+j) for each occurrence
                if (sb.length() != 0)
                    count--;
                for (int j = 0; j < count; j++) {
                    sb.append(num + j);
                }
                num = num + count;
                dvalue = false;
            } else if (ch == 'D') {
                // if the pattern is 'D', start with the maximum available number
                // (num+j) for each occurrence
                for (int j = count; j >= 0; j--) {
                    sb.append(num + j);
                }
                num = num + count + 1;
                dvalue = true;
            }
        }

        // if the last pattern was 'I', append the last number
        if (!dvalue)
            sb.append(num);

        // convert StringBuilder to String and return the result
        return sb.toString();
    }
}

/*
Time Complexity: O(1) as length of the given string is 8 max
Space Complexity: O(1)
*/
