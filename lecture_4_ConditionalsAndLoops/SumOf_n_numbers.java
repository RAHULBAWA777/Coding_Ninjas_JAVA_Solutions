package lecture_4_ConditionalsAndLoops;

import java.util.Scanner;

public class SumOf_n_numbers {

	public static void main(String[] args) {
		
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}
}
