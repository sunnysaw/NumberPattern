/*
Question : Take input from user and print triangular pattern of number.
 */
import java.util.Scanner;
public class TriangularNumberPattern {
    public static void main(String[] args) {
        int a , sum , add = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF COLUMN :");
        a = sc.nextInt();
        System.out.println("PRINTING THE FINAL VALUE : ");
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                sum = add + j;
                System.out.print(sum);
            }
            System.out.println();
        }
    }
}
