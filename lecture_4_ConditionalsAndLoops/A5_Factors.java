package lecture_4_ConditionalsAndLoops;

import java.util.Scanner;

public class A5_Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			for (int i = 2; i < n; ++i) {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}


