package lecture_12_TwoDimentionalArray;

import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][]=new int [rows][cols];
		for(int i =0;i<rows;i++) {
			for (int j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<cols;j++) {
				sum+=arr[i][j];
			}
			System.out.print(sum+" ");
		}

	}

}
