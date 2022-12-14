package lecture_6_Patterns2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		SPACED TRIANGLE
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		NORMAL VERSION
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
