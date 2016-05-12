// Input Format

// Two strings, the first being AA and the second being BB. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

// Output Format

// There are three lines of output: 
// For the first line, sum the lengths of AA and BB. 
// For the second line, write Yes if AA is lexicographically larger than BB or No if it is not. 
// For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.

// Sample Input

//  hello
//  java
// Sample Output

// 9
// No
// Hello Java
// Explanation

// String AA is "hello" and BB is "java". 
// AA has a length of 55, and BB has a length of 44; the sum of their lengths is 99. 
// When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, AA is not larger than BB and the answer is No. 
// When you capitalize the first letter of both AA and BB and then print them separated by a space, you get "Hello Java".

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int addedLength = A.length() + B.length();
        
        System.out.println(addedLength);
        
        int larger = A.compareTo(B);
        System.out.println( larger>0 ? "Yes" : "No");

        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1, B.length()));

    }
}
