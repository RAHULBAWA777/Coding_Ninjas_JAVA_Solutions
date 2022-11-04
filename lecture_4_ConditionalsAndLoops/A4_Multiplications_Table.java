package lecture_4_ConditionalsAndLoops;
import java.util.Scanner;

public class A4_Multiplications_Table {
	public static void main(String[] arg) {

		int tab;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			tab = i * n;
			System.out.println(tab);
		}
	}
}
