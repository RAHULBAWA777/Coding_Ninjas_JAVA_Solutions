package lecture_12_TwoDimentionalArray;

import java.util.Scanner;

public class Pratice_Get_and_print_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();
			
		int input[][] = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("enter element at "+i+" row "+j+" column");
				input [i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
	}
	}
}
