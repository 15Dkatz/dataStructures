
// Submissions
// Leaderboard
// Discussions
// Editorial
// Given a string, find out the lexicographically smallest and largest substring of length k.

// [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

// Input Format

// First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

// Output Format

// In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

// Sample Input

// welcometojava
// 3
// Sample Output

// ava
// wel
// Explanation

// Here is the list of all substrings of length 3:

// wel
// elc
// lco
// com
// ome
// met
// eto
// toj
// oja
// jav
// ava

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // create an array of strings of the length substring
        // populate the array with all possible substrings
        Scanner scanner = new Scanner(System.in);
        String originalStr = scanner.next();
        int substringLength = scanner.nextInt();

        int arrLength = originalStr.length()-substringLength+1;
        String[] substringsArr = new String[arrLength];
        for (int i=0; i<arrLength; i++) {
        	String nextSubstring = originalStr.substring(i, i+substringLength);
        	substringsArr[i] = nextSubstring;
        }
        // call array.sort method
        // println first value, and println last value
        Arrays.sort(substringsArr);

        System.out.println(substringsArr[0]);
        System.out.println(substringsArr[arrLength-1]);

    }
}