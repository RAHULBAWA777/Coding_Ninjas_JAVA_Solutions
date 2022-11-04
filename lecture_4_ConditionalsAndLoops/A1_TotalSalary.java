package lecture_4_ConditionalsAndLoops;
//Total Salary
//
//Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//
//    totalSalary = basic + hra + da + allow – pf
//
//where :
//
//hra   = 20% of basic
//da    = 50% of basic
//allow = 1700 if grade = ‘A’
//allow = 1500 if grade = ‘B’
//allow = 1300 if grade = ‘C' or any other character
//pf    = 11% of basic.
//
//Round off the total salary and then print the integral part only.
//Input format :
//
//Basic salary & Grade (separated by space)
//
//Output Format :
//
//Total Salary
//
//Sample Input 1 :
//
//10000 A
//
//Sample Output 1 :
//
//17600
//
//Sample Input 2 :
//
//4567 B
//
//Sample Output 2 :
//
//8762
//
//
//____________________________________________________________________________________________________________
import java.util.Scanner;
public class A1_TotalSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ts=sc.nextDouble();
		double hra=ts*20/100;
		double da=ts*50/100;
		double pf=ts*11/100;
		
		char grade=sc.next().charAt(0);
		Character.toUpperCase(grade);
		int allow=0;
		if(grade=='A')
			allow=1700;
		else if(grade=='B')
			allow=1500;
		else if(grade>='C' && grade<='Z')
			allow=1300;
		
		Double Salary = (double)ts+hra+da+allow-pf;
		double TotalSalary = ts-(int)ts;
		 if(TotalSalary<0.5)
             System.out.println((int)ts);
         else 
             System.out.println((int)ts+1);
	}

}
