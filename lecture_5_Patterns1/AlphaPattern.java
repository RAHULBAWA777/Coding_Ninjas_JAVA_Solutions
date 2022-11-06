package lecture_5_Patterns1;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c=65;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		
	}

}
