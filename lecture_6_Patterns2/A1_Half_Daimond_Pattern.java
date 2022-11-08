package lecture_6_Patterns2;

import java.util.Scanner;

public class A1_Half_Daimond_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("*");
//		           Loop 1
		for (int i = 1; i <= n; i++) {
			System.out.print("*");

			for (int p = 1; p <= i; p++) {
				System.out.print(p);
			}
			for (int j = 1; j < i; j++) {
				System.out.print(i - j);
			}
			System.out.println("*");
		}

//		           Loop 2
		for (int x = 1; x < n; x++) {
			System.out.print("*");

			for (int r = 1; r <= n - x; r++) {
				System.out.print(r);
			}
			for (int e = 1; e < n - x; e++) {
				System.out.print(n - e - x);

			}
			System.out.println("*");
		}
		System.out.print("*");

	}

}
