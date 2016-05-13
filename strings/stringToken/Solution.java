import java.io.*;
import java.util.*;



public class Solution {

  
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String pattern = "[A-Za-z]";

        ArrayList<String> words = new ArrayList<String>();

        String currentSubStr = "";
        int i=0;

        // String indexSubStr = s.substring()
        while (i<s.length()) {
            // if the current subStr/char does not match the pattern
                // then add the currentSubStr to the overall array and restart
            String nextSubStr = s.substring(i, i+1);
            // debugging
            // System.out.println("next substr: " + nextSubStr);
            if (nextSubStr.matches(pattern)) {
                currentSubStr += nextSubStr;
            }
            
            if (!nextSubStr.matches(pattern)) {
                if (currentSubStr.length()>0) {
                    words.add(currentSubStr);
                }
                currentSubStr = ""; 
            }
            i++;
        }

        if (currentSubStr.length()>0) {
            words.add(currentSubStr);
        }

        System.out.println(words.size());

        for (String word : words) {
            System.out.println(word);
        }
    }
}
