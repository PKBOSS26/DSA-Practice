package Strings.medium;
// title:- 2109. Adding Spaces to a String (leetcode)
// link:- https://leetcode.com/problems/adding-spaces-to-a-string/description/?envType=daily-question&envId=2024-12-03
// difficulty:- medium
// Approach:-
// 1) Use a StringBuilder to construct the result string efficiently.
// 2) Iterate through the string s and insert spaces at the indices specified in the spaces array.

// Time Complexity: O(n + m), where n is the length of the string s and m is the length of spaces.
// Space Complexity: O(n), for the resulting string.

public class Adding_Spaces_to_String {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(new Adding_Spaces_to_String().addSpaces(s, spaces));

        String s2 = "HayThisIsPratikHere";
        int[] spaces2 = {3, 7, 9, 15};
        System.out.println(new Adding_Spaces_to_String().addSpaces(s2, spaces2)); // Expected: "Hello World"

    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0;

        for(int i = 0; i< s.length(); i++){
            //check if the current index matches the space index
            if(spaceIndex < spaces.length && i == spaces[spaceIndex]){
                result.append(" ");
                spaceIndex++;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
