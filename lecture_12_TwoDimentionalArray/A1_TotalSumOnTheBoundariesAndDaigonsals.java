package lecture_12_TwoDimentionalArray;

import java.util.*;

public class A1_TotalSumOnTheBoundariesAndDaigonsals {
	public static int N = 4;

	// FUNCTION TO FIND BOUNDARIES AND SUM
	static void daiBounSum(int arr[][]) {
		int sum = 0;
		// Traversing

		// Loop from i to N-1 for rows
		for (int i = 0; i < N; i++) {
			// Loop from j = N-1 for columns
			for (int j = 0; j < N; j++) {

				// Condition for diagonal
				if (i == j || (i + j) == N - 1) {
					sum += arr[i][j];
				}

				// Condition for Boundary
				else if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
					sum += arr[i][j];
				}
			}
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		daiBounSum(arr);
	}

}
