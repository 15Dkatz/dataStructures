// In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

// Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

// The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

// Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

// Tags can consist of any printable characters.

// Input Format

// The first line of input contains a single integer,  (the number of lines). 
// The  subsequent lines each contain a line of text.

// Constraints

// Each line contains a maximum of  printable characters.
// The total number of characters in all test cases will not exceed .
// Output Format

// For each line, print the content enclosed within valid tags. 
// If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.

// Sample Input

// 4
// <h1>Nayeem loves counseling</h1>
// <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
// <Amee>safat codes like a ninja</amee>
// <SA premium>Imtiaz has a secret crush</SA premium>
// Sample Output

// Nayeem loves counseling
// Sanjay has no watch
// So wait for a while
// None
// Imtiaz has a secret crush

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// need to account for nested strings.
	public static class tagChecker {

		public String checkLine(String line) {
			// tagMiddle
			System.out.println("line: " + line);

			String tagMiddle = "";
			String middlePrint = "";

			String beginningTag = "";
			boolean beginningTagToParse = false;

			String endTag = "";
			boolean endTagOpen = false;
			boolean endTagToParse = false;

			for (int i=0; i<line.length(); i++) {
				String nextSubStr = line.substring(i, i+1);
				if (nextSubStr.equals("<")) {
					if (!endTagOpen) {
						beginningTagToParse = true;
					}
					if (endTagOpen) {
						endTagToParse = true;
					}

				}
				else if (nextSubStr.equals(">")) {
					// nextSubStr += ">";
					if (!endTagOpen) {
						beginningTagToParse = false;
						endTagOpen = true;
					} 
					else {
						// reset because end of endTag
						beginningTagToParse = true;
						endTagOpen = true;
						endTagOpen = false;
					}
				}

				if (beginningTagToParse) {
					beginningTag += nextSubStr;
				} 

				if (endTagToParse&&!nextSubStr.equals("/")) {
					endTag += nextSubStr;
				}

				if (beginningTagToParse==false&&endTagToParse==false&&!nextSubStr.equals(">")) {
					middlePrint += nextSubStr;
				}

			}

			System.out.println("beginningTag: " + beginningTag + " endTag: " + endTag + " middle: " + middlePrint);
			// return "";
			if (beginningTag.equals(endTag)) {
				return middlePrint.trim();
			} else {
				return "None";
			}
		}

	}

   	public static void main(String[] args){
      
	    Scanner in = new Scanner(System.in);
	    int testCases = Integer.parseInt(in.nextLine());
	    while(testCases>0){
	        String line = in.nextLine();
	         
	            //Write your code here
	        tagChecker lineCheck = new tagChecker();
	        String lineResponse = lineCheck.checkLine(line); 
	        System.out.println(lineResponse);
	    	testCases--;
	    }
    }
}
