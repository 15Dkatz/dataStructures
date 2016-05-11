// Input Format

// The first line contains an integer, NN (the number of integers in AA). 
// The second line contains NN space-separated integers describing AA.

// Constraints

// 1≤N≤1031≤N≤103
// 1≤Ai≤104, where Ai is the ith integer in A1≤Ai≤104, where Ai is the ith integer in A
// Output Format

// Print all NN integers in AA in reverse order as a single line of space-separated integers.

// Sample Input

// 4
// 1 4 3 2
// Sample Output

// 2 3 4 1

// Ask: what kind of array is this, an integer array?


import java.io.*;
import java.util.*;

public class arrayDs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();

		int[] baseArray = new int[arraySize];

		for (int i=0; i<arraySize; i++) {
			baseArray[i] = scanner.nextInt();
		}

		scanner.close();

		// print in reverse order
		for (int p=arraySize-1; p>=0; p--) {
			System.out.print(baseArray[p] + " ");
		}
	}
}