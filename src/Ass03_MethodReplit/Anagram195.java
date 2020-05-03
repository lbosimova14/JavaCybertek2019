package Ass03_MethodReplit;

import java.util.Arrays;

public class Anagram195 {
// Ididnt understant copied from stackOverflow
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent"));

	}

    public static boolean isAnagram(String word1, String word2){
        char[] Arr1 = word1.toLowerCase().toCharArray(), Arr2 = word2.toLowerCase().toCharArray();
        if (Arr1.length != Arr2.length)
            return false;
        int[] counts = new int[26]; // An array to hold the number of occurrences of each character
        for (int i = 0; i < Arr1.length; i++){
            counts[Arr1[i]-97]++;  // Increment the count of the character at i
            counts[Arr2[i]-97]--;  // Decrement the count of the character at i
        }
        // If the strings are anagrams, the counts array will be full of zeros
        for (int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }
}

/*isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false*/

/* copied from Hakun slack,without using array:
 * public static boolean isAnagram(String word1, String word2) {
        
        word1 = word1.replaceAll(" ", "").toLowerCase();
        word2 = word2.replaceAll(" ", "").toLowerCase();
        
        if (word1.length() == word2.length()) {
            for (int j = 0; j < word1.length(); j++) {
                for(int i = 0; i < word2.length(); i++) {
                    if (word1.substring(j, j+1).equals(word2.substring(i, i+1)))
                        word2 = word2.replace(word2.substring(i, i+1), "");   
                }
            }
        }else
            return false;
        
        return word2.length() == 0;
    }
 * 
 */
