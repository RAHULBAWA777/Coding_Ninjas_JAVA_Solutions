package lecture_12_TwoDimentionalArray;

public class LargestRowOrColumn {
	public static void print(int[][] arr) {
		int max = 0;
		int index = 0;
		boolean isRow = true;

		// CAL MAX ROW
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			if (max < sum) {
				max = sum;
				index = i;
			}
		}
		// CAL MAX col
		for (int j = 0; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][j];
			}
			if (max < sum) {
				max = sum;
				index = j;
				isRow = false;
			}
		}
		if (isRow) {
			System.out.println("row" + index + " " + max);
		} else {
			System.out.println("col" + index + " " + max);

		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 3, 6, 9 }, { 1, 4, 7 }, { 2, 8, 9 } };
		print(arr);

	}

}
