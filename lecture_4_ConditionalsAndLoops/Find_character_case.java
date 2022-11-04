package lecture_4_ConditionalsAndLoops;
//Find Character Case
//
//Write a program to determine whether the entered character is in uppercase or lowercase, or is an invalid character.
//Print
//
// 1 for uppercase
// 0 for lowercase 
//-1 for any other character (special characters or others)
//
//Input format :
//
//Single Character
//
//Output format :
//
//1 or 0 or -1
//
//Sample Input 1 :
//
//v
//
//Sample Output 1 :
//
//0
//
//Sample Input 2 :
//
//V
//
//Sample Output 2 :
//
//1
//
//Sample Input 3 :
//
//#
//
//Sample Output 3 :
//
//-1
//
//
//_____________________________________________________________________________________________________________

import java.util.Scanner;

public class Find_character_case {
public static void main(String[] arg) {
	
	Scanner sc = new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if (ch>=65 && ch<=90)
		System.out.println(1);
	else if(ch>=97 && ch<=122)
		System.out.println(0);
	else
		System.out.println(-1);
}
}
