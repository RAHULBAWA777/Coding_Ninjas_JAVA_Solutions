package lecture_6_Patterns2;

import java.util.Scanner;

public class DaimondOfStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	
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
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int m = n; m >= i; m--) {
				System.out.print("*");
			}
			for (int o = n-1; o >= i; o--) {
				System.out.print("*");
			}
			System.out.println();
	}
		
	}

}
