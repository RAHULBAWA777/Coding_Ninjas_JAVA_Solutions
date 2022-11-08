package lecture_6_Patterns2;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			int k=i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
			k++;
			}
			k=k-2;
			for (int l = 1; l <= i-1; l++) {
				System.out.print(k);
				k--;
			}
			System.out.println();
	}
	}
}
