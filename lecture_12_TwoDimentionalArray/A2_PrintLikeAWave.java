package lecture_12_TwoDimentionalArray;

import java.util.*;

public class A2_PrintLikeAWave {

	public static int[] main(String[] args) {
		int arr[][] = null;
		int rows = 0;
		int cols = 0;
		int[] ans = new int[rows * cols];
		int index = 0;

		for (int j = 0; j < cols; j++) {
			if (j % 2 == 0) {
				// DOWN
				for (int i = 0; i < rows; i++) {
					ans[index++] = arr[i][j];
				}
			}
			else {
//				UP
				for(int i=rows-1;i>=0;i--) {
					ans[index++]=arr[i][j];
				}
			}
		}
		return ans;
	}

}
