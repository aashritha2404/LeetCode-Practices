import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Greatest Common Divisor is :" +greatestCommonDivisor(a,b));
    }

    public static int greatestCommonDivisor(int a, int b){
        for(int i = 2; i < 1000; i ++){
            if((a%i == 0) && (b%i ==0))
                return i;
        }
        return 0;
    }
}
