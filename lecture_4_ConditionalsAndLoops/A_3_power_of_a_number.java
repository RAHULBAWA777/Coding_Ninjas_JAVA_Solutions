package lecture_4_ConditionalsAndLoops;
//Find power of a number
//
//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
//Input format :
//
//Two integers x and n (separated by space)
//
//Output Format :
//
//x^n (i.e. x raise to the power n)
//
//Sample Input 1 :
//
// 3 4
//
//Sample Output 1 :
//
//81
//
//Sample Input 2 :
//
// 2 5
//
//Sample Output 2 :
//
//32
//
//__________________________________________________________________

import java.util.Scanner;
public class A_3_power_of_a_number {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int x=sc.nextInt();
	     int p=1;
	     for(int i=1;i<=x;i++) {
	    	 p=p*n;
	     }
	     System.out.println(p);
	}

}
