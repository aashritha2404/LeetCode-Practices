import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The result is : " +factorialCalculation(a));
    }

    public static int factorialCalculation(int a){
        int i,product = 1;
        for(i = a; i > 1; i--){
             product *= (i);
        }
        return product;
    }
}
