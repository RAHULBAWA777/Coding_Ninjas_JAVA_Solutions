package lecture_6_Patterns2;

import java.util.Scanner;

public class MirrorNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
		}
		System.out.println();
	}
}
