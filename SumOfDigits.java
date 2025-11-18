import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The sum of digits is :" +sumOfNumbers(a));
    }

    public static int sumOfNumbers(int a){
        int sum = 0;
        while(a!=0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }
}
