package lecture_5_Patterns1;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int m =i;
			for(int j=1;j<=i;j++) {
				System.out.print(m);
				m--;
			}
			System.out.println();
		}
		
	}

}
