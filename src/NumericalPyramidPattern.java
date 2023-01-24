/*
Question : Take input from user and print the pyramid pattern of number.
 */
import java.util.Scanner;
public class NumericalPyramidPattern {
    public static void main(String[] args) {
        int a, sum, add =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF COLUMN :");
        a = sc.nextInt();
        System.out.println("NOW,PRINTING THE FINAL RESULT :");
        for (int i = 1; i <= a; i++){
            for (int j = i; j <= a; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2* i-1; k++){
                sum = add + k;
                System.out.print(sum);
            }
            System.out.println();
        }

    }
}
