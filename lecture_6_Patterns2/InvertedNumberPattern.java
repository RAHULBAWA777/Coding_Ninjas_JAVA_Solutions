package lecture_6_Patterns2;

//Code Inverted Number Pattern
//
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//
//4444
//333
//22
//1
//
//Input format :
//
//Integer N (Total no. of rows)
//
//Output format :
//
//Pattern in N lines
//
//Sample Input :
//
//5
//
//Sample Output :
//
//55555 
//4444
//333
//22
//1
//
//________________________________________________________________________________________________________________

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				int x =n-i+1;
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
