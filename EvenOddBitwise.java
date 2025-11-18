import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int a = sc.nextInt();
        if ((a & 1) == 0){
            System.out.println("Your number is an even number");
        } else {
            System.out.println("Your number is an odd number");
        }
    }
}
