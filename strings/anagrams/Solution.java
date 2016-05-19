// Sample Input 1

// anagram
// margana
// Sample Output 1:

// Anagrams
// Sample Input 2

// anagramm
// marganaa
// Sample Output 2:

// Not Anagrams


import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
   		String[] aSplit = A.toLowerCase().split("");
   		String[] bSplit = B.toLowerCase().split("");
   		
   		Arrays.sort(aSplit);
   		Arrays.sort(bSplit);
   		
   		String sortedAString = "";
   		String sortedBString = "";
   		
   		for (String aletter : aSplit) {
   			sortedAString += aletter;
   		}
   		
   		for (String bletter : bSplit) {
   			sortedBString += bletter;
   		}

   		//debugging
   		// System.out.println("comparing " + sortedAString + " " + sortedBString);

   		return sortedAString.equals(sortedBString);
   		
   		
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
