package lecture_6_Patterns2;
import java.util.Scanner;
public class A3_Sum_Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++) {
            int x=2;
            System.out.print(1);
            for (int k=1;k<i;k++){
                System.out.print("+"+n);
                x++;
            }

            int sum = (i * i + i) / 2;
            System.out.println("="+sum);
        }
	}

	}


