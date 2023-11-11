/*
Author : Divyanshi Dixit
Date : Nov 11, 2023
Problem : Isomorphic Strings
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1

Problem Statement: Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.

If the characters in str1 can be changed to get str2, then two strings, str1 and str2, 
are isomorphic. 
A character must be completely swapped out for another character while maintaining the order of the characters. 
A character may map to itself, 
but no two characters may map to the same character.

Solution Approach: 
- Use two HashMaps to store mappings for characters in both strings.
- Check if the lengths of both strings are equal.
- Iterate through each character in the strings.
- Check and create mappings for both strings.
- If the loop completes, strings are isomorphic.
*/

/* ------------CODE---------------- */

class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1, String str2) {
        // HashMaps to store mappings for both strings.
        HashMap<Character, Character> mapping1 = new HashMap<>();
        HashMap<Character, Character> mapping2 = new HashMap<>();

        // Check if the lengths of both strings are equal.
        if (str1.length() != str2.length())
            return false;

        // Iterate through each character in the strings.
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            // Check mapping for the first string.
            if (mapping1.containsKey(ch1)) {
                // If the mapping is different, strings are not isomorphic.
                if (mapping1.get(ch1) != ch2)
                    return false;
                else
                    continue;
            } else {
                // Create a new mapping for the first string.
                mapping1.put(ch1, ch2);
            }

            // Check mapping for the second string.
            // Opposite mapping is needed for cases like - "saa" and "sss".
            if (mapping2.containsKey(ch2)) {
                // If the mapping is different, strings are not isomorphic.
                if (mapping2.get(ch2) != ch1)
                    return false;
                else
                    continue;
            } else {
                // Create a new mapping for the second string.
                mapping2.put(ch2, ch1);
            }
        }

        // If the loop completes, strings are isomorphic.
        return true;
    }
}

/*
Time Complexity: O(n) - the length of any of the given string
Space Complexity: O(256) - to store in the hashmap
*/
