// Sample Input

// 4
// alpha_naheed
// xahidbuffon
// nagib@007
// 123Swakkhar
// Sample Output

// Valid
// Valid
// Invalid
// Invalid

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String username = in.nextLine();
         //String pattern = Complete this line in the editable area below  
         String pattern = "^([a-zA-Z])([a-zA-Z_0-9]){7,29}$";


         Pattern r = Pattern.compile(pattern);
         Matcher m = r.matcher(username);
          
         if (m.find( )) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid");
         }
         testCases--;
      }
   }
}
