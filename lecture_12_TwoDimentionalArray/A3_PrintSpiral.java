package lecture_12_TwoDimentionalArray;

public class A3_PrintSpiral {

	public static void spiral(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		// Setting the boundaries of the matrix.
		int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

		// setting the direction in which array has to be traversed.
		int dir = 1;

		while (top <= bottom && left <= right) {
			if (dir == 1) { // LEFT -> RIGHT
				for (int i = left; i <= right; ++i) {
					System.out.print(arr[top][i] + " ");
				}
				// FIRST ROW traversed
				// move down to the next row.
				++top;
				dir = 2;
			} else if (dir == 2) { // TOP -> BOTTOM
				for (int i = top; i <= bottom; ++i) {
					System.out.print(arr[i][right] + " ");
				}
				// LAST COLUMN traversed
				// move LEFT to the PREVIOUS column.
				--right;
				dir = 3;
			} else if (dir == 3) { // LEFT -> RIGHT
				for (int i = right; i >= left; --i) {
					System.out.print(arr[bottom][i] + " ");
				}
				// last ROW traversed
				// move up to the previous row.
				--bottom;
				dir = 4;
			} else if (dir == 4) { // TOP -> BOTTOM
				for (int i = bottom; i >= top; --i) {
					System.out.print(arr[i][left] + " ");
				}
				// first COLUMN traversed
				// move right to the next column.
				++left;
				dir = 1;
			}
		}
	}

	public static void main(String[] args) {
		// Driver code
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		spiral(a);
	}
}
