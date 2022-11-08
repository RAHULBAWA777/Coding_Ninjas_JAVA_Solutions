package lecture_6_Patterns2;
import java.util.Scanner;

public class A4_Odd_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for (int j=0;j<n;j++){
            int i=0+(j*2);
            int l=i;
            for (int p=1;p<=n-j;){
                if (l%2!=0){
                    System.out.print(l);
                    p+=1;
                }
                l+=1;
            }
            int z=0;
            for (int q=0;q<j;){
                if (z%2!=0){
                    System.out.print(z);
                    q+=1;
                }
                z++;
            }
            System.out.println();

        }

	}

}
