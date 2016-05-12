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
            // reduce(a);

            int inducted = induct(a);
            // return minimum of stringLengths
            // for ()
            // System.out.println(stringLengths.toString());

            // int minimum = stringLengths.get(0);
            // if (stringLengths.size()>1) {
            //     for (int m=0; m<stringLengths.size()-1; m++) {
            //         if (stringLengths.get(m)<minimum) {
            //             minimum = stringLengths.get(m);
            //         }
            //     }
            // }
            // return minimum;
            return inducted;
        }


        public int induct(String toInduct) {
            HashMap<String, Integer> charCounts = new HashMap<String, Integer>();

            for (int i=0; i<toInduct.length(); i++) {
                // add to charCounts each character
                // if character does not exist,
                    // charCount of character = 1
                // else
                    // ++ the count of that character
                // (charCounts.get(currentChar)==null) ? charCounts.put(currentChar, 1) : charCounts.put(currentChar, charCounts.get(currentChar)+1);
                // char = one character long String
                String currentChar = toInduct.substring(i, i+1);
                if (charCounts.get(currentChar)==null) {
                    charCounts.put(currentChar, 1);
                } else {
                    charCounts.put(currentChar, charCounts.get(currentChar)+1);
                }
            }

            // if size of charCounts = 1
            // then return the charCount
            // if all odd, or all even, return 2
            // else return 3
            // if (charCounts.size()==1) {
            //     return charCounts.get(0);
            // }
            // // whether all same, or all false
            // boolean sameType = true;
            // boolean allOdds = true;

            // System.out.println(charCounts.toString());

            // if (charCounts.get(0)%2==0) {
            //     allOdds = false;
            //     // hence, evenType
            // }

            // if (allOdds) {
            //     // check if all odds
            //     for (int c=0; c<charCounts.size(); c++) {
            //         if (charCounts.get(c)%2==0) {
            //             // there is an even present
            //             return 1;
            //         }
            //     }
            // } else {
            //     // check if all evens
            //     for (int c=0; c<charCounts.size(); c++) {
            //         if (charCounts.get(c)%2!=0) {
            //             // there is an odd present
            //             return 1;
            //         }
            //     }
            // }
            // if only one char, then return the value
            // Collection<Integer> values = charCounts.values();
            // if (charCounts.size()==1) {
            //     // will give a set of one value, return the value
            //     return values(0);
            // }
            // Iterator charCountsIt = charCounts.entrySet().iterator();

            // System.out.println("next in Iterator " + charCountsIt.next());

            // int firstLen = charCounts.get((Map.Entry)charCountsIt.next().getKey());
            // if (charCounts.size()==1) {
            //     return firstLen;
            // }

            // boolean allOdds = true;
            
            // if (firstLen%2==0) {
            //     allOdds = false;
            //     // hence, allEven
            // }


            // while(charCountsIt.hasNext()) {
            //     if (allOdds) {
            //         if (charCounts.get(charCountsIt.next())%2==0) {
            //             return 1;
            //         }
            //     } else {
            //         if (charCounts.get(charCountsIt.next())%2!=0) {
            //             return 1;
            //         }
            //     }
            // }
            if (charCounts.size()==1) {
                return toInduct.length();
            }

            int firstValue = charCounts.get(charCounts.keySet().toArray()[0]);
            // boolean allOdds = true;
            // if (firstValue%2!=0)
                // true
            // else
                // false
            boolean allOdds = (firstValue%2!=0);


            for (String key : charCounts.keySet()) {
                // if (charCounts.get(key))
                if (allOdds) {
                    if (charCounts.get(key)%2==0) {
                        return 1;
                    }
                } else {
                    if (charCounts.get(key)%2!=0) {
                        return 1;
                    }
                }
            }


            return 2;
        }

    //     public void reduce(String toReduce) {
    //         if (toReduce.length()==1) {
    //             stringLengths.add(toReduce.length());
    //             return;
    //         }
    //         // base case: add length of toReduce to stringLengths
    //         boolean reducable = false;
    //         // iterate through a, find all possible replacements
    //         // replacements: ab|ba -> b, ac|ca -> c, cb|bc -> a 

    //         // for each replacements, recursively call String reduction, until you hit base case

    //         for (int i=0; i<toReduce.length()-1; i++) {
    //             // if (toReduce.length()==1) {
    //             //     stringLengths.add(toReduce.length());
    //             //     break;
    //             // }
    //             String nextTwoChars = toReduce.substring(i, i+2);
    //             //System.out.println("ntc = " + nextTwoChars + ", string = " + toReduce);
    //             if (nextTwoChars.equals("ab")||nextTwoChars.equals("ba")) {
    //                 //System.out.println(toReduce + " ab, recognizing? ");
    //                 reducable = true;
    //                 String reduced = "c" + toReduce.substring(i+2, toReduce.length());
    //                 if ((i+2)==toReduce.length()) {
    //                     reduced = toReduce.substring(0, i) + "c";
    //                 }
    //                 reduce(reduced);
    //             }
    //             if (nextTwoChars.equals("ac")||nextTwoChars.equals("ca")) {
    //                 reducable = true;
    //                 String reduced = "b" + toReduce.substring(i+2, toReduce.length());
    //                 if ((i+2)==toReduce.length()) {
    //                     reduced = toReduce.substring(0, i) + "b";
    //                 }
    //                 reduce(reduced);
                    
    //             }
    //             if (nextTwoChars.equals("bc")||nextTwoChars.equals("cb")) {
    //                 reducable = true;
    //                 String reduced = "a" + toReduce.substring(i+2, toReduce.length());
    //                 if ((i+2)==toReduce.length()) {
    //                     reduced = toReduce.substring(0, i) + "a";
    //                 }
    //                 reduce(reduced);
    //             }
    //         }

    //         if (reducable==false) {
    //             // debugging print
    //             //System.out.println(toReduce + " = the resultant String ");

    //             stringLengths.add(toReduce.length());

    //         }

            
    //     }
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
