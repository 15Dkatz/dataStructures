// Sample Input:

// 3  
// cab  
// bcab  
// ccccc
// Sample Output:

// 2  
// 1  
// 5

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /* Head ends here */
    

    static class StringReducer {

        ArrayList<Integer> stringLengths = new ArrayList<Integer>();

        public int stringReduction(String a) {
            reduce(a);
            // return minimum of stringLengths
            // for ()
            System.out.println(stringLengths.toString());

            int minimum = stringLengths.get(0);
            if (stringLengths.size()>1) {
                for (int m=0; m<stringLengths.size()-1; m++) {
                    if (stringLengths.get(m)<minimum) {
                        minimum = stringLengths.get(m);
                    }
                }
            }
            return minimum;
        }

        public void reduce(String toReduce) {
            if (toReduce.length()==1) {
                stringLengths.add(toReduce.length());
                return;
            }
            // base case: add length of toReduce to stringLengths
            boolean reducable = false;
            // iterate through a, find all possible replacements
            // replacements: ab|ba -> b, ac|ca -> c, cb|bc -> a 

            // for each replacements, recursively call String reduction, until you hit base case

            for (int i=0; i<toReduce.length()-1; i++) {
                // if (toReduce.length()==1) {
                //     stringLengths.add(toReduce.length());
                //     break;
                // }
                String nextTwoChars = toReduce.substring(i, i+2);
                //System.out.println("ntc = " + nextTwoChars + ", string = " + toReduce);
                if (nextTwoChars.equals("ab")||nextTwoChars.equals("ba")) {
                    //System.out.println(toReduce + " ab, recognizing? ");
                    reducable = true;
                    String reduced = "c" + toReduce.substring(i+2, toReduce.length());
                    if ((i+2)==toReduce.length()) {
                        reduced = toReduce.substring(0, i) + "c";
                    }
                    reduce(reduced);
                }
                if (nextTwoChars.equals("ac")||nextTwoChars.equals("ca")) {
                    reducable = true;
                    String reduced = "b" + toReduce.substring(i+2, toReduce.length());
                    if ((i+2)==toReduce.length()) {
                        reduced = toReduce.substring(0, i) + "b";
                    }
                    reduce(reduced);
                    
                }
                if (nextTwoChars.equals("bc")||nextTwoChars.equals("cb")) {
                    reducable = true;
                    String reduced = "a" + toReduce.substring(i+2, toReduce.length());
                    if ((i+2)==toReduce.length()) {
                        reduced = toReduce.substring(0, i) + "a";
                    }
                    reduce(reduced);
                }
            }

            if (reducable==false) {
                // debugging print
                //System.out.println(toReduce + " = the resultant String ");

                stringLengths.add(toReduce.length());

            }

            
        }
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            StringReducer reducer = new StringReducer();
            res = reducer.stringReduction(_a);
            System.out.println(res);
        }
    }
}
