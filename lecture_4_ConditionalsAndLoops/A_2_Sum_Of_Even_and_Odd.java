package lecture_4_ConditionalsAndLoops;
//Sum of even & odd
//
//Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
//Digits means numbers not the places. That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
//Input format :
//
// Integer N
//
//Output format :
//
//Sum_of_Even_Digits Sum_of_Odd_Digits
//(Print first even sum and then odd sum separated by space)
//
//Sample Input :
//
//1234
//
//Sample Output :
//
//6 4
//
//
//___________________________________________________________________________________________________________________


import java.util.Scanner;
public class A_2_Sum_Of_Even_and_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int temp = num;
		int sum1=0;
		int sum2=0;
		while (temp!=0) {
			int rem=temp%10;
			if(rem%2==0)
				sum1=sum1+rem;
			if(rem%2!=0)
				sum2=sum2+rem;
			
			temp=temp/10;
		}
		System.out.println(sum1+ " " +sum2);
	}

}
