/*
Author : Divyanshi Dixit
Date : Nov 15, 2023
Problem : Better Sting
Difficulty : Hard

Problem Link: https://www.geeksforgeeks.org/problems/better-string/1

Problem Statement: Given a pair of strings of equal lengths, Geek wants to find the better string. The better string is the string having more number of distinct subsequences.
If both the strings have equal count of distinct subsequence then return str1.

Solution Approach: TBD

*/

/* ------------CODE---------------- */

class Solution {
    // Function to calculate the value for each character in the string
    private static int solve(String s) {
        int count = 1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // If the character is not present in the map, add it with the current count value
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), count);
                count *= 2;
            } else {
                // If the character is already present, update the count value
                int temp = map.get(s.charAt(i));
                map.put(s.charAt(i), count);
                count = count * 2 - temp;
            }
        }
        return count;
    }

    // Function to compare two strings based on their calculated values
    public static String betterString(String str1, String str2) {
        int first = solve(str1);
        int second = solve(str2);

        // Compare the values and return the string with the higher value
        if (first > second) {
            return str1;
        } else if (second > first) {
            return str2;
        } else {
            // If both values are equal, return str1
            return str1;
        }
    }
}
/*
Time Complexity: 
Space Complexity: 
*/
