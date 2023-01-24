import java.util.Scanner;
/*
Question : Take the input from user and print the number pattern i.e, continuing to each other.
 */
public class Main {
    public static void main(String[] args) {
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE COLUMN SIZE :");
        a = sc.nextInt();
        System.out.println("ENTER THE SIZE OF ROW :");
        b = sc.nextInt();
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= b; j++){
                if ((i + j ) % 2 == 0){
                    System.out.print("1");
                }else
                    System.out.print("2");
            }
            System.out.println();
        }
    }
}